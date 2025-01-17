package com.itg.examp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.itg.examp.dao.MemberDAO;
import com.itg.examp.dto.MemberDTO;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberDAO dao;
	@Autowired
	MemberService service;
	@PostMapping("/signup")
	public Map<String, Object> signupMember(MemberDTO member) {
		// id 는 4글자이상, 비밀번호는 6글자 이상
		
		System.out.println(member.toString());
		
		boolean ckid = service.checkId(member.getMid());
		boolean ckpw = service.checkPassword(member.getMpw());
		HashMap<String, Object> hm = new HashMap<>();
		if(!ckid) {
			hm.put("message", "아이디를 점검하세요.");
		}
		if(!ckpw) {
			hm.put("message", "비밀번호를 점검하세요.");
		}
		
		int res = dao.signupMember(member);
		if(res == 1) {
			hm.put("message", "회원가입성공");
			hm.put("data", member);
			System.out.println(member.getName()+" 회원 가입 성공");
		}else {
			hm.put("message", "회원가입실패 관리자 문의");
			System.out.println("회원가입 실패");
		}
		return hm;
	}
	@PostMapping("/login")
	public void signin() {}
	@GetMapping("/logout")
	public void signout() {}
	@GetMapping("/listview")
	public void listView() {}
}

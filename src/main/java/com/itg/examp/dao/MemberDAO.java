package com.itg.examp.dao;

import java.util.List;
import java.util.Map;

import com.itg.examp.dto.MemberDTO;

public interface MemberDAO {
	//회원가입 시 데이터 DB 입력
	// 회원 로그인 시 아이디 비밀번호 확인
	// 회원리스트 조회 시 리스트 출력
	public int signupMember(MemberDTO member);
	public MemberDTO signinMember(Map<String, String> data);
	public List<MemberDTO> memberList();
}

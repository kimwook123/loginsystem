package com.itg.examp.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itg.examp.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	SqlSessionTemplate session;
	@Override
	public int signupMember(MemberDTO member) {
		int res = session.insert("memberMapper.signup", member);
		System.out.println("회원가입ADO: "+res);
		return res;
	}
	@Override
	public MemberDTO signinMember(Map<String, String> data) {
		MemberDTO member = session.selectOne("memberMapper.signin", data);
		return member;
	}
	@Override
	public List<MemberDTO> memberList(){
		List<MemberDTO> ll = session.selectList("memberMapper.memberList");
		return ll;
	}
}

// Autowired 란? --> Spring 에서는 의존성 주입을 위해 @Autowired 어노테이션을
// 사용히여 SqlSessionTemplate 긱체를 자동으로 주입할 수 있다.
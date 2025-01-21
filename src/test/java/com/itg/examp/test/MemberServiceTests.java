package com.itg.examp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itg.examp.MemberService;

@SpringBootTest
public class MemberServiceTests {
	//경계값분석 : boundary analize
	String[] rightId;
	String[] wrongId;
	String[] rightPw;
	String[] wrongPw;
	@Autowired
	MemberService ms;
	@BeforeEach
	public void setVariable() {
		rightId = new String[] {"aa","abcde","abcd","a@E3ool","bb#cc"};
		wrongId = new String[] {"aaa","abc","aa","a#c","123"};
		rightPw = new String[] {"123456","214#aa","aa#11aa","a@eegd","44AA@EE"};
		wrongPw = new String[] {"1123677","214#a","#11aa","a@gd","AA@EE"};
	}
	@Test
	public void testPassword() {
		boolean res = false;
		for(int i=0;i<rightId.length;i++) {
			res = ms.checkId(rightId[i]);
			assertEquals(true, res,i+": 올바른 아이디 입니다. :");
		}
		for(int i=0;i<wrongId.length;i++) {
			res = ms.checkId(wrongId[i]);
			assertEquals(false,res,i+": 잘못된 아이디 입니다. :");
		}
	}
	@Test
	public void testId() {
		boolean res = false;
		for(String pw : rightPw) {
			res = ms.checkPassword(pw);
			assertEquals(true, res,": 올바른 비밀번호 입니다. :");
		}
		for(String pw:wrongPw) {
			res = ms.checkPassword(pw);
			assertEquals(false,res,": 잘못된 비밀번호 입니다. :");
		}
	}
}
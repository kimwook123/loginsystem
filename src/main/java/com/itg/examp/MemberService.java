package com.itg.examp;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	public boolean checkPassword(String password) {
		if(password.length()>=6)return true;
		return false;
	}
	public boolean checkId(String mid) {
		if(mid.length()>=4)return true;
		return false;
	}
}

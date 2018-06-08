package com.kkproject.login;

import com.kkproject.main.MainProcessMember;

public class LoginFrm {
	
	public LoginFrm() {
		
		System.out.println("MainFrm() 연결");
		String[] args = {};
		
		new MainProcessMember().main(args);
	}
	
}
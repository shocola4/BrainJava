package com.kkproject.login;

public class LoginProcess {

	LoginView loginView;
	LoginFrm mainfrm;
	JoinFrm joinfram;
	
	public LoginProcess() {
		System.out.println("LoginProcess() 호출");
	}
	
	public void mainFrame() {
		System.out.println("mainFrame() 호출");
		
		loginView.dispose();
		this.mainfrm = new LoginFrm();
	}
	
	public static void main(String[] args) {

		System.out.println("LoginProcess().main 호출");
	
		LoginProcess main = new LoginProcess();
		main.loginView = new LoginView();
		main.loginView.setMain(main);
	}

}

package com.kkproject.main;

public class MainProcessMember {

	MainViewMember mainViewMember;
	
	public MainProcessMember() {
		System.out.println("MainProcess() 호출");
	}
	
	public static void main(String[] args) {

		System.out.println("MainProcess().main 호출");
	
		MainProcessMember main = new MainProcessMember();
		main.mainViewMember = new MainViewMember();
		main.mainViewMember.setMain(main);
		
	}
}

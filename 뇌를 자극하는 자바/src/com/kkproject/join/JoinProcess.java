package com.kkproject.join;

public class JoinProcess {
	
	JoinView joinView;
	
	public JoinProcess() {
		System.out.println("JoinProcess() 호출");
	}

	public static void main(String[] args) {
		
		System.out.println("JoinProcess().main 호출");
		
		JoinProcess join = new JoinProcess();
		join.joinView = new JoinView();
		join.joinView.setJoin(join);
	}

}

package com.kkproject.main;

public class MainProcessBook {

	MainViewBook mainViewBook;
	
	public MainProcessBook() {
		System.out.println("MainProcess() 호출");
	}
	
	public static void main(String[] args) {

		System.out.println("MainProcess().main 호출");
	
		MainProcessBook main = new MainProcessBook();
		main.mainViewBook = new MainViewBook();
		main.mainViewBook.setMain(main);
		
	}
}


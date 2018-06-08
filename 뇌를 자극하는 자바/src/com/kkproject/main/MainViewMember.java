package com.kkproject.main;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/* ---------- MainViewMember 설정 시작 ---------- */

public class  MainViewMember extends JFrame {

	private MainProcessMember main;
	
	private JButton viewBtn;
	private JButton searchBtn;
	private JButton updateBtn;
	private JButton insertBtn;
	private JButton deleteBtn;
	
	private JButton memberBtn;
	private JButton bookBtn;

	ResultSet rs = null;
/* ---------- MainViewMember 설정 끝 ---------- */
	
	public static void main(String[] args) {

	}
	
/* ---------- frame setting 시작 ---------- */
	public MainViewMember() {
		System.out.println("MainViewMember() 생성자");
		
		//setting
		setTitle("Book Management Main");
		setSize(650, 380);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//panel
		JPanel panel = new JPanel();
		placeLoginPanel(panel);
		add(panel);
		setVisible(true);
	}
/* ---------- frame setting 끝 ---------- */

/* ---------- panel setting 시작 ---------- */
	public void placeLoginPanel(JPanel panel) {
		
		panel.setLayout(null);
		Color back = new Color(7, 10, 50);
		panel.setBackground(back);
		
		/* memberManagement 부분 설정 시작 */
		JLabel memberManagement = new JLabel("Member Management");
		memberManagement.setForeground(Color.WHITE);
		memberManagement.setBounds(11, 110, 125, 20);
		panel.add(memberManagement);
		
		viewBtn = new JButton("View");
		viewBtn.setBounds(30, 130, 104, 20);
		panel.add(viewBtn);
		searchBtn = new JButton("Search");
		searchBtn.setBounds(30, 155, 104, 20);
		panel.add(searchBtn);
		updateBtn = new JButton("Update");
		updateBtn.setBounds(30, 180, 104, 20);
		panel.add(updateBtn);
		insertBtn = new JButton("Insert");
		insertBtn.setBounds(30, 205, 104, 20);
		panel.add(insertBtn);
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(30, 230, 104, 20);
		panel.add(deleteBtn);
		/* memberManagement 부분 설정 끝 */
		
		/* Management 부분 설정 시작 */
		JLabel management = new JLabel("Select Management");
		management.setForeground(Color.WHITE);
		management.setBounds(21, 260, 125, 20);
		panel.add(management);
		
		memberBtn = new JButton("Member");
		memberBtn.setBounds(30, 280, 104, 20);
		panel.add(memberBtn);
		bookBtn = new JButton("Book");
		bookBtn.setBounds(30, 305, 104, 20);
		panel.add(bookBtn);
		/* Management 부분 설정 끝 */

		String colNames[] = {"Code", "Name", "PhonNumber"};
		Object data [][] = {{"", "", ""}};
		JTable table = new JTable(data, colNames);
		
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(150, 116, 470, 209);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
	}
/* ---------- panel setting 끝 ---------- */
	
	public void setMain(MainProcessMember main) {
		this.main = main;
	}

}

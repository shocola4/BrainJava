package com.kkproject.join;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.kkproject.jdbc.BookManagementJdbc;

/* ---------- LoginView 설정 시작 ---------- */
public class JoinView extends JFrame {

	private JoinProcess join;
	
	private JTextField aCode;
	private JTextField aPassword;
	private JTextField aName;
	private JButton joinBtn;
	
	ResultSet rs = null;
/* ---------- LoginView 설정 끝 ---------- */
	
	public static void main(String[] args) {

	}
	
/* ---------- LoginView frame setting 시작 ---------- */
	public JoinView() {
		System.out.println("LoginView() 생성자");
		
		//setting
		setTitle("Book Management Join");
		setSize(250, 290);
		setLocation(600, 250);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//panel
		JPanel panel = new JPanel();
		placeLoginPanel(panel);
		add(panel);
		setVisible(true);
	}
/* ---------- LoginView frame setting 끝 ---------- */
	
/* ---------- panel setting 시작 ---------- */
	public void placeLoginPanel(JPanel panel) {
		
		panel.setLayout(null);
		Color back = new Color(7, 10, 50);
		panel.setBackground(back);
		
		JLabel laCode = new JLabel("Number");
		laCode.setForeground(Color.WHITE);
		laCode.setBounds(10, 90, 60, 30);
		
		aCode = new JTextField("");
		aCode.setBounds(75, 90, 150, 30);
		
		JLabel laPassword = new JLabel("Password");
		laPassword.setForeground(Color.WHITE);
		laPassword.setBounds(10, 130, 60, 30);
		
		aPassword = new JTextField("");
		aPassword.setBounds(75, 130, 150, 30);
		
		JLabel laName = new JLabel("Name");
		laName.setForeground(Color.WHITE);
		laName.setBounds(10, 170, 60, 30);
		
		aName = new JTextField("");
		aName.setBounds(75, 170, 150, 30);
		
		panel.add(laCode);
		panel.add(aCode);
		panel.add(laPassword);
		panel.add(aPassword);
		panel.add(laName);
		panel.add(aName);
		
		joinBtn = new JButton("Join");
		joinBtn.setBounds(25, 215, 180, 30);
		panel.add(joinBtn);
	}
/* ---------- panel setting 끝 ---------- */
	
	public void setJoin(JoinProcess join) {
		this.join = join;
	}
	
}

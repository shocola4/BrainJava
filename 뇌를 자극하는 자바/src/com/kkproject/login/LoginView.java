package com.kkproject.login;

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
public class LoginView extends JFrame {

	private LoginProcess main;
	private LoginFrm loginfrm;
	private JoinFrm joinFrm;
	
	private JTextField aCode;
	private JPasswordField aPassword;
	private JButton loginBtn;
	private JButton joinBtn;
	private boolean loginCheck;
	
	ResultSet rs = null;
/* ---------- LoginView 설정 끝 ---------- */
	
	public static void main(String[] args) {

	}
	
/* ---------- LoginView frame setting 시작 ---------- */
	public LoginView() {
		System.out.println("LoginView() 생성자");
		
		//setting
		setTitle("Book Management Login");
		setSize(250, 290);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
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
		laCode.setBounds(10, 130, 60, 30);
		
		aCode = new JTextField("");
		aCode.setBounds(75, 130, 150, 30);
		panel.add(laCode);
		panel.add(aCode);
		
		JLabel laPassword = new JLabel("Password");
		laPassword.setForeground(Color.WHITE);
		laPassword.setBounds(10, 170, 60, 30);
		
		aPassword = new JPasswordField("");
		aPassword.setBounds(75, 170, 150, 30);
		panel.add(laPassword);
		panel.add(aPassword);
		
		aPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//?
			}
		});
		
		loginBtn = new JButton("LOGIN");
		loginBtn.setBounds(20, 215, 90, 30);
		panel.add(loginBtn);
		
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginCheck(aCode.getText(), new String(aPassword.getPassword()));
			}
		});
		
		joinBtn = new JButton("JOIN");
		joinBtn.setBounds(125, 215, 90, 30);
		panel.add(joinBtn);
		
		joinBtn.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				new JoinFrm();
			}
		});
	}
/* ---------- panel setting 끝 ---------- */

/* ---------- loginCheck setting 시작 ---------- */
	public void loginCheck(String aCode, String aPassword) {
		
		String acodeCheckQuery = "SELECT aCode, aPassword FROM Admin where aCode = '" + aCode + "'";
		BookManagementJdbc jdbc = new BookManagementJdbc();
		
		/* ---------- Login DB 접속 시작 ---------- */
		try {
			jdbc.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3307/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			rs = jdbc.selectTable(acodeCheckQuery);
			
			if(rs.next()) {
				System.out.println(rs.getString(1) + "---" + rs.getString(2));
				System.out.println("아이디 존재");
				
				if(aPassword.equals(rs.getString("aPassword"))) {
					System.out.println("패스워드 일치");
					
					JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
				
				loginCheck = true;
				
				if(loginCheck()) 
					main.mainFrame();
				
				} else {
					JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/* ---------- Login DB 접속 끝 ---------- */
	}
/* ---------- loginCheck setting 끝 ---------- */
	
	
	public void setMain(LoginProcess main) {
		this.main = main;
	}
	
	public boolean loginCheck() {
		return loginCheck;
	}
}

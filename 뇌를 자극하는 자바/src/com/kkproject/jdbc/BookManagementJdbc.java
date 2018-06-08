package com.kkproject.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookManagementJdbc {
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public BookManagementJdbc(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}
	
	public BookManagementJdbc() {
		System.out.println("BookManagementJdbc() 호출");
	}
	
	public Connection DBConnection(String driver, String url, String user, String pass) throws Exception{
		Class.forName(driver);
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
	}
	
	public ResultSet selectTable(String query) throws Exception { 
		System.out.println("query: - " + query);
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		
		return rs;
	}
	

	public void insertTable(String []arr)throws Exception {
		
		String bCode = arr[0];//도서코드
		String bName = arr[1];//책이름
		String bPublisher = arr[2];//출판사
		String bWriter= arr[3];//저자
		String bCount= arr[4];//권수

		
		String query= "INSERT INTO  B00K  (bCode, bName, bPublisher, bWriter, bCount)values"
		  		+ "("+ bCode +",'"+bName+"','"+bPublisher+"','"+bWriter+"',"+bCount+")";
//        		
		System.out.println("query-"+query); 
		stmt=conn.createStatement();
		int insertCount = stmt.executeUpdate(query);
		
	 if(insertCount>0) 
		  System.out.println(insertCount+ "건이 삽입 되었습니다.");
	}	  
	
	public void updateTable(String bName,String bCount)throws Exception {
		String query ="update B00K set Name = " + bName + 
				" where Count = '" + bCount + "'";
		  System.out.println("query - " + query);
		stmt=conn.createStatement();
		int updateCount = stmt.executeUpdate(query);
		
		if (updateCount >0) {
			System.out.println(updateCount +"건이 수정 되었습니다.");
		}
	}
	
	
	 public void deleteTable(String deleteName)throws Exception {
		String query ="delete from B00K where bName ='"+deleteName+"'";
		stmt=conn.createStatement();
		int deleteCount = stmt.executeUpdate(query);
		
		if (deleteCount>0) {
			System.out.println(deleteCount+"건이 삭제 되었습니다.");
		}


	}

	
	public void DBClose() throws Exception {
		conn.close();
	}

}
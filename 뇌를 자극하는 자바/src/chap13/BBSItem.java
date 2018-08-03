package chap13;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;

import javax.servlet.ServletException;

public class BBSItem {
   private int seqNo;      //순번
   private String title;   //제목
   private String content; //내용
   private String writer;  //작성자 
   private Date date;      //저장일자
   private Time time;      //저장시각
public int getSeqNo() {
	return seqNo;
}
public void setSeqNo(int seqNo) {
	this.seqNo = seqNo;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}

public void readDB() throws ServletException{
	                       //데이터베이스로부터 게시글 읽는 메서드]
   Connection conn =null;	
   Statement stmt =null;
   
   try{
		
	   Class.forName("org.apache.commons.dbcp.PoolingDriver");
	   Class.forName("com.mysql.jdbc.Driver");
       conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wbdb_pool");
       
       if(conn == null)
   		throw new Exception("데이터 베이스에 연결 할 수 없습니다.");
       
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from bbs where seqno = '" + seqNo + "'" ); 
		
		if(rs.next()) {
		
			title=rs.getString("title");
			content=rs.getString("content");
			writer=rs.getString("writer");
			date=rs.getDate("wdate");
			time=rs.getTime("wtime");
		}
		
		
		//if(conn == null)
			//throw new Exception("데이터 베이스에 연결 할 수 없습니다.");
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try{
			stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try{
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

}

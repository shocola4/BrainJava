package chap13;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("ID");
		String password = request.getParameter("PASSWORD");
		String result;
		
		if(checkLoginInfo(id,password)) {
			HttpSession session =request.getSession();
			session.setAttribute("LOGIN_ID", id);
			result = "SUCCESS";
		}
		else {
			result ="FAIL";
		}
		response.sendRedirect("/chap13/WebTemplate.jsp?BODY_PATH="+"LoginResult.jsp?LOGIN_RESULT="+ result);
	}

	private boolean checkLoginInfo(String id, String password) 
		                  throws ServletException{
		Connection conn =null;	
		   Statement stmt =null;
		   String query = null;
		   try{
				
			   Class.forName("org.apache.commons.dbcp.PoolingDriver");
			   Class.forName("com.mysql.jdbc.Driver");
		       conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wbdb_pool");
		       
		       if(conn == null)
		   		throw new Exception("데이터 베이스에 연결 할 수 없습니다.");
		       
				stmt = conn.createStatement();
				
				query = "select password from userinfo where id " + id + "';";
				ResultSet rs = stmt.executeQuery(query); 
				
		   
	    	  if(!rs.next())
	    		  return false;
	    	  
	    	  String correctPassword= rs.getString(password);
	    	  
	    	  if(password.equals(correctPassword))
	    		  return true;
	    	  
	    	  else
	    			return false;
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
		return false;
	
		
		
	}
     
}

package chap13;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BBSListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-gene
	    String strUpperSeqNo= request.getParameter("LAST_SEQ_NO");
	    int upperSeqNo;
	    if(strUpperSeqNo==null)
	    	upperSeqNo = Integer.MAX_VALUE;
	    else
	    	upperSeqNo = Integer.parseInt(strUpperSeqNo);
        BBSList list =readDB(upperSeqNo);
        request.setAttribute("BBS_LIST", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/chap13/WebTemplate.jsp?BODY_PATH=BBSListView.jsp");
        dispatcher.forward(request, response);
	}

	private BBSList readDB(int upperSeqNo) throws ServletException{

		BBSList list= new BBSList();
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
				
				query = "select * from bbs where seqno < " + upperSeqNo + " order by seqno desc;";
				ResultSet rs = stmt.executeQuery(query); 
				
		      for(int cnt=0; cnt<5; cnt++) {
		    	  if(!rs.next())
		    		  break;
		    	  list.setSeqNo(cnt, rs.getInt("seqno"));
		    	  list.setTitleList(cnt, rs.getString("title"));
		    	  list.setWriterList(cnt, rs.getString("writer"));
		    	  list.setDateList(cnt, rs.getDate("wdate"));
		    	  list.setTimeList(cnt, rs.getTime("wtime"));
		      }		
	    	  if(!rs.next())
                list.setLastPage(true);
		

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
		
		return list;
	}
	

}

<%@ page language="java" import="java.sql.*,oracle.dbpool.*"  contentType="text/html;charset=euc_kr" %>

<html>
<head>
  <title>��ǻ���������θ�</title>
  <link href="../common/u3.css" type=text/css rel=stylesheet>

<script language=javascript src="../common/u3.js"></script>
</head>

<body leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<jsp:include page="../common/basic_screen.jsp" flush="true"/>

<!-- ��ǰ������ ǥ�� -->
<%
	int productid = 0;
	String name,company_id,expression,photo,category,cdate;
	int id,price,code;

	Statement stmt=null;
	ResultSet rs=null;

	DBConnectionManager pool = DBConnectionManager.getInstance();
	Connection con = pool.getConnection("ora8");
    
	try {
		 productid = Integer.parseInt(request.getParameter("i"));
		String pid= (String)session.getAttribute("pid");
	
		String sql1="select id,name,price,company_id,expression,photo,cname,code,cdate from product_view where id ="+ productid;
		stmt=con.createStatement();
		rs=stmt.executeQuery(sql1);
		while(rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			price = rs.getInt(3);
			company_id = rs.getString(4);
			expression = rs.getString(5);
			photo = rs.getString(6);
			category = rs.getString(7);
			code = rs.getInt(8);
			cdate = rs.getString(9);
%>

<br><br>
<table border=0 cellpadding=0 cellspacing=0 width=605 align=center>
   <tr bgcolor=#7aaad5 height=30>
       <td  colspan=3 align=center bgcolor="#0000ff"><font color="#ffffff"><b> [<%= name %>]�� ��ǰ ����</b></font></td>
  </tr>
</table><br>
	
<table border=1 align=center cellpadding=0 cellspacing=0 width=600>
 <tbody> 
    <tr> 
      <td valign=top> 
        <table border=0 cellpadding=0 cellspacing=0 width=200>
          <tr> 
            <td valign=top><img border=0 name=picmedium height=200 width=200 src="image/<%=photo%>"></td>
          </tr>
         </table>
      </td>

      <td> 
        <table border=1 cellpadding=0 cellspacing=0 width=400>
          <tr> 
              <td colspan=2 align=center  bgcolor=#00ff66 width=400><font size=3><b><%=name%></b></font></td>
		 </tr>
          <tr>
                  <td width=90>&nbsp; ��ǰ�з�</td>
                  <td width=280>&nbsp;[<%= category %>]</td>
          </tr>
          <tr>
                  <td width=90>&nbsp; ��       ��</td>
                  <td width=280>&nbsp;[<%=price%>��]</td>
          </tr>
           <tr> 
                  <td>&nbsp; ���� ȸ��</td>
                  <td>&nbsp;<%=company_id  %></td>
          </tr>
          <tr> 
                  <td>&nbsp; ��ǰ �ڵ�</td>
                  <td>&nbsp;<%= code%></td>
           </tr>
            <tr> 
                  <td>&nbsp; ��  ��  ��</td>
                  <td>&nbsp;<%= cdate %></td>
           </tr>
          <tr> 
            <td>&nbsp; �� ����</td>
            <td>&nbsp;<%=expression%></td>
          </tr>
        <tr>
            <td height=50 ><img src="../img/b_white_1.gif"></td>
            <td align=right><a  href="check.jsp?productnum=<%= productid %>"><img src="../img/basket_1.gif"></a>
          </tr>
        </table>
      </td>
    </tr>
    </tbody> 
</table>

<%}
	rs.close();
	} catch (Exception e)
	{System.out.println(e);
	} finally{
	if (stmt != null) stmt.close();
	if (con != null) {
		 pool.freeConnection("ora8", con);
		}
}%>
<!-- ��ǰ������ ǥ�� �� -->
	<jsp:include page="../common/basic_copyright.jsp" flush="true"/>
</body>
</html>
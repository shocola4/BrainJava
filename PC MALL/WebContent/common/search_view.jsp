<%@ page contentType="text/html;charset=euc_kr" import="java.sql.*,oracle.dbpool.*"  %>

<HTML>
	<HEAD>
		<TITLE>��ǻ�� �������θ�</TITLE>
		<link href="../common/u3.css" type=text/css rel=stylesheet>
	</HEAD>

<BODY leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
    <jsp:include page="../common/basic_screen.jsp" flush="true"/>

<!-- �˻� ���� -->
<%
	DBConnectionManager pool = DBConnectionManager.getInstance();
	Connection con = pool.getConnection("ora8");

	Statement stmt=con.createStatement();
	Statement stmt1=con.createStatement();
	String s_word=new String(request.getParameter("srch_word").getBytes("8859_1"),"euc-kr");

	try {
		String name,company_id,expression,photo,category;
		int id,price,count;
		ResultSet rs=stmt.executeQuery("select id,name,price,company_id,expression,photo,category from product where name like '%"+s_word+"%' ");
		ResultSet rs1=stmt1.executeQuery("select count(*) from product where name like '%"+s_word+"%'");

		while(rs1.next()) {
		count=rs1.getInt(1);
%>   
		<center>
		<font color=red><%= s_word %></font> �� ���� 
		<font color=red><%= count %></font> ���� ��ǰ �˻���� �Դϴ�!<br>
<%
		}
%>
		<table width=550 border=0 cellpadding=0 cellspacing=0 bgcolor=ffffff>
			<tr>
				<td align=center bgcolor=#0000ff height=25><font color=#ffffff><b>��ǰ ī�װ�</b></font></td>
			</tr>
			<tr><td height=5></td></tr>
		</table>
		<table border=0 cellpadding=0 cellspacing=1 width=550 bgcolor=#7aaad5>
			<tr bgcolor=#eff4f8 align=center> 
				<td height=30 width=100 bgcolor=#ffccff>&nbsp;��ǰ�̹���</td>
				<td height=30 bgcolor=#ffccff>&nbsp;��ǰ��</td>
				<td height=30 bgcolor=#ffccff>&nbsp;����</td>
			</tr>
<%
			while(rs.next()) {
				id=rs.getInt(1);
				name=rs.getString(2);
				price=rs.getInt(3);
				company_id=rs.getString(4);
				expression=rs.getString(5);
				photo=rs.getString(6);
				category=rs.getString(7);
%>
			<tr bgcolor="edf5fe"> 
				<td align=center><img border=0 name=PicMedium height=30 width=30 src="../product/image/<%=photo%>"></td>
				<td  height=30>&nbsp;&nbsp;&nbsp;&nbsp;<a href="../product/product.jsp?i=<%= id%>"> <%=name%></a></td>
				<td  height=30>&nbsp;&nbsp;&nbsp;&nbsp;<%=price%>��</td>
			</tr>
<%	
			}
			rs.close();
			rs1.close();
			stmt.close();
			stmt1.close();
	} catch (Exception e) {
		out.println(e);
	} finally{
		pool.freeConnection("ora8", con);
	}
%>
		</table>
		</center>
		<!--  �˻� �� -->
	<jsp:include page="../common/basic_copyright.jsp" flush="true"/>
</BODY>
</HTML>
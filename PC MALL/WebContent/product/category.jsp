<%@ page contentType="text/html;charset=euc_kr" import="java.sql.*,oracle.dbpool.*,java.util.*" %>

<HTML>
	<HEAD>
		<TITLE>ī�װ����� ��ǰ��� ����</TITLE>
	<script language=JavaScript src="../common/u3.js"></script>
	<link href="../common/u3.css" type=text/css rel=stylesheet>
	</HEAD>

<BODY leftmargin=0 topmargin=0 marginwidth=0 marginheight=0 >
	<jsp:include page="../common/basic_screen.jsp" flush="true"/>
<%
		DBConnectionManager pool = DBConnectionManager.getInstance();
		Connection con = pool.getConnection("ora8");
	try {
		String newnum = request.getParameter("c");
		String name,photo,c_name="";
		int id,price;
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select id, name, price, photo, cdate from product_view where category  = "+ newnum );
%>
<!-- ī�װ����� ��ǰ��� --> 
<table width=630 border=0  cellpadding=0 cellspacing=0 bgcolor="#ffffff">
	<tr bgcolor=ffffff>
		<td valign="top">
			<table border=0 cellpadding=0 cellspacing=0 width=550 align=center bgcolor=ffffff>
			<br>
				<tr bgcolor=#7aaad5 height=25>
					<td colspan=3 align=center bgcolor=#0000ff><font color=#ffffff><b>ī�װ��� �з�</b></font></td>
				</tr>
				<tr><td height=10></td></tr>
				 <tr>
					<td colspan=3>
						<table border=0 cellpadding=0 cellspacing=1 width=550 bgcolor=#7aaad5>
							<tr bgcolor=#ffcccc align=center> 
								<td height=25 width=80>&nbsp;��ǰ�̹���</td>
								<td height=25>&nbsp;��ǰ��</td>
								<td height=25>&nbsp;����</td>
							</tr>
<%
						while(rs.next()) {
							id = rs.getInt(1);
							name = rs.getString(2);
							price = rs.getInt(3);
							photo = rs.getString(4);
							c_name = rs.getString(5);
%>
						<tr bgcolor="#eff4f8"> 
							<td align=center><img border=0 name=PicMedium height=30 width=30 src="image/<%=photo%>"></td>
							<td  height=30>&nbsp;<a href="product.jsp?i=<%= id %>">[<%= c_name %>]&nbsp;<%= name %></font></a></td>
							<td  height=30>&nbsp;<%= price %>��</font></td>
						</tr>
<%	
		}
		rs.close();
		stmt.close();
	} catch (Exception e) {
		out.println(e);
	} finally{
		pool.freeConnection("ora8", con);
	}
%>
						</table>
					</td>
				</tr>
			</table><br>
		</td>
	</tr>
</table>
<!-- ī�װ����� ��ǰ��� �� -->
	<jsp:include page="../common/basic_copyright.jsp" flush="true"/>
</BODY>
</HTML>
<%@ page contentType="text/html;charset=euc_kr" %>

<% 
	String pid =(String)session.getAttribute("pid");
	String pname=(String)session.getAttribute("pname"); 
%>

<body link="#000000" vlink="#000000" alink="#666666">
<table width=780 border=0 cellspacing=0 cellpadding=0 height=60 align=left name="top_table">
	<tbody valign=top align=left>
		<tr valign=bottom align=left> 
			<td border=0 width=50 height=50 rowspan=2><a href="../main/index.jsp"><img name="Image5" border=0 src="../img/logo_12.gif" width=350 height=60></a></td>
			<td>&nbsp</td>
			<td width=100 colspan=2>
			<div align=center><marquee behavior=left scrollamount=1><font color="#0000AA">
<%
				if( session.getAttribute("pid") != null) {
 %>
					([<%=pid%>]
<%
				}
 %>			���� �湮�� �������� ȯ���մϴ�</font></marquee></div>
			</td>
			<td>&nbsp</td>
			</tr>
		<tr valign=bottom align=right> 
<%
			if( session.getAttribute("pid") != null) {
%>
			<td><a href="../member/logout.jsp" class=line>[ �α׾ƿ� ]</td>
<%
			}  else {
%>
			<td><a href="../member/login.jsp" class=line>[ �α��� ]</a></td>
<%
			}
%>
			<td align=center><a href="../service/index_site.jsp" class=line>[ ����Ʈ�� ]</a></td>
		</tr>
	</tbody>
</table>

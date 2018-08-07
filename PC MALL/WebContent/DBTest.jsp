<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h3>데이터베이스 연결하기</h3>
   <%
     String url="jdbc:oracle:thin:@localhost:1521:orcl";
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection conn = DriverManager.getConnection(url,"antman","12345");
     
     if(conn!=null){
    	 out.println("oracle데이터베이스로 연결됨<br/>");
    	 conn.close();
     }
     else{
    	 out.println("oracle데이터베이스로 연결안됨<br/>");
     }
   %>

</body>
</html>
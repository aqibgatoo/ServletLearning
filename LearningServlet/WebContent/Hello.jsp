<%@page import="com.aqib.MyServlet.Dog"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Dog d=new Dog("american dog");

out.println(d.getBreed());


%>
<%
String id=request.getParameter("id");
if(id==null){%>
	
<p>id is null</p>
	
<%}else{ %>
	
<p>id is<%=id %></p>
	
 <%}%>

</body>
</html>
<%@page import="java.util.Date"%>
<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  <!-- Viet tieng viet -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />    <!-- Viet tieng viet -->
<title>TestingSystem_Assignment_1</title>
</head>
<body>
<h1> Hello World </h1>
<% out.print("Welcome to JSP."); %>
Current Time: <%= java.util.Calendar.getInstance().getTime()%>

<%! String name = "Phạm Văn Huy"; %>
<% out.print("Hello " + name); %>
<% new Date(); %>


</body>
</html>
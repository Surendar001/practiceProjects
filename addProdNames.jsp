<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String ProdName; %>
 <%  
 Object obj=session.getAttribute("obj");
 List<String> listOfProd;
 if(obj==null){
	 listOfProd= new ArrayList<String>();
	 ProdName=request.getParameter("ProdName");
	 listOfProd.add(ProdName);
	 session.setAttribute("obj", listOfProd);
	}else{
		ProdName=request.getParameter("ProdName");
		listOfProd=(List<String>)session.getAttribute("obj");
		listOfProd.add(ProdName);
		for(String s:listOfProd){
			out.println("The product name is"+s+"<br/>");
		}
	}
 
%>
<%@include file="stdNames.jsp" %>
</body>
</html>
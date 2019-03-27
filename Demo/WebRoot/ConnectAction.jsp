<%@page import="db.DbConnect"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	if(DbConnect.getConnection()!=null){
		response.sendRedirect("success.jsp");
	}else{
		response.sendRedirect("error.jsp");
	}
%>
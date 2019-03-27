<%@page import="java.sql.DatabaseMetaData"%>
<%@page import="db.DbConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	Connection con = DbConnect.getConnection();
	DatabaseMetaData data = con.getMetaData();
	out.println("---数据库信息---");
	out.println("登录url：" + data.getURL() + "<br>");
	out.println("登录用户名：" + data.getUserName() + "<br>");
	out.println("数据库名：" + data.getDatabaseProductName() + "<br>");
	out.println("数据库版本：" + data.getDatabaseProductVersion() + "<br>");
	out.println("驱动器名称：" + data.getDriverName() + "<br>");
	out.println("驱动器版本：" + data.getDriverVersion() + "<br>");
	out.println("数据库是否只允许读操作：" + data.isReadOnly());
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Server Information</title>
	<style>
			table{margin-top : 60px;margin-left: 40px;}
			tr td:first-child{width:220px;font-weight:bold;display:list-item;}
			tr td:nth-child(2){font-weight:bold;width:30px;	}
			tr:nth-child(5){visibility:hidden;}
			tr:nth-child(6){visibility:hidden;}
	</style>
</head>
<body>
	<h1 align="center">${title}</h1>
	<table>
			<tr><td>User Server Name  </td><td>:</td><td>${userServer}</td></tr>
			<tr><td>Other Information  </td><td>:</td><td>${otherInformation}</td></tr>
			<tr><td>Server Name  </td><td>:</td><td>${serverName}</td></tr>
			<tr><td>Server IP address  </td><td>:</td><td>${serverIP}</td></tr>
			<tr><td></td></tr>
			<tr><td></td></tr>
			<tr><td>Server Infrastructure   </td><td>:</td><td>${serverInfrastructure}</td></tr>
			<tr><td>Server Version  </td><td>:</td><td>${serverVersion}</td></tr>
		</table>
</body>
</html>
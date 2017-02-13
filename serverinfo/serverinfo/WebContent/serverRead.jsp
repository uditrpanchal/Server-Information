<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reading Server Information</title>
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
			<tr><td>${username0}  </td><td>:</td><td>${username1}</td> </tr>
			<tr><td>${otherInfo0}  </td><td>:</td><td>${otherInfo1}</td></tr>
			<tr><td>${serverName0}  </td><td>:</td><td>${serverName1}</td></tr>
			<tr><td>${serverIP0}  </td><td>:</td><td>${serverIP1}</td></tr>
			<tr><td></td></tr>
			<tr><td></td></tr>
			<tr><td>${serverInfra0}   </td><td>:</td><td>${serverInfra1}</td></tr>
			<tr><td>${serverVersion0}  </td><td>:</td><td>${serverVersion1}</td></tr>
		</table>
</body>
</html>
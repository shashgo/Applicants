<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter your information</title>
</head>
<body>
	<form action="addInfo" method="get">
	<table>
		<tr><td>Name:</td><td><input type="text" name="name" /></td></tr>
		<tr><td>Email:</td><td><input type="text" name="email" /></td></tr>
		<tr><td>Phone:</td><td><input type="text" name="phone" /></td></tr>
		<tr><td>Experience:</td><td><input type="text" name="experience" /></td></tr>
		<tr><td>Code:</td><td><input type="text" name="code" /></td></tr>
		<tr><td>Rating:</td><td><input type="text" name="rating" /></td></tr>
	</table>
	<input type="submit" value="Submit"/>
	</form>
</body>
</html>
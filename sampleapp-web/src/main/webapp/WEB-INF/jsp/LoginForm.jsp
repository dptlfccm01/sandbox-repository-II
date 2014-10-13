<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<form method="POST" action="/sampleapp-web/welcome.html">
		<p>Email address:</p>
		<p><input type="email" name="email"/></p>
		<p/>
		<p>Password: </p>
		<p><input type="password" name="password"/></p>
		<p/><p/>
		<input type="submit" name="submit" value="Login"/>
	</form>
</body>
</html>
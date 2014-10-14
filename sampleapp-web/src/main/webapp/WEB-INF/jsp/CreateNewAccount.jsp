<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Account</title>
</head>
<body>
<form method="post" action="/sampleapp-web/result.html">
Create a new account
<br /><br />
Enter the required information in the form below:
<br /><br />
First Name: <input type="text" name="firstname" />
<br />
Last Name: <input type="text" name="lastname" />
<br />
Email: <input type="email" name="email" />
<br />
Card Type: <input type="text" name="cardType" />
<br />
Password: <input type="password" name="password" />
<input type="submit" name="submit" value="submit" />
</form>
</body>
</html>
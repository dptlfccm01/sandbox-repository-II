<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Account Details</title>
</head>
<body>
Account details page
<br />
<p>First name: <c:out value="${customer.firstname}"/></p>
<p>Last name: <c:out value="${customer.lastname}"/></p>
<p>Email: <c:out value="${customer.email}"/></p>
</body>
</html>
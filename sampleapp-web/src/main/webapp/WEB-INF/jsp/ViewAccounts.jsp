<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Accounts</title>
</head>
<body>
View all Accounts
<br />
<br />
	<table>
	<th>Firstname</th>
	<th>Lastname</th>
	<th>Email</th>
	<th>Card Type</th>
	
	<c:forEach var="customer" items="${customerList}">
		<tr>
			<td><c:out value="${customer.firstname}" /></td>
			<td><c:out value="${customer.lastname}" /></td>
			<td><c:out value="${customer.email}" /></td>
			<td><c:out value="${customer.cardType}" /></td>
		</tr>
	</c:forEach>		
	</table>

</body>
</html>
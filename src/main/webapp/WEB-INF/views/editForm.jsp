<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2><b>Enter Details</b></h2>
	<form:form action="saveEmployee" method="post" modelAttribute="employee">
	<table>
	<tr><td>Id</td><td>${employee.id}<form:hidden path="id"/></td></tr>
	<tr><td>Name</td><td><input type="text" name="name" value="${employee.name}"></td></tr>
	<tr><td>Address</td><td><input type="text" name="address" value="${employee.address}"></td></tr>
	<tr><td>Email</td><td><input type="text" name="emailId" value="${employee.emailId}"></td></tr>
	<tr><td>Mobile</td><td><input type="text" name="mobileNum" value="${employee.mobileNum}"></td></tr>
	<tr><td><input type="Submit" value="Save"></td></tr>
	</table>
	</form:form>
</div>

</body>
</html>
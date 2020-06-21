<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Employee Management System</h1>
<form action="search">
<input type="text" name="keyword">
<input type="Submit" value="Search">
</form>

<br>
<a href="newemployee"><h2>Add New Employee to the organization</h2></a>
<br>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Email</th>
<th>Mobile Number</th>
<th>Action</th>
</tr>
<c:forEach items="${allEmpList}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.address}</td>
<td>${employee.emailId}</td>
<td>${employee.mobileNum}</td>
<td><a href="edit?id=${employee.id}" >Edit</a>/<a href="delete?id=${employee.id}">Delete</a></td>
</tr>
</c:forEach>
</table>

</div>

</body>
</html>
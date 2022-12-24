<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list Billing</title>
</head>
<body>
<h2>All Billing</h2>
<table>
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Product Name</th>
<th>Quantity</th>
<th>Amount</th>
</tr>
<c:forEach var="contact" items="${contacts}">
<tr>
<td>${contact.id}</td>
<td>${contact.firstName}</td>
<td>${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.mobile}</td>
<td>${contact.product}</td>
<td>${contact.quantity}</td>
<td>${contact.amount}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
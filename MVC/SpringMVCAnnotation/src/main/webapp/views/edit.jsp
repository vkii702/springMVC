<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--  <form action="edit" method="post">
	<input type="text" value="${modelObj.getId()}" name="newUserId"/>
	<input type="text" value="${modelObj.getName()}" name="newUserName"/>
	<input type="text" value="${modelObj.getAddr()}" name="newUseraddr"/>
	<input type="text" value="${modelObj.getEmail()}" name="newUsermail"/>
	<input type="submit" value="Register"/>
	<input type="reset" value="cancel"/>
</form> --%>
<form:form action="edit" meathod="post">
	<form:input path="Id" value="${Objmodel.getId()}"/>
	<form:input path="Name" value="${Objmodel.getName()}"/>
	<form:input path="Addr" value="${Objmodel.getAddr()}"/>
	<form:input path="Email" value="${Objmodel.getEmai()}"/>
	<input type="submit" value="register"/>
</form:form>
</body>
</html>
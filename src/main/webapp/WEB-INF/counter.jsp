<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
	<h1>
	 Times you have visited this site:
		<c:out value="${count}">Count</c:out>
	</h1>
	<a href="/"> Home</a>

</body>
</html>
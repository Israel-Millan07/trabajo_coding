<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:out value="${2+2}"/>
<h1>Hola Humano</h1>
<c:out value="${dojoName}"/>
<!-- ... -->
<form method="POST" action="/login">
    <label>Username: <input type="text" name="username"></label>
    <label>Password: <input type="password" name="password"></label>
    <button>Login</button>
</form><span class="support tag close from-rainbow"></span>
</body>
</html>
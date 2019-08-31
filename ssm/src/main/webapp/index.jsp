<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		
		<c:forEach items="${list }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.username }</td>
				<td>${user.password }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>
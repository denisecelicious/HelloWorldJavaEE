<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="LoginServlet" method="post">
		Enter your username: <input type="text" name="username" size="20">
		<br> 
		Enter your password: <input type="password" name="password" size="20">
		<!-- Implement submit button with type = submit to perform the request when clicked -->
		<input type="submit" value="Call Servlet" />
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<form action="loginRegister" method="post">
		<table
			style="background-color: orange; margin-left: 20px; margin-top: 20px;">
			<tr>
				<td><h3 style="color: black;">Register Form!</h3></td>
				<td></td>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastname"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Re-Type Password:</td>
				<td><input type="password" name="password2"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register"></td>
				<td><a href="login.jsp">Back</a></td>
			</tr>

		</table>
	</form>
</body>
</html>
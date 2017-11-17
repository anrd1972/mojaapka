<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title>Logowanie</title>
</head>
<body>

	<form id="loginForm" action="/login" method="POST">

		<table width="500" border="0" cellpadding="4" cellspacing="1"
			align="center">
			<tr>
				<td align="right" width="140">Email:</td>
				<td align="left"><input type="text" name="email" id="email"
					size="30" /></td>
			</tr>
			<tr>
				<td align="right" width="140">Hasło:</td>
				<td align="left"><input type="password" name="password"
					id="password" size="30" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center" bgcolor="#ffffff">
					<input type="submit" value="Zaloguj" class="formButton" />
				</td>
			</tr>

		</table>
	</form>
	<p id="msg1" align="center" class="error">
		<c:if test="${not empty param.error}">
			Nieprawidłowy email lub hasło
		</c:if>
	</p>

</body>
</html>
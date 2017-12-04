<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="page.title.login"/></title>
</head>
<body>

<div style="margin-top: 15%; border: 1px; font-size: 16px;">
	<form id="loginForm" action="/login" method="POST">

		<table width="350" border="0" cellpadding="4" cellspacing="1"
			align="center">
			<tr>
				<td colspan="2" class="header" align="center" valign="middle">
					<img src="/resources/images/login.png">&nbsp;
					<s:message code="page.title.login"/>
				</td>
			</tr>
			<tr>
				<td align="right" width="140"><s:message code="register.email"/></td>
				<td align="left"><input type="text" name="email" id="email"
					size="30" /></td>
			</tr>
			<tr>
				<td align="right" width="140"><s:message code="register.password"/></td>
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
</div>

</body>
</html>
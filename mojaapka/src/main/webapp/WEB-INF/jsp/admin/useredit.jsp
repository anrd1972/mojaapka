<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="admin.users.edit.title"/></title>
</head>
<body>
<%@include file="/WEB-INF/incl/adminmenu.incl" %>
<p/>
<sf:form id="usersForm" action="/admin/update" modelAttribute="user"
		enctype="multipart/form-data" method="POST">
		<sf:hidden path="id"/>
		<sf:hidden path="password"/>
		<sf:hidden path="active"/>

		<table width="600" border="0" cellpadding="4" cellspacing="1"
			align="center">
			
			<tr>
				<td colspan="2" class="header" align="center" valign="middle">
					<img src="/resources/images/useredit.png">&nbsp;
					<s:message code="admin.users.edit.title"/>
				</td>
			</tr>

			<tr>
				<td width="130" align="right" ><s:message code="register.name"/></td>
				<td width="270" align="left"><sf:input path="name"
						size="28" id="name" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="name" cssClass="error"/></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message code="register.lastName"/></td>
				<td width="270" align="left"><sf:input path="lastName"
						size="28" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><sf:errors path="lastName" cssClass="error"/></td>
			</tr>

			<tr>
				<td width="130" align="right" ><s:message code="register.email"/></td>
				<td width="270" align="left"><sf:input path="email" size="28" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="email" cssClass="error"/></td>
			</tr>

			<tr>
				<td width="130" align="right" ><s:message code="admin.users.role"/></td>
				<td width="270" align="left"><sf:select path="rolaInt" items="${roleMap}"/></td>
			</tr>

			<tr>
				<td colspan="2" align="center" bgcolor="#fff">
					<input type="submit" value="<s:message code="button.save"/>" 
						class="formButton"/>&nbsp;&nbsp;
					<input type="button" value="<s:message code="button.cancel"/>" 
						class="formButton" 
						onclick="window.location.href='${pageContext.request.contextPath}/admin/users'"/>
				</td>
			</tr>

		</table>

	</sf:form>
	
	
</body>
</html>
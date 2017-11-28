<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="admin.menu.users"/></title>
</head>
<body>
<%@include file="/WEB-INF/incl/adminmenu.incl" %>

<c:forEach var="u" items="${userList}">
<p>
	<s:message code="admin.users.id"/> <c:out value="${u.id }"></c:out><br/>
	<s:message code="register.name"/> <c:out value="${u.name }"></c:out><br/>
	<s:message code="register.lastName"/> <c:out value="${u.lastName }"></c:out><br/>
	<s:message code="register.email"/> <c:out value="${u.email }"></c:out><br/>
	<s:message code="admin.users.active"/> 
	
	<c:choose>
		<c:when test="${u.active == 1 }">
			<font color="green"><s:message code="admin.users.active.yes"/></font><br/>
		</c:when>
		<c:otherwise>
			<font color="red"><s:message code="admin.users.active.no"/></font><br/>
		</c:otherwise>
	</c:choose>
	
	<s:message code="admin.users.role"/> 
	<c:choose>
		<c:when test="${u.rolaInt == 1}">
			<s:message code="admin.users.role.admin"/><br/>
		</c:when>
		<c:otherwise>
			<s:message code="admin.users.role.user"/><br/>
		</c:otherwise>
	</c:choose>
	
</p>
</c:forEach>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="zamowienia.page.title" /></title>
</head>
<body>
	<%@include file="/WEB-INF/incl/menu.incl"%>

	<table width="100%" border="0">
		<tr>
			<td width="200" align="left" valign="middle">
				<h2>
					<s:message code="zamowienia.page.title" />
				</h2>
			</td>
			<td align="right" valign="middle"><input type="button"
				class="formButton2" onclick="window.location.href='${pageContext.request.contextPath}/nowezam'"
				value="<s:message code="zamowienia.page.dodaj"/>" />
		</tr>
	</table>
	<br/>
	<table width="1300" border="0" cellpadding="6" cellspacing="0" class="tableZamowienia">
	
	<tr class="tdUsersHead ">
		<td width="20" align="center" valign="top"><s:message code="admin.users.id"/></td>
		<td width="200" align="center" valign="top"><s:message code="zamowienia.page.numerZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.dataZamowienia"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.iloscZamowiona"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.dataPrzyjecia"/></td>
		<td width="90" align="center" valign="top"><s:message code="zamowienia.page.iloscPrzyjeta"/></td>
		<td width="100" align="center" valign="top"><s:message code="zamowienia.page.kompletne"/></td>
		<td width="340" align="center" valign="top"><s:message code="admin.users.akcje"/></td>
	</tr>
	<c:forEach var="z" items="${zamowieniaList}">
		<tr>
			<td class="tdUsers"><c:out value="${z.id }"/></td>			
			<td class="tdUsers"><c:out value="${z.nrZamowienia }"/></td>
			<td class="tdUsers"><c:out value="${z.dataZamowienia }"/></td>
			<td class="tdUsers"><c:out value="${z.iloscZamowiona }"/></td>
			<td class="tdUsers"><c:out value="${z.dataPrzyjecia }"/></td>
			<td class="tdUsers"><c:out value="${z.iloscPrzyjeta }"/></td>
			<td class="tdUsers"><c:out value="${z.kompletne }"/></td>
			<td class="tdUsers">operacje</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
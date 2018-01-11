<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/style.css" />
<title><s:message code="zamowienia.page.dodaj"/></title>
</head>
<body>
<%@include file="/WEB-INF/incl/adminmenu.incl" %>
<p>
<sf:form id="zamowieniaForm" action="/addzam" modelAttribute="zamowienia"
		enctype="multipart/form-data" method="POST">
		
		<table width="500" border="0" cellpadding="4" cellspacing="1"
			align="center">
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.numerZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="nrZamowienia" size="28" id="nrZamowienia" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="nrZamowienia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.dataZamowienia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="dataZamowienia" size="28" id="dataZamowienia" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="dataZamowienia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.iloscZamowiona"/>
				</td>
				<td width="270" align="left">
					<sf:input path="iloscZamowiona" size="28" id="iloscZamowiona" type="number"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="iloscZamowiona" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.dataPrzyjecia"/>
				</td>
				<td width="270" align="left">
					<sf:input path="dataPrzyjecia" size="28" id="dataPrzyjecia" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="dataPrzyjecia" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.iloscPrzyjeta"/>
				</td>
				<td width="270" align="left">
					<sf:input path="iloscPrzyjeta" size="28" id="iloscPrzyjeta" type="number"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="iloscPrzyjeta" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td width="130" align="right" >
					<s:message code="zamowienia.page.kompletne"/>
				</td>
				<td width="270" align="left">
					<sf:input path="kompletne" size="28" id="kompletne" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><sf:errors path="kompletne" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center" bgcolor="#fff">
					<input type="submit" value="<s:message code="button.save"/>" 
						class="formButton"/>&nbsp;&nbsp;
					<input type="button" value="<s:message code="button.cancel"/>" 
						class="formButton" 
						onclick="window.location.href='${pageContext.request.contextPath}/zamowienia'"/>
				</td>
			</tr>
			
			
		</table>
		
</sf:form>
</body>
</html>
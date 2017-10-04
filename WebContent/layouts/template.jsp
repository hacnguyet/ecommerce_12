<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- Meta -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
		<!--[if lt IE 9]>
	    <script src="${pageContext.request.contextPath}/assets/js/html5shiv.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/respond.min.js"></script>
	    <![endif]-->  
	    <!-- Default CSS -->
	    <tiles:useAttribute id="list" name="default-css" classname="java.util.List" />
		<c:forEach var="item" items="${list}">
			<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css" media="screen" />
		</c:forEach>
		<!-- Addition CSS -->
		<tiles:useAttribute id="list" name="css" classname="java.util.List" />
		<c:forEach var="item" items="${list}">
			<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css" media="screen" />
		</c:forEach>
		<!-- Default JS -->
		<tiles:useAttribute id="list" name="default-js" classname="java.util.List" />
		<c:forEach var="item" items="${list}">
			<script src="<c:url value='${item}'/>" type="text/javascript"></script>
		</c:forEach>
		<!-- Addition JS -->
		<tiles:useAttribute id="list" name="js" classname="java.util.List" />
		<c:forEach var="item" items="${list}">
			<script src="<c:url value='${item}'/>" type="text/javascript"></script>
		</c:forEach>
	</head>
	<body>
		<tiles:insertAttribute name="header" ignore="true"/>
		<div class="body"><tiles:insertAttribute name="body" ignore="true"/></div>
		<tiles:insertAttribute name="footer" ignore="true"/>
	</body>
</html>

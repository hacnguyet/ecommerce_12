<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
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
		<!-- Css -->
		<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/assets/css/prettyPhoto.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/assets/css/price-range.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/assets/css/animate.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/assets/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet">
		<!-- Image -->
		<link href="${pageContext.request.contextPath}/assets/images/ico/favicon.ico" rel="shortcut icon" >
	    <link href="${pageContext.request.contextPath}/assets/images/ico/apple-touch-icon-144-precomposed.png" rel="apple-touch-icon-precomposed" sizes="144x144">
	    <link href="${pageContext.request.contextPath}/assets/images/ico/apple-touch-icon-114-precomposed.png" rel="apple-touch-icon-precomposed" sizes="114x114">
	    <link href="${pageContext.request.contextPath}/assets/images/ico/apple-touch-icon-72-precomposed.png" rel="apple-touch-icon-precomposed" sizes="72x72">
	    <link href="${pageContext.request.contextPath}/assets/images/ico/apple-touch-icon-57-precomposed.png" rel="apple-touch-icon-precomposed">
	</head>
	<body>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
		
		<!-- JavaScript -->
		<script src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.scrollUp.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/price-range.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/jquery.prettyPhoto.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
	</body>
</html>

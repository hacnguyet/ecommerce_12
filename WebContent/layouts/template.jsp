<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- JavaScript -->
		<script src="/assets/js/jquery-3.2.1.min.js"></script>
		<!-- Css -->
		<link rel="stylesheet" href="/assets/css/bootstrap.min.css">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
	</head>
	<body>
		<header>
			<tiles:insertAttribute name="header" />
		</header>
		<tiles:insertAttribute name="body" />
		<footer>
			<tiles:insertAttribute name="footer" />
		</footer>
	</body>
</html>

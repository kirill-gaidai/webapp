<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Hello, World!</title>
    <link rel="stylesheet" href="<c:url value="/css/styles.css"/>">
</head>
<body>
<h1><c:out value="${message}"/></h1>
<script src="<c:url value="/js/script.js"/>"></script>
</body>
</html>

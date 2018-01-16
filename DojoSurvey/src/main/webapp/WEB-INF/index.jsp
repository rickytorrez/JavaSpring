<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">	
		<script src="/js/main.js"></script>
	</head>

	<body>
		<form action="/info">
		<label>Your Name:</label>
		<input type="text" name="name"><br>
		<label>Dojo Location</label>
		<select name="location">
			<option>D.C.</option>
			<option>Chicago</option>
			<option>Austin</option>
			<option>Boston</option>
		</select><br>
		<label>Favorite Language</label>
		<select name="language">
			<option>Python</option>
			<option>Java</option>
			<option>Mean</option>
			<option>Swift</option>
		</select><br>
		<label>Comment (optional):</label><br>
		<textarea name="comment" id="" cols="30" rows="10"></textarea><br>
		<input type="submit" value="Submit">
		</form>
	</body>
</html>
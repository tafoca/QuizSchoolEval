<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div>
	<f:form modelAttribute="connectionForm" method="post" action="monEspace">
	<table>
	<tr>
		<td> User Name :</td>
		<td><f:input path="pseudo" class="inputbox" alt="username" style="width:100%"/> </td>
		<td><f:errors path="pseudo"></f:errors> </td>
	</tr>
	<tr>	
		<td> PassWord :</td>
		<td><f:password path="motPasse"/> </td>
		<td><f:errors path="motPasse" class="inputbox" size="18" alt="password" style="width:100%"></f:errors> </td>
	</tr>
	<tr> 
	
	<td><input type="submit" value="login"/> </td></tr>
	</table>
	</f:form>
</div>

</body>
</html>

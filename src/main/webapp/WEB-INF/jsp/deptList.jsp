<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Department List</title>
</head>
<body>
	Department List
	<table width="80%" align="center">
		<tr>
			<td>Department No</td>
			<td>Department Name</td>
			<td>Location</td>
		</tr>
		
		<c:if test="${deptList eq null or deptList.size == 0}">
		<tr>
			<td colspan="3">No record found.</td>
		</tr>
		</c:if>
		
		<c:if test="${deptList != null and deptList.size > 0 }">
			<c:forEach var="dept" items="${deptList}">
				<tr>
					<td>${dept.deptno}</td>
					<td>${dept.name}</td>
					<td>${dept.loc}</td>		
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>
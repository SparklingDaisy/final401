<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/main_admin.css">
<link rel="stylesheet" type="text/css" href="css/adminMovie.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<c:import url="../../header_admin.jsp"></c:import>
<table>
		<c:if test="${not empty list }">
			<c:forEach var="i" items="${list }">
				<tr>
					<td>${ i.the_theater}��</td>
					<td>����:${ i.the_width }</td>
					<td>
						<input type="button" value="�¼� ����">
						<input type="button" value="�󿵰� ����">
					</td>
				</tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty list }">
			<tr>
				<td>��ϵ� �󿵰��� �����ϴ�.</td>
			</tr>
		</c:if>
</table>
</body>
</html>
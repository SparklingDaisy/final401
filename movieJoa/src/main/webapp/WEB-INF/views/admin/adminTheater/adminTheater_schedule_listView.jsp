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
<table width="550" border="1" cellspacing="0">
	<thead>
		<tr>
			<th>��ȣ</th>
			<th>�ۼ���</th>
			<th>�ۼ���¥</th>
			<th>��ȸ��</th>
		</tr>
	</thead>
	<tfoot>
		<tr>
			<td colspan="4" align="center">${pageStr }</td>
			<td><a href="bbsWrite.do">�۾���</a></td>
		</tr>
	</tfoot>
	<tbody>
		<c:if test="${empty list }">
		<tr>
			<td colspan="5" align="center">��ϵ� �Խñ��� �����ϴ�.</td>
		</tr>
		</c:if>
		<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.sch_mov_title }</td>
			<td>${dto.sch_start_hour }</td>
			<td>${dto.sch_end_hour }</td>
			<td>${dto.sch_theater }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/main_admin.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<c:import url="../../header_admin.jsp"></c:import>
<form action="theaterAdd.do" method="post">
<table>
	<tr>
		<th>�� ���ΰ���</th>
		<td><input type="text" id="theater"></td>
	</tr>
</table>
<hr>
<table>
	<tr>
		<td>
		���� : <input type="text" name="width" id="width">
		���� : <input type="text" name="height" id="height">
		<input type="button" value="�ڸ�����" onclick="movieSeatCreate();">
		</td>
	</tr>
</table>
</form>
<div id="seat"></div>
</body>
<script>
function movieSeatCreate() {
	$.ajax({
		url: "theaterAdd.do?width="+$('#width').val()+"&height="+$('#height').val()+"&theater="+$('#theater').val(),
		type: "get",
		dataType: "html",
		success: function(data) {
			$('#seat').html(data);
		},
		error: function(){
			alert('�ٽ� �õ� �ٶ�');
		}
	});
};
</script>
</html>
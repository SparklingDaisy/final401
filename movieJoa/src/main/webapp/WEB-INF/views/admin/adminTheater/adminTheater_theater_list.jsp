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
<link rel="stylesheet" type="text/css" href="css/adminMovie_list.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function theaterDelete(idx){
	if(window.confirm('���� �󿵰��� ������ �Ͻðڽ���?')){
		location.href='theaterDelete.do?the_idx='+idx;
	}else{
		window.alert('��ҵǾ����ϴ�.');
	}
}
</script>
<style>
td{
	text-align:center;
}
#addlink{
	text-align:right;
}
</style>
</head>
<body>
<c:import url="../../header_admin.jsp"></c:import>
<div class="mainBox">
<div class="div_title"><h2 class="title">| �󿵰� ���</h2></div>
<div class="table_wrap_list">

<table class="main_table_list">
		<c:if test="${not empty list }">
		<thead>
		<tr>
				<th>�󿵰�</th>
				<th>����</th>
				<th>����</th>
				<th>����</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="i" items="${list }">
				<tr>
					<td>${ i.the_theater}��</td>
					<td>${ i.the_width }</td>
					<td>${i.the_height }</td>
					<td>
						<input type="button" value="�󿵰� ����" class="list_s_btn" onclick="theaterDelete(${i.the_idx})">
					</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
		<tr>
			<td><a href="theaterAddForm.do" id="addlink">�󿵰� �¼� ���</a></td>
		</tr>
	</tfoot>
		</c:if>
		<c:if test="${empty list }">
			<tr>
				<td>��ϵ� �󿵰��� �����ϴ�.</td>
			</tr>
			<tr>
				<td><a href="theaterAddForm.do" id="addlink">�󿵰� �¼� ���</a></td>
			</tr>
		</c:if>
</table>
</div>
</div>
<c:import url="../../footer.jsp"></c:import>
</body>
</html>
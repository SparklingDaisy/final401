<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/main_admin.css">
</head>
<body>
<c:import url="/WEB-INF/views/header_admin.jsp"></c:import>
<c:import url="/WEB-INF/views/admin/adminMember/adminMember_sideBar.jsp"></c:import>
<h1>상세 조회</h1>
<section>
	<article>
		<form>
			<table>
				<tr>
					<td>성별</td>
					<td><input type="radio" value="남" name="mem_gender">남
					<input type="radio" value="여" name="mem_gender">여
					<input type="radio" value="all" name="mem_gender">모두</td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="text" ></td>
				</tr>
			</table>
		</form>
	</article>
</section>
</body>
</html>
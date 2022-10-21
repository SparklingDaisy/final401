<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/main.css?ver=3">
<link rel="stylesheet" type="text/css" href="css/joaHelpDesk.css?ver=3">
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<c:import url="../../header.jsp"></c:import>
<br>
<section>
<div class="helpDesk_main">
<div class="manyHelpMain">
	<h4 class="manyHelpSubject">자주찾는 질문</h4> <div align="right"><input type="button" value="게시글 작성" class="writebutton" onclick="location.href='manyWrite.do'"></div>
	<div class="manyHelpIntroduce">회원님들께서 가장 자주하시는 질문을 모았습니다.<br>
	관리자들을 문제 발견 시 최고 관리자에게 보고바랍니다.</div>
	<br>
	<form name="manyHelpSerchFM" action="adminSerchManyHelp.do">
	<div class="manyHelpSerch"><input class="serchbar" type="text" name="keyword">&nbsp;<input class="button" type="submit" value="검색하기"></div>
	</form>
	<br>
	<div class="box">
		<ul class="manyHelpSerchBarFeild">
			<li class="menuli"><a style="${backA_color}"class="a" href="adminHelpDesk.do">전체</a></li>
			<li class="menuli"><a style="${backB_color}"class="a" href="adminManyHelp.do?type=예매/매표">예매/매표</a></li>
			<li class="menuli"><a style="${backC_color}"class="a" href="adminManyHelp.do?type=결제수단">결제수단</a></li>
			<li class="menuli"><a style="${backD_color}"class="a" href="adminManyHelp.do?type=포인트/쿠폰">포인트/쿠폰</a></li>
			<li class="menuli"><a style="${backE_color}"class="a" href="adminManyHelp.do?type=할인혜택">할인혜택</a></li>
			<li class="menuli"><a style="${backF_color}"class="a" href="adminManyHelp.do?type=스토어샵">스토어샵</a></li>
			<li class="menuli"><a style="${backG_color}"class="a" href="adminManyHelp.do?type=홈페이지">홈페이지</a></li>
		</ul>
	</div>
	<br>
	
</div>
	<div class="manyHelpContent">
	<div>
		<table class="manyHelpBorder">
			<thead>
				<tr>
					<th class="manyHelpBordertype">구분</th>
					<th>제목</th>
					<th class="manyHelpBorderReadnum">조회수</th>
				</tr>
			</thead>
			<tbody>
			<c:if test="${empty list }">
				<tr>
					<td colspan="3" align="center">등록된 게시글이 없습니다.</td>
				</tr>
			</c:if>	
			<c:forEach var="dto" items="${list }">
				<c:url var="manyHelpUrl" value="adminManyHelpBorder.do">
					<c:param name="idx">
					${dto.lfq_idx }
					</c:param>
				</c:url>
				<tr>
					<td class="manyHelpBordertype">${dto.lfq_type }</td>
					<td><a href="${manyHelpUrl }">${dto.lfq_subject }</a></td>
					<td class="manyHelpBorderReadnum">${dto.lfq_readnum }</td>
				</tr>
			</c:forEach>
			</tbody>
			<tfoot>
			<tr>
			<td colspan="4" align="center">
				${pageStr }
			</td>
			</tr>
			</tfoot>
		</table>
	</div>
	</div>
	<ul class="helpMenu">
		<li><a href="adminHelpDesk.do">자주찾는 질문</a></li>
		<li><a href="adminNotice.do">공지게시판</a></li>
		<li><a href="adminEmailHelp.do">이메일문의</a></li>
		<li><a href="memberHelp.do">1:1문의</a></li>
		<li><a href="topAdmin.do">지점관리자 답변내역</a></li>
	</ul>
</div>
</section>
<c:import url="../../footer.jsp"></c:import>
</body>
</html>
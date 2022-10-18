<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/main.css">
<link rel="stylesheet" type="text/css" href="css/joaHelpDesk.css">
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<c:import url="../../header.jsp"></c:import>
<br>
<section>
<div class="helpDesk_main">
<div class="manyHelpMain">
	<h4 class="manyHelpSubject">자주찾는 질문</h4>
	<div class="manyHelpIntroduce">회원님들께서 가장 자주하시는 질문을 모았습니다.<br>
	궁금하신 내용에 대해 검색해보세요</div>
	<br>
	<form name="manyHelpSerchFM" action="manyHelpSerch.do">
	<div class="manyHelpSerch"><input class="serchbar" type="text" name="keyword">&nbsp;<input class="button" type="submit" value="검색하기">&nbsp;&nbsp;추천 검색어 | 현금영수증 | 관람권 | 결제 | 예매</div>
	</form>
	<br>
	<div class="box">
		<ul class="manyHelpSerchBarFeild">
			<li class="menuli"><a style="${backA_color}"class="a" href="manyHelp.do">전체</a></li>
			<li class="menuli"><a style="${backB_color}"class="a" href="serchManyHelp.do?type=예매/매표">예매/매표</a></li>
			<li class="menuli"><a style="${backC_color}"class="a" href="serchManyHelp.do?type=결제수단">결제수단</a></li>
			<li class="menuli"><a style="${backD_color}"class="a" href="serchManyHelp.do?type=포인트/쿠폰">포인트/쿠폰</a></li>
			<li class="menuli"><a style="${backE_color}"class="a" href="serchManyHelp.do?type=할인혜택">할인혜택</a></li>
			<li class="menuli"><a style="${backF_color}"class="a" href="serchManyHelp.do?type=스토어샵">스토어샵</a></li>
			<li class="menuli"><a style="${backG_color}"class="a" href="serchManyHelp.do?type=홈페이지">홈페이지</a></li>
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
			<tr>
				<td class="manyHelpBordertype">${dto.lfq_type }</td><td>${dto.lfq_subject }</td><td class="manyHelpBorderReadnum">${dto.lfq_readnum }</td>
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
		<li><a href="helpDesk.do">고객센터</a></li>
		<li><a href="manyHelp.do">자주찾는 질문</a></li>
		<li><a href="notice.do">공지게시판</a></li>
		<li><a href="emailHelp.do">이메일문의</a></li>
		<li><a href="oneByOneHelp.do">1:1문의</a></li>
	</ul>
	
</div>
</section>
<c:import url="../../footer.jsp"></c:import>
</body>
</html>
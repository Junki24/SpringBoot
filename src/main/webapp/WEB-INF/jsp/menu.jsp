<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

<!-- HOME, 메모장, 방명록페이지로 가는 링크를 추가 -->
<a href="${path}/">Home</a> |
<a href="${path}/memo.do">메모장</a> |
<a href="${path}/guestbook.do">방명록</a> |
<div style="text-align:right;">

    <c:choose>
        <!-- 세션에 저장된 유저의 아이디가 NULL이면 로그인페이지로 이동 -->
        <c:when test="${sessionScope.userid == null }">

            <!-- 로그인 페이지로 이동하는 링크 -->
            <a href="${path}/member/login.do">로그인</a>
        </c:when>

        <c:otherwise>
            <!-- 세션에 저장된 유저의 아이디가 NULL이 아니라면 로그인 중이라는 메시지를 출력한다. -->
            ${sessionScope.name}님이 로그인중입니다.

            <!-- 로그인중이므로 로그아웃 할 수 있는 링크를 추가한다. -->
            <a href="${path}/member/logout.do">로그아웃</a>

        </c:otherwise>
    </c:choose>
</div>
<hr>

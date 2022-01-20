<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%@ include file="include/header.jsp" %>
</head>
<body>
<%@ include file="include/menu.jsp" %>
<h1>Welcome!</h1>
<c:if test="${sessionScope.userid != null}">
    <!-- 만약 세션에 유저의 아이디가 저장되어 있으면 방문을 환영한다는 메시지 출력 -->
    <h2>${sessionScope.name}(${sessionScope.userid})님의
        방문을 환영합니다.
    </h2>
</c:if>
</body>
</html>

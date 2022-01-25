<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>회원가입</h2>
<!-- 유저의 아이디와 비밀번호, 이름을 작성하고 확인 버튼을 누르면 컨트롤러의 member_join.do로 맵핑된다. -->
<form method="post" action="${path}/member/member_join.do">
    아이디 : <input name="_id"><br>
    비번 : <input type="password" name="passwd"><br>
    이름 : <input name="name"><br>
    <input type="submit" value="확인">
</form>
</body>
</html>
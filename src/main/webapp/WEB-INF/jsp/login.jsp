<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>로그인 페이지</title>

    <!-- 로그인 페이지 -->
    <%@ include file="../include/header.jsp" %>
    <script>
        $(function(){


            //밑에 있는 id가 #btnLogin으로 맵핑되는 함수, 클릭 버튼을 누르면 컨트롤러에 있는 login_check.do로 form1에 저장된 자료를 넘긴다.
            $("#btnLogin").click(function(){
                $("#form1").attr("action","/member/login_check.do");
                $("#form1").submit();

            });


            //밑에 있는 id가 #btnJoin으로 맵핑되는 함수, 클릭 버튼을 누르면 컨트롤러에 있는 join.do라는 새로운 페이지로 이동시킨다.
            //컨트롤러의 join.do로 이동했다가 회원가입페이지로 이동할 예정
            $("#btnJoin").click(function(){
                $(location).attr("href","/member/join.do")
            });
        });

    </script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>로그인하세요</h2>

<form name ="form1" id="form1" method="post">
    <table border="1" style="width: 400px">

        <tr>
            <td>아이디</td>
            <td><input type="text" name="_id" id = "_id" /></td>
            <!-- 데이터베이스에 아이디가 _id로 되어있기 때문에 _id로 한다. -->
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="passwd" id = "passwd" /></td>
            <font color="red">${map.message}</font></td>
            <!--비밀번호가 틀렸을때 되돌아와서 표시할 메시지-->
            <!-- 비밀번호의 타입을 password로 하고 이름을 passwd로 한다. -->
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" id="btnLogin" value="로그인" />
                <!-- 로그인을 버튼을  누르면 id값이 위쪽에 있는 스크립트에 맵핑된다.-->

                <input type="button" id="btnJoin" value="회원가입" />
                <!-- 회원가입 버튼을 누르면 id값이 위쪽에 있는 스크립트에 맵핑된다.-->
            </td>
        </tr>
    </table>
</form>
</body>
</html>

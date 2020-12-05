<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>HttpServletRequest 클래스를 사용하면 값이 없어도 매핑은 된다!</p>
	<small>GET방식으로 확인!</small> <br/>
	<small>form/confirmUserInfo?id=아이디&pw=비밀번호</small><br/>
	
	<!-- model에 담겨진 값 -->
	ID : ${id} <br/>
	PW : ${pw} <br/>
</body>
</html>
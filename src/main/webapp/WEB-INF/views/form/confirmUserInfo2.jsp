<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>@RequestParam에 반드시 값이 있어야 매핑이 된다. 
	값이 없으면 400에러를 발생시킨다!</p>
	<small>GET방식으로 확인!</small> <br/>
	
	<!-- model에 담겨진 값 -->
	NAME : ${name} <br/>
	AGE : ${age}
</body>
</html>
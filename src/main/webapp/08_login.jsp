<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="RadioServlet">
		<label for="gender">성별: </label>
		<input type="radio" id="gender" name="gender" value="male" checked> 남자
		<input type="radio" id="gender" name="gender" value="female"> 여자 <br><br>
		<label for="chk_mail"> 메일 정보 수신 여부: </label>
		<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> 수신
		<input type="radio" id="chk_mail" name="chk_mail" value="no"> 거부 <br><br>
		<label for="content"> 가입인사 적기</label>
		<textarea id="content" name="content" rows="3" cols="35"></textarea><br>
		<input type="submit" value="보내기">
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Page</title>
</head>
<body>
<h1>my 페이지</h1>
<jsp:include page="common/top.jsp" flush="true"/><br>
<hr>
<jsp:include page="mypage/mypage.jsp" flush="true"/><br>
</body>
</html>
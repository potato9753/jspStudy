<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Dept 등록화면</h3>
<form action="DeptWriteController"  method="get">
 부서번호:<input type="text" name="deptno"><br>
 부서명:<input type="text" name="dname"><br>
 부서위치:<input type="text" name="loc"><br>
 이메일1:<input type="text" name="email"><br>
 이메일2:<input type="text" name="email"><br>
<input type="submit" value="저장">
</form>

</body>
</html>
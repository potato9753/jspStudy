<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty login }">
	<a href="LoginUIController">로그인</a>&nbsp;<a href="">회원가입</a>
</c:if>
<c:if test="${!empty login }">
안녕하세요.${login.username}
	<a href="LogoutController">로그아웃</a>&nbsp;<a href="MyPageController">마이페이지</a>
</c:if>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="/res/style.css"/>"/>
</head>
<body>

    <div class="topnav">
        <div style="max-width: 1000px; margin:auto;">
            <a class="home" href="/">
                <img alt="Buy and Fly" src="/res/baf.png" width="50px" height="50px" border="0" style="display: block;">
            </a>
            <div class="topnavbtns">
                <div class="catalog">
                <a href="/catalog" class="catalogbtn">Каталог</a>
                <div class="catalog-content">
                    <a href="/catalog?airplanes">Самолёты</a>
                    <a href="/catalog?helicopters">Вертолёты</a>
                    <a href="/catalog?balloons">Воздушные шары</a>
                    <a href="/catalog?umbrellas">Зонты</a>
                </div>
                </div>
                <a href="/contacts">Контакты</a>
                <a href="/about">О компании</a>
                <div class="topnav-right">
                    <c:choose>
                        <c:when test="${user.login == null}">
                            <%@include file="/WEB-INF/pages/login.jsp"%>
                            <a href="/register">Регистрация</a>
                        </c:when>
                        <c:otherwise>
                            <a href="/cabinet">Личный кабинет</a>
                            <a href="/">Выйти</a>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
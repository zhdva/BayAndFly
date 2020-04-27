<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Каталог</title>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
    <%@include file="/WEB-INF/pages/nav.jsp"%>
    <table class="catalog">
    <caption class="heading">Каталог</caption>
        <c:if test="${devicesCount > 0}">
            <tr>
                <th>Название</th>
                <th>Количество пассажиров</th>
                <th>Максимальная скорость</th>
                <th>Цена</th>
                <th colspan="2" class="right-side">action</th>
            </tr>
            <c:forEach var="device" items="${devices}" varStatus="i">
                <tr>
                    <td class="title">${device.title}</td>
                    <td>${device.numberOfPassengers}</td>
                    <td>${device.maxSpeed} км/ч</td>
                    <td>${device.price}</td>
                    <td>
                        <a href="/">Взад</a>
                    </td>
                    <td class="right-side">
                        <a href="/catalog">+++</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${devicesCount == 0}">
            <tr>
                <td colspan="6" style="font-size: 150%" class="left-side right-side">
                    Каталог пуст :(
                </td>
            </tr>
        </c:if>
    </table>
</body>
</html>
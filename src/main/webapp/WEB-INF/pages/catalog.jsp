<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Каталог</title>
    <link rel="stylesheet" type="text/css" href="/res/catalog.css"/>
</head>
<body>
    <%@include file="/WEB-INF/pages/nav.jsp"%>

    <div class="content">
        <h2>Каталог</h2>
        <c:if test="${devicesCount > 0}">
            <c:forEach var="device" items="${devices}" varStatus="i">
                <div class="devicebox">
                    <a href="/catalog/${device.id}" class="deviceref">
                        <div>
                            <img alt="Device" src="/res/images/device${device.id}.png">
                            <div class="shortdscr">
                                <h3>${device.title}</h3>
                                <p>Макс. скорость: ${device.maxSpeed} км/ч, Кол-во пассажиров: ${device.numberOfPassengers}</p>
                            </div>
                        </div>
                    </a>
                    <div class="price">
                        <p>${device.price} Р</p>
                        <button onclick="/buy">Купить</button>
                    </div>
                </div>

                <hr color="gray">
            </c:forEach>
        </c:if>
        <c:if test="${devicesCount == 0}">
            <p>Каталог пуст :(</p>
        </c:if>
    </div>
</body>
</html>
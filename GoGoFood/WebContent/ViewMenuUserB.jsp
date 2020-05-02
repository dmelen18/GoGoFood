<!-- 
Put name on where you contributed.

Design:Team
Code:David
Review:Samantha
Test:

 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcut icon" href="/images/hamburgerClipart.png">
    <title>GoGo Food Delivery</title>
    <link rel="stylesheet" type="text/css" href="GGF.css">
</head>

<body>
    
    <ul class="topnav">
        <li><img src="img/USEgogofoodlogo1.jpg" id="logo" alt="GoGo Food logo" style="width:150px;height:120px"></li>
    </ul>
    <h1>Welcome Runners</h1>
    <p>Thank you for participating in delivery</p>
    
    <c:choose>
        <c:when test="${orders.size() > 0}">
        <h2>Orders available for delivery</h2>
        <table border = "1" style = "border-collapse: collapse">
        <tr><th>Name</th><th>Location</th><th>Phone Number</th><th>Order Details</th><th>Runner</th></tr>
            <c:forEach items="${orders}" var="order">
                <tr>
                <td>${order.getName()}</td>
                <td>${order.getPhoneNumber()}</td>
                <td>${order.getLocation()}</td>
                <td>${order.printItems()}</td>
                <c:if test="${order.getRunner() == null}">
                	<td><a href = "Deliver?id=${order.getId()}">Sign up to deliver</a></td>
                </c:if>
                <c:if test="${order.getRunner() != null}">
                	<td>${order.getRunner()}</td>
                </c:if>
                </tr>
            </c:forEach>
        </table>
        </c:when>
        <c:otherwise><p>No orders at the moment please try again later</p></c:otherwise>
    </c:choose>

    <!-- FOOTER -->
    <footer class="footer">
        </div>
        ©2020 GoGo Food - California State University, Los Angeles
    </footer>
    <!-- END OF FOOTER -->

</body>

</html>
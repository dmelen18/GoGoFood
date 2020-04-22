<!-- 
Put name on where you contributed.

Design:
Code: Ana
Test:
Review: 

 -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoGo Food - Shopping Cart</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<div class='container'>

<div class='row py-4 border-bottom'>
<div class='col' align='center'>
<h3><b>Shopping Cart</b></h3>
<p class='h5 text-muted'>${fn:length(orderItems)} items in cart</p>
</div>
</div>

<div class='row py-4'>
<div class='col-8 border-right'>
<table class='table table-hover table-borderless'>

<c:forEach items='${orderItems}' var='item'>
<tr>
<td>${item.itemName}<p class='text-muted'>${item.comments}</p></td>
<td class='text-right'>${item.itemPrice}</td>
</tr>
</c:forEach>

</table>
</div>

<div class='col-4'>
<table class='table table-hover table-borderless'>

<tr class='h5'>
<th>Order Summary</th>
</tr>

<tr>
<td>Subtotal</td>
<td>$0.00</td>
</tr>

<tr>
<td>Delivery</td>
<td>$0.00</td>
</tr>

<tr>
<td>Est. taxes & fees</td>
<td>$0.00</td>
</tr>


<tr class='font-weight-bold'>
<td>Total</td>
<td>$0.00</td>
</tr>
</table>
</div>
</div>
</div>

<!-- FOOTER -->
<!--     <footer class="footer"> -->
<!--         ©2020 GoGo Food - California State University, Los Angeles -->
<!--     </footer> -->
<!-- END OF FOOTER -->
    
</body>
</html>
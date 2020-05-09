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
	<title>GoGo Food Shopping Cart</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<!-- used styling code from Peter's FoodRequest.jsp for consistency -->
	<script src="https://kit.fontawesome.com/0c497e39db.js" crossorigin="anonymous"></script>
    <style>
        body{
            background-color: #FFCE00;
        }
        .container.spacer{
            padding: 50px;
        }
        .footer{
            position: fixed;
            left: 0;
            right: 0;
            bottom: 0;
            padding: 10px;
            background-color: ##FFCE00;
            color: #AFAFAF !important;
            text-align: center; /
            line-height: 20px;
            */
        }
    </style>
</head>
<body>
	<!-- TO INCLUDE THE NAVBAR THAT IS USED ACROSS ALL THE WEBPAGES -->
    <div class='container p-1'>
    	<div class='row py-4'>
    		<div class='col align-self-center'>
				<div class='card'>
					<div class='card-body'>
						<div class='row py-4 border-bottom'>
							<div class='col' align='center'>
								<h3><b>Shopping Cart</b></h3>
								<p class='h5 text-muted'>${fn:length(shoppingCart.items)} items in cart</p>
							</div>
						</div>
					
						<div class='row py-4'>
							<div class='col-8 border-right'>
								<table class='table table-hover table-borderless'>
									<c:forEach items='${shoppingCart.items}' var='item'>
										<tr>
											<td>${item.itemName}</td>
											<td class='text-right'>$${item.itemPrice}</td>
										</tr>
									</c:forEach>
								</table>
							</div>
				
							<div class='col-4'>
								<table class='table table-hover table-borderless'>
									<tr class='h5'>
										<th colspan='2'  style="text-align:center">Order Summary</th>
									</tr>
									
									<tr>
										<td>Subtotal</td>
										<td style="text-align:right">$${subtotalCost}</td>
									</tr>
									
									<tr>
										<td>Delivery</td>
										<td style="text-align:right">$${deliveryCost}</td>
									</tr>
									
									<tr>
										<td>Est. taxes & fees</td>
										<td style="text-align:right">$${feesCost}</td>
									</tr>
									
									
									<tr class='font-weight-bold'>
										<td>Total</td>
										<td style="text-align:right">$${totalCost}</td>
									</tr>
									
									
									<c:if test='${totalCost > 0.00}'>
										<form action='OrderManagementS' method='post'>
											<tr>
												<td colspan='2'><input type='submit' class='btn btn-dark btn-block' value='Pay with card'></td>
											</tr>
											
											<tr>
												<td colspan='2'><input type="image" id="image" alt="Login"
       src="img/paypal.png"></td>
											</tr>
										</form>
									</c:if>
									
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<footer class="footer">©2020 GoGo Food - California State University, Los Angeles</footer>
</body>
</html>
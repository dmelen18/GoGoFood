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
	<!-- used styling code from Peter's FoodRequest.jsp for consistency -->
	<script src="https://kit.fontawesome.com/0c497e39db.js" crossorigin="anonymous"></script>
    <style>
        body{
            background-color: orange;
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
            background-color: #efefef;
            color: #AFAFAF !important;
            text-align: center; /
            line-height: 20px;
            */
        }
    </style>  
</head>
<body>
	<!-- START - used styling code from Peter's FoodRequest.jsp for consistency -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">GoGoFood</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">
            <a class="nav-item nav-link active" href="MainHomePage">Home <span class="sr-only">(current)</span></a>
            <a class="nav-item nav-link active" href="ShoppingCartS">Shopping Cart</a>
          </div>
        </div>
      </nav>
    <!-- END - used styling code from Peter's FoodRequest.jsp for consistency -->
    <div class='container'>
    	<div class='row'>
    		<div class='col align-self-center'>
				<div class='card'>
					<div class='card-body'>
						<div class='row py-4 border-bottom'>
							<div class='col' align='center'>
								<h3><b>Shopping Cart</b></h3>
								<p class='h5 text-muted'>${fn:length(shoppingCart)} items in cart</p>
							</div>
						</div>
					
						<div class='row py-4'>
							<div class='col-8 border-right'>
								<table class='table table-hover table-borderless'>
					
								<c:forEach items='${shoppingCart}' var='item'>
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
										<th>Order Summary</th>
									</tr>
									
									<tr>
										<td>Subtotal</td>
										<td>$${subtotalCost}</td>
									</tr>
									
									<tr>
										<td>Delivery</td>
										<td>$${deliveryCost}</td>
									</tr>
									
									<tr>
										<td>Est. taxes & fees</td>
										<td>$${feesCost}</td>
									</tr>
									
									
									<tr class='font-weight-bold'>
										<td>Total</td>
										<td>$${totalCost}</td>
									</tr>
									
									<tr>
										<c:if test='${totalCost > 0.00}'>
											<td><button type='button' class = btn btn-primary'>Pay Now</button></td>
										</c:if>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- FOOTER -->
	<footer class="footer">
	©2020 GoGo Food - California State University, Los Angeles
 	</footer>
	<!-- END OF FOOTER -->
	 
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
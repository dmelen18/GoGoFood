<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<title>GoGo Food Order Management</title>
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
	<div class='container p-3'>
		<div class='card'>
			<div class='card-body'>
				<div class='row py-4 border-bottom'>
					<div class='col' align='center'>
						<h3><b>Order Management</b></h3>
					</div>
				</div>
				
				<div class='row py-4 border-bottom'>
					<div class='col-4 align-self-center border-right'>
						<table class='table table-sm table-borderless'>
							<tr>
								<th style='text-align:center'>User details</th>
							</tr>
							<tr>
								<td style='text-align:center'>${shoppingCart.name}</td>
							</tr>
							<tr>
								<td style='text-align:center'>${shoppingCart.phoneNumber}</td>
							</tr>
							<tr>
								<td style='text-align:center'>${shoppingCart.location}</td>
							</tr>
						</table>
					</div>
					
					<div class='col-8 align-self-center'>
						<table class='table table-sm table-borderless'>
							<tr>
								<th colspan='2' style='text-align:center'>Order Details</th>
							</tr>
							
							<c:forEach items='${shoppingCart.items}' var='item'>
								<tr>
									<td>${item.itemName}</td>
									<td class='text-right'>$${item.itemPrice}</td>
								</tr>
							</c:forEach>
							
							<tr class='font-weight-bold'>
								<td>Total</td>
								<td style="text-align:right">$${totalCost}</td>
							</tr>
						</table>
					</div>
				</div>
				
				<div class='row p-4'>
					<div class='col' align='center'>
						<table class='table table-sm table-borderless'>
							<tr>
								<th colspan='2' style='text-align:center'>Order Updates</th>
							</tr>

							<tr>
								<td>${date}</td>
								<td class='text-right'>${status}</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<footer class="footer">©2020 GoGo Food - California State University, Los Angeles</footer>
</body>
</html>
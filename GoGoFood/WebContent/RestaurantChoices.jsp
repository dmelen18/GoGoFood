<!-- 
Put name on where you contributed.

Design: Samantha
Code: Samantha
Test:
Review:

 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>GoGo Food | CSULA Restaurant Options</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/restaurants.css">
<script src="https://kit.fontawesome.com/0c497e39db.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- **************************** START OF NAV BAR *********************************************** -->
	<ul class="topnav">
		<li class="right">
			<div class="navbar-nav ml-lg-auto">
				<a href="ShoppingCartS"><i class="fas fa-shopping-cart"></i>
					Cart</a>
			</div>
		</li>
		<li class="right"><a href="#Sign Up"><i
				class="fas fa-user-plus"></i> Sign Up</a></li>
		<li class="right"><a href="#Sign In"><i class="fas fa-user"></i>
				Sign In</a></li>
		<li class="right"><a href="MainHomePage"><i
				class="fas fa-home"></i></a></li>
		<a href="MainHomePage"><img src="img/USEgogofoodlogo1.jpg"
			id="logo" alt="GoGo Food logo" style="width: 120px; height: 80px"></a>
		<h1 class="text-center">Pick a Place to Order From</h1>
	</ul>
	<!--  END OF NAV BAR  -->

	<!-- **************************** FOOD COURT *********************************************** -->
	<div class="container spacer">
		<div class="top-banner">
			<h2 class="text-center">Currently Serving</h2>
		</div>

		<div class="row justify-content-between mb-5">
			<c:forEach items='${foodCourtOptions}' var='foodCourtOptions'>
				<form action="RestaurantChoices" method="POST">
					<div class="col justify-content-between mb-5">
						<div class="card text-center" style="width: 20rem;">
							<img src='${foodCourtOptions.link}' alt="Food Court Option"
								style="width: 250px; height: 150px;">
							<div class="card-body">
								<input type="hidden" name='id' value='${foodCourtOptions.id}'>
								<a href='FoodRequest'><button
										class="btn btn-primary disable" type='button'
										onclick="FoodRequest">
										<i class="fas fa-thumbs-up"></i> Order Here
									</button></a>
							</div>
						</div>
				</form>
			</c:forEach>
		</div>
	</div>
	<!-- END OF FOOD COURT -->

	<!-- **************************** COMING SOON *********************************************** -->
	<div class="container spacer">
		<div class="top-banner">
			<h2 class="text-center">COMING SOON</h2>
		</div>
		<div class="row justify-content-between mb-5">
			<c:forEach items='${diningOptions}' var='diningOptions'>
				<form action="FoodRequest" method="POST">
					<div class="col justify-content-between mb-5">
						<div class="card text-center" style="width: 20rem;">
							<img src='${diningOptions.link}' alt="Dining Option"
								style="width: 250px; height: 150px;">
							<div class="card-body">
								<input type="hidden" name='id' value='${diningOptions.id}'>
								<a href='FoodRequest'><button
										class="btn btn-primary disabled" type='submit'>
										<i class=""></i> Coming Soon
									</button></a>
							</div>
						</div>
					</div>
				</form>
			</c:forEach>

		</div>
	</div>
	<!-- END OF COMING SOON-->

	<footer class="footer"> ©2020 GoGo Food - California State
		University, Los Angeles </footer>





	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
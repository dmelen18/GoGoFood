

<!-- 
Put name on where you contributed.

Design:
Code:
Test:
Review:

 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GoGo Food | Order Food </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
   	<link rel="stylesheet" href="css/foodrequest.style.css">
   	<script src="https://kit.fontawesome.com/0c497e39db.js" crossorigin="anonymous"></script>
</head>
<body>
	<!--  START OF NAV BAR  -->
	<ul class="topnav">
		<li><img src="img/USEgogofoodlogo1.jpg" id="logo"
			alt="GoGo Food logo" style="width: 150px; height: 120px"></li>
        <li class="right"><a href="#Sign Up"><i class="fas fa-user-plus"></i> Sign Up</a></li>
        <li class="right"><a href="#Sign In"><i class="fas fa-user"></i> Sign In</a></li>
		<li>
			<div class="floating">
				<div class="card-object rotate">
				</div><!-- card-object rotate -->
			</div><!-- foating  -->
		</li>
	</ul>
	<!--  END OF NAV BAR  -->
	
    <div class="container spacer">
    	<div class="top-banner">
    		<h1 class="text-center">ENJOY OUR TOP PICKS!</h1>
    	</div>
    </div>
    
    
    <div class="container">
            <div class="row justify-content-between mb-5">
        	<c:forEach items='${combos}' var='combo'> 
        		<form action="FoodRequest" method="POST">
		            <div class="col">
		                <div class="card text-center" style="width: 18rem;">
		                    <img class="card-img-top" src='${combo.link}' alt="Card image cap">
		                    <div class="card-body">
		                      <h5 class="card-title">${combo.itemName}</h5>
		                      <p class="card-text">$${combo.itemPrice}</p>
		                       <input type="hidden" name='id' value='${combo.id}'>
		                     <button class="btn btn-primary" type='submit'> <i class="fas fa-cart-plus"></i> Add to Cart</button>
		                    </div>
		                  </div>
		            </div>
	             </form>
	          </c:forEach>
        </div>
    </div>





        <footer class="footer text-center">
            ©2020 GoGo Food - California State University, Los Angeles
        </footer>





    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
<!-- 
Put name on where you contributed.

Design:
Code:
Test:
Review:

 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="shortcut icon" href="img/hamburgerClipart.png">
<title>GoGo Food</title>
<link rel="stylesheet" type="text/css" href="css/MainHomePage.css">
<script src="https://kit.fontawesome.com/0c497e39db.js"
    crossorigin="anonymous"></script>
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
					<header></header>
					<aside></aside>
					<main>
					<blockquote class="message">Knowledge isn't power <br> Until it's applied</blockquote><!--  random quote generator??? -->
					</main>
					<footer class="author">GoGo Food</footer>
				</div><!-- card-object rotate -->
			</div><!-- foating  -->
		</li>
	</ul>
	<!--  END OF NAV BAR  -->
	
 

	<div class="row">
		<div class="column">
			<div class="container">
				<div class="buttons">
					<a href="RestaurantChoices">Place an Order</a>
				</div>
			</div>
		</div>
		
		<div class="column">
			<div class="container">
				<div class="buttons">
					<a href="UserB_Deliver">Deliver an Order</a>
				</div>
			</div>
		</div>
		</div><!-- row -->

<!-- MEET THE TEAM -->
<div class="team">
<div class="rowTeam">
  <div class="columnTeam">
    <div class="cardTeam">
      <img src="img/hamburgerClipart.png" alt="John" style="width:50%">
      <div class="containerTeam">
        <h3>Peter Gatsby</h3>
        <p class="title">CEO & Founder</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
          <p><a href="mailto:pgatsby@calstatela.edu"><button class="buttonTeam"><i class="fas fa-envelope"></i> Contact</button></a></p>
      </div>
    </div>
  </div>

  <div class="columnTeam">
    <div class="cardTeam">
    <img src="img/theTeam/Ana.jpg" alt="John" style="width:50%">
      <div class="containerTeam">
        <h3>Ana Guardado</h3>
        <p class="title">CEO & Founder</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
         <p><a href="mailto:aguard12@calstatela.edu"><button class="buttonTeam"><i class="fas fa-envelope"></i> Contact</button></a></p>
      </div>
    </div>
  </div>
  
  <div class="columnTeam">
    <div class="cardTeam">
      <img src="img/theTeam/david.jpg" alt="John" style="width:50%">
      <div class="containerTeam">
        <h3>David Melendez</h3>
        <p class="title">CEO & Founder</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
          <p><a href="mailto:dmelen18@calstatela.edu"><button class="buttonTeam"><i class="fas fa-envelope"></i> Contact</button></a></p>
      </div>
    </div>
  </div>
  
    <div class="columnTeam">
    <div class="cardTeam">
    <img src="img/theTeam/samantha.png" alt="John" style="width:50%">
      <div class="containerTeam">
        <h3>Samantha Simpson</h3>
        <p class="title">CEO & Founder</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
        <p><a href="mailto:ssimps11@calstatela.edu"><button class="buttonTeam"><i class="fas fa-envelope"></i> Contact</button></a></p>
      </div>
    </div>
  </div>
</div> <!--  row -->
</div>


		<!-- FOOTER -->
		<footer class="footer">
	©2020 GoGo Food - California State University, Los Angeles
	</footer>
	<!-- END OF FOOTER -->

</body>
</body>
</html>
# GoGoFood
Group Project for a Software Engineering class at CSULA(2020).
Implemnting MVC architecture.

Approach for tackling as a group:For each of these sections indicate the person responsible for the section and
the people, if any, who provided assistance. For each method, a different
person should be responsible for each section. (Listing names will help us to know who to go to if we come across any questions)

*Design/strategy. Discuss the strategy the method uses to implement its
function. 
* Code. 
* Review. This section discusses the coding style issues the method
presented and why one approach was selected over another. For example,
does the code use a list comprehension or a for-loop. Why was the
particular choice made? 
* Testing. This section discusses the test cases that should be run to check
code functionality.
____________________________________________________________________________________


Model  ↔ package
 	UserAEntry.java 	 Person ordering food
 	UserBEntry.java 	 Person delivering food
 	Menu.java  Carl’s Jr. Menu(currently only Carl’s)
 	MainHomePage.java  Samantha
        ShoppingCart.java   David
		

 Controller   ↔ package
 	AddUserA.java
 	AddUserB.java
 	AddItem.java
 	EditItem.java
 	DeleteItem.java
        Deliver.java

View  ↔ package
 	Menu.jsp  Carl’s Jr. Menu
 	ViewMenuUserA.jsp   Person ordering food   Peter
 	ViewMenuUserB.jsp   Person delivering food   David
 	ShoppingCart.jsp   Ana
 	MainHomePage.jsp  Samantha
  Delivery.jsp   David

________________________________________________________________________________

UserAEntry.java
 	id
 	name 
	location  building name, room number
 	time 
 	phoneNumber
 	List<ShoppingCart> 

UserBEntry.java
 	id
 	name
 	phoneNumber
 	List<EveryDifferentUserAOrder>

Menu.java
 	itemName
 	itemPrice
 	itemCategory (revisit if have time to place items in categories) 
 	(optional photos)	

AddItem.java
 	itemName
 	itemPrice 

EditItem.java 
 	itemName
 	itemPrice

DeleteItem.java
 	itemName
 	itemPrice

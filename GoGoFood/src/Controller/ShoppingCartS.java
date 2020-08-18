package Controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FoodItem;
import Model.ShoppingCart;

@WebServlet(urlPatterns="/ShoppingCartS", loadOnStartup=2)
public class ShoppingCartS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShoppingCartS() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
    	//Get shoppingCart list from FoodRequest.java class
		ShoppingCart shoppingCart = (ShoppingCart) (getServletContext().getAttribute("shoppingCart"));
		
		//Calculate the costs for the shoppingCart
		double subtotalCost = 0;
		
		for (int i = 0; i < shoppingCart.getItems().size(); i++) {
			subtotalCost += shoppingCart.getItems().get(i).getItemPrice();
		}
		
		double deliveryCost = subtotalCost * 0.35;
		double feesCost = subtotalCost * 0.09;
		double totalCost = subtotalCost + deliveryCost + feesCost;
		
		//Formatter used to return doubles as 0.00 format.
		NumberFormat formatter = new DecimalFormat("#0.00"); 
		
		//Set attributes to be used for ShoppingCart.jsp
		getServletContext().setAttribute("shoppingCart", shoppingCart);
		getServletContext().setAttribute("subtotalCost", formatter.format(subtotalCost));
		getServletContext().setAttribute("deliveryCost", formatter.format(deliveryCost));
		getServletContext().setAttribute("feesCost", formatter.format(feesCost));
		getServletContext().setAttribute("totalCost", formatter.format(totalCost));
	
		//Forward request to ShoppingCart.jsp per MVC architecture
		request.getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}
}

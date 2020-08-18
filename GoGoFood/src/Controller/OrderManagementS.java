package Controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ShoppingCart;

@WebServlet("/OrderManagementS")
public class OrderManagementS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		ArrayList<ShoppingCart> orders = (ArrayList<ShoppingCart>) (getServletContext().getAttribute("orders"));
		ShoppingCart shoppingCart = (ShoppingCart) (getServletContext().getAttribute("shoppingCart"));
		String status = "This order has yet to be selected by a runner.";
		
		SimpleDateFormat formatter = new SimpleDateFormat("M/d/y h:mm a", new Locale("en", "US"));
		String date = formatter.format(new Date());
		
		for (ShoppingCart sc: orders) {
			if (sc.getId() == shoppingCart.getId()) {
				if (shoppingCart.getRunner() != null) {
					status = shoppingCart.getRunner().toString() + " has selected your order. They are on their way to the restaurant.";
				}
			}
		}
		
		double subtotalCost = 0;
		
		for (int i = 0; i < shoppingCart.getItems().size(); i++) {
			subtotalCost += shoppingCart.getItems().get(i).getItemPrice();
		}
		
		double deliveryCost = subtotalCost * 0.35;
		double feesCost = subtotalCost * 0.09;
		double totalCost = subtotalCost + deliveryCost + feesCost;
		
		//Formatter used to return doubles as 0.00 format.
		NumberFormat formatter2 = new DecimalFormat("#0.00"); 
		
		//Set attributes to be used for ShoppingCart.jsp
		getServletContext().setAttribute("shoppingCart", shoppingCart);
		getServletContext().setAttribute("subtotalCost", formatter2.format(subtotalCost));
		getServletContext().setAttribute("deliveryCost", formatter2.format(deliveryCost));
		getServletContext().setAttribute("feesCost", formatter2.format(feesCost));
		getServletContext().setAttribute("totalCost", formatter2.format(totalCost));
		getServletContext().setAttribute("status", status);
		getServletContext().setAttribute("date", date);
		request.getRequestDispatcher("/OrderManagementJ.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.sendRedirect("OrderManagementJ.jsp");
	}

}

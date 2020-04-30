package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FoodItem;
import Model.ShoppingCart;

@WebServlet("/OrderManagementS")
public class OrderManagementS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OrderManagementS() {
    	//Main list of ALL orders retrieved from UserB_Deliver.java class
    	@SuppressWarnings("unchecked")
		ArrayList<ShoppingCart> allOrder = (ArrayList<ShoppingCart>) (getServletContext().getAttribute("orders"));
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// check if this is coming from the runner module
		// if coming from the runner module, keep posted on the certain order
		
		//if coming from the shopping cart, use the shopping cart list for the user
		
		ArrayList<ShoppingCart> orders = (ArrayList<ShoppingCart>) getServletContext().getAttribute("orders");
		
		
		@SuppressWarnings("unchecked")
		ArrayList<FoodItem> order = (ArrayList<FoodItem>) getServletContext().getAttribute("shoppingCart");
		double totalCost = (double) getServletContext().getAttribute("totalCost");
		
		ArrayList<String> statuses = new ArrayList<String>();
		getServletContext().setAttribute("statuses", statuses);
		
		request.getRequestDispatcher("/OrderManagementJ.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String status = request.getParameter("status");
		
		@SuppressWarnings("unchecked")
		ArrayList<String> statuses = (ArrayList<String>) getServletContext().getAttribute("statuses");
		statuses.add(status);
		
		request.getRequestDispatcher("/OrderManagementJ.jsp").forward(request, response);
	}

}

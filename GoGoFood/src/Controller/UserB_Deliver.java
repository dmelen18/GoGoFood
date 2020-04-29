package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FoodItem;
import Model.ShoppingCart;


	@WebServlet(urlPatterns="/UserB_Deliver", loadOnStartup=1)
	public class UserB_Deliver extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       

	    public UserB_Deliver() {
	        super();
	    }
	    public void init (ServletConfig config) throws ServletException{
	    	super.init(config);
	    	ArrayList<ShoppingCart> list = new ArrayList<ShoppingCart>();
	    	ArrayList<FoodItem> items = new ArrayList<FoodItem>();
	    	items.add(new FoodItem("Chicken Tenders", 7.99));
	    	ArrayList<FoodItem> items2 = new ArrayList<FoodItem>();
	    	items2.add(new FoodItem("Famous Star Burger", 7.99));
	    	items2.add(new FoodItem("Small Fries", 1.99));
	    	list.add(new ShoppingCart(1, "David", "ETA-310", "231-345-9080", items));
	    	list.add(new ShoppingCart(2, "John", "SHC-123", "321-435-8901", items2));
	    	getServletContext().setAttribute("orders", list);
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("/ViewMenuUserB.jsp").forward(request, response);
		}


		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}
package Controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

import Model.FoodItem;
import Model.ShoppingCart;

/**
 * Servlet implementation class FoodRequest
 */
@WebServlet(urlPatterns="/FoodRequest", loadOnStartup=1)
public class FoodRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i = 0; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodRequest() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
//		Creating 3 Combo meals 
		FoodItem combo1 = new FoodItem(1,"All Star Meal", 6.99, "img/1.png");
		FoodItem combo2 = new FoodItem(2,"Gravity Burger", 10.99, "img/1.png");
		FoodItem combo3 = new FoodItem(3,"Cool Taco", 5.99, "img/1.png");
		
//		Creating Array to hold combos to display in JSP 
		ArrayList<FoodItem> combos = new ArrayList<FoodItem>();
		combos.add(combo1); combos.add(combo2); combos.add(combo3);
		getServletContext().setAttribute("combos", combos);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShoppingCart shoppingcart = new ShoppingCart(i++, "Dwayne the Rock Johnson", "310-0690-0420", "LIB");
		getServletContext().setAttribute("shoppingcart", shoppingcart);
		request.getRequestDispatcher("/FoodRequest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//gets user shoppingcart
		ShoppingCart shoppingcart = (ShoppingCart) (getServletContext().getAttribute("shoppingcart"));
		//retrieves users food request
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.print(id);
		// retrieve user's personal shoppingcart
		ArrayList<FoodItem> sc = (ArrayList<FoodItem>) getServletContext().getAttribute("shoppingCart");
		// retrieves possible food combos to match id
		ArrayList<FoodItem> combos = (ArrayList<FoodItem>) getServletContext().getAttribute("combos");
		//Searches combos for food with matching id to add to shopping cart
		for(FoodItem f: combos) {
			if(id == f.getId()) {
				shoppingcart.addItem(f);
			}
		}
		response.sendRedirect("FoodRequest");
	}

}

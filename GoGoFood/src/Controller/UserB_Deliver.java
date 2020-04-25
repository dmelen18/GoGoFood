package Controller;

	import java.io.IOException;
	import java.util.ArrayList;

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

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
	    	list.add(new ShoppingCart(1, "David", "ETA-310", "Famous Star Burger"));
	    	list.add(new ShoppingCart(2, "John", "SHC-123", "Chicken Tenders"));
	    	getServletContext().setAttribute("orders", list);
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("/ViewMenuUserB.jsp").forward(request, response);
		}


		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}
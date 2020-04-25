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

@WebServlet(urlPatterns="/ShoppingCartS", loadOnStartup=1)
public class ShoppingCartS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShoppingCartS() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	
    	ArrayList<FoodItem> shoppingCart = new ArrayList<FoodItem>();
		getServletContext().setAttribute("shoppingCart", shoppingCart);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		ArrayList<FoodItem> shoppingCart = (ArrayList<FoodItem>) (getServletContext().getAttribute("shoppingCart"));
		
		NumberFormat formatter = new DecimalFormat("#0.00"); 
		
		double subtotalCost = 0;
		
		for (int i = 0; i < shoppingCart.size(); i++) {
			subtotalCost += shoppingCart.get(i).getItemPrice();
		}
		
		double deliveryCost = subtotalCost * 0.40;
		double feesCost = subtotalCost * 0.09;
		double totalCost = subtotalCost + deliveryCost + feesCost;
		
		getServletContext().setAttribute("subtotalCost", formatter.format(subtotalCost));
		getServletContext().setAttribute("deliveryCost", formatter.format(deliveryCost));
		getServletContext().setAttribute("feesCost", formatter.format(feesCost));
		getServletContext().setAttribute("totalCost", formatter.format(totalCost));
	
		request.getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

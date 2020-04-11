package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FoodItem;

@WebServlet("/ShoppingCartS")
public class ShoppingCartS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShoppingCartS() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<FoodItem> orderItems = new ArrayList<>();
		FoodItem item1 = new FoodItem("Burger", "- Pickles", 4.99);
		orderItems.add(item1);
		
		FoodItem item2 = new FoodItem("Medium fries", 2.79);
		orderItems.add(item2);
		
		FoodItem item3 = new FoodItem("Small coke", 0.99);
		orderItems.add(item3);
		
		FoodItem item4 = new FoodItem("Chocolate milkshake", 1.59);
		orderItems.add(item4);
		
		FoodItem item5 = new FoodItem("Pie", 24.99);
		orderItems.add(item5);
		
		FoodItem item6 = new FoodItem("Taco", "- Onion", 3.49);
		orderItems.add(item6);
		
		FoodItem item7 = new FoodItem("Chicken tenders", 7.99);
		orderItems.add(item7);
		
		FoodItem item8 = new FoodItem("Noodles", 5.49);
		orderItems.add(item8);
		
		FoodItem item9 = new FoodItem("Burger", "- Lettuce", 24.99);
		orderItems.add(item9);
		
		
		getServletContext().setAttribute("orderItems", orderItems);
		
		request.getRequestDispatcher("/WEB-INF/ShoppingCartJ.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

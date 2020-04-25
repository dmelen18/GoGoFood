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
		ArrayList<FoodItem> shoppingCart = new ArrayList<FoodItem>();
		getServletContext().setAttribute("shoppingCart", shoppingCart);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

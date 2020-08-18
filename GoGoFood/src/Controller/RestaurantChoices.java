package Controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

import Model.Restaurants;


@WebServlet("/RestaurantChoices")
public class RestaurantChoices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RestaurantChoices() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	
//		Currently servicing     	
//		COMING SOON	
    	
    	
//		Creating food options
		Restaurants carlsJr = new Restaurants(1,"Carl's Jr.", "img/foodCourt/carlsjr.png");
//		Below food options are not yet available but COMING SOON
		Restaurants elPolo = new Restaurants(2,"elPolo", "img/foodCourt/elpolo.png");
		Restaurants sbarro = new Restaurants(3,"sbarro", "img/foodCourt/sbarro.png");
		Restaurants johnysKitchen = new Restaurants(4,"johnysKitchen", "img/foodCourt/johnysKitchen.jpeg");
		Restaurants kikka = new Restaurants(5,"kikka", "img/foodCourt/kikka.png");
		Restaurants theSpot = new Restaurants(6,"theSpot", "img/foodCourt/theSpot.jpg");
		Restaurants cafe47 = new Restaurants(7,"cafe47", "img/campusDining/cafe47.jpg");
		Restaurants everytable = new Restaurants(8,"everytable", "img/campusDining/everytable.png");
		Restaurants goldenEagleExpress = new Restaurants(9,"goldenEagleExpress", "img/campusDining/goldenEagleExpress.jpeg");
		Restaurants juiceItUp = new Restaurants(10,"juiceItUp", "img/campusDining/juiceItUp.png");
		Restaurants kingCoffee = new Restaurants(11,"kingCoffee", "img/campusDining/kingCoffee.jpeg");
		Restaurants starbucks = new Restaurants(12,"starbucks", "img/campusDining/starbucks.png");	
	
	
//		Creating Array to hold food options to display in JSP 
		ArrayList<Restaurants> foodCourtOptions = new ArrayList<Restaurants>();
		foodCourtOptions.add(carlsJr); 
	
		getServletContext().setAttribute("foodCourtOptions", foodCourtOptions);

		
//		Creating Array to hold dining options to display in JSP 
		ArrayList<Restaurants> diningOptions = new ArrayList<Restaurants>();
		diningOptions.add(elPolo); 
		diningOptions.add(sbarro);
		diningOptions.add(johnysKitchen);
		diningOptions.add(kikka);
		diningOptions.add(theSpot);
		diningOptions.add(cafe47); 
		diningOptions.add(everytable); 
		diningOptions.add(goldenEagleExpress);
		diningOptions.add(juiceItUp);
		diningOptions.add(kingCoffee);
		diningOptions.add(starbucks);
		getServletContext().setAttribute("diningOptions", diningOptions);
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/RestaurantChoices.jsp").forward(request, response);
	}


	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//retrieves users food request
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.print(id);
		// retrieve user's personal shoppingcart
		ArrayList<Restaurants> sc = (ArrayList<Restaurants>) getServletContext().getAttribute("shoppingCart");
		// retrieves possible food combos to match id
		ArrayList<Restaurants> options = (ArrayList<Restaurants>) getServletContext().getAttribute("options");
		//Searches combos for food with matching id to add to shopping cart
		for(Restaurants f: options) {
			if(id == f.getId()) {
				sc.add(f);
			}
		}
		response.sendRedirect("RestaurantChoices");
	}

}

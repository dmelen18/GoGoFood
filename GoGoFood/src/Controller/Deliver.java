package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Runner;
import Model.ShoppingCart;

@WebServlet("/Deliver")
public class Deliver extends HttpServlet {
	private Integer i ;
	private static final long serialVersionUID = 1L;

    public Deliver() {
        super();
    }

    private ShoppingCart getEntry( int id )
    {
        ArrayList<ShoppingCart> lists = (ArrayList<ShoppingCart>) getServletContext().getAttribute(
            "orders" );

        for( ShoppingCart s : lists )
            if(s.getId() == id) return s;

        return null;
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf( request.getParameter( "id" ) );
		this.i = id;
		request.setAttribute("id", id);
		ShoppingCart s = getEntry(i);
		request.setAttribute("name", s.getName());
		request.setAttribute("location", s.getLocation());
		request.setAttribute("details", s.printItems());
		request.getRequestDispatcher("Delivery.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShoppingCart s = getEntry(i);
		
		if(!request.getParameter("runner").equalsIgnoreCase("") && !request.getParameter("phone").equalsIgnoreCase("")){
			s.setRunner(new Runner(request.getParameter("runner"), request.getParameter("phone")));
		}
		response.sendRedirect( "UserB_Deliver" );
	}

}

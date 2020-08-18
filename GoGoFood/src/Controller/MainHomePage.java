/* 
Put name on where you contributed.

Design: Samantha 
Code: Samantha 
Test:
Review:

*/

package Controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainHomePage")
public class MainHomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MainHomePage() {
        super();
    }

 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		 request.getRequestDispatcher( "/MainHomePage.jsp" ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		doGet(request, response);
	}

}

package Beispiel1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**PrintWriter w = response.getWriter();
 * Servlet implementation class action
 */
@WebServlet("/action")
public class action extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public action() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String vn = request.getParameter("vname");
		String nn = request.getParameter("nname");
	
		
		if(vn.equals("Martin") && nn.equals("Schatz")) {
			 RequestDispatcher dispatcher = request
				      .getRequestDispatcher("/Welcome.html");
				    dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request
				      .getRequestDispatcher("/falschEingabe.html");
				    dispatcher.forward(request, response);
		}
		doGet(request, response);
		
	}

}
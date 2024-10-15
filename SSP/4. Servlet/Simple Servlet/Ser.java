package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ser
 */
public class Ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	String s1,s2;
    	s1=request.getParameter("txtName");
    	s2=request.getParameter("SSPM1");
    	int m1= Integer.parseInt(s2);
    	int m2= Integer.parseInt(request.getParameter("OSM1"));
    	int total = m1 +2;

    	out.println("Name" + s1);

    	out.println("Total Marks:"+ total);

    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class RegisterDB
 */
public class RegisterDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        try {
	            // Database connection
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet", "root", "root");

	            // Insert query to add user to the database
	            PreparedStatement ps = con.prepareStatement("INSERT INTO login (username, password) VALUES (?, ?)");
	            ps.setString(1, username);
	            ps.setString(2, password);

	            int result = ps.executeUpdate();
	            if (result > 0) {
	                out.println("<h2>Registration successful!</h2>");
	                RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	                rd.include(request, response);
	            } else {
	                out.println("<h2>Registration failed. Try again!</h2>");
	                RequestDispatcher rd = request.getRequestDispatcher("Register.html");
	                rd.include(request, response);
	            }

	            con.close();
	        } catch (Exception e) {
	            out.println("<h2>Error: " + e.getMessage() + "</h2>");
	        }
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

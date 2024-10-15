

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentForm
 */
public class StudentForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		String name = request.getParameter("txtName");

		        int sspMarks = Integer.parseInt(request.getParameter("ssp"));
		        int osMarks = Integer.parseInt(request.getParameter("os"));
		        int ccMarks = Integer.parseInt(request.getParameter("cc"));

		        // Calculate total marks and percentage
		        int totalMarks = sspMarks + osMarks + ccMarks;
		        double percentage = (totalMarks / 300.0) * 100;

		        boolean pass = percentage > 30;

		 
		        PrintWriter out = response.getWriter();
		        out.println("<html><head><title>Result</title></head><body>");
		        out.println("<h2>Result</h2>");
		       
		        out.println("<p>Name: " + name + "</p>");
		        out.println("<p>SSP Marks: " + sspMarks + "</p>");
		        out.println("<p>OS Marks: " + osMarks + "</p>");
		        out.println("<p>Third Subject Marks: " + ccMarks + "</p>");
		        out.println("<p>Total Marks: " + totalMarks + "</p>");
		        out.println("<p>Percentage: " + percentage + "%</p>");
		       
		        if (pass) {
		            out.println("<p><strong>Congratulations! You have passed.</strong></p>");
		        } else {
		            out.println("<p>Sorry, you have not passed.</p>");
		        }
		       
		        out.println("</body></html>");
		}


		protected void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

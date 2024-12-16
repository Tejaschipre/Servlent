

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Kiranservlent
 */
@WebServlet("/Kiranservlent")
public class Kiranservlent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fn");
		String lname=request.getParameter("ln");
        String email=request.getParameter("em");
        String mob_no=request.getParameter("te");
        String address=request.getParameter("add");
        String gender=request.getParameter("ge");
        String DOB=request.getParameter("dob");
        String city=request.getParameter("c");
        String state=request.getParameter("s");
        String country=request.getParameter("co");
        String age=request.getParameter("a");
		String degree=request.getParameter("d");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(DOB);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(age);
		System.out.println(degree);

PrintWriter out=response.getWriter();
		
		out.print(fname);
		out.print(lname);
		out.print(email);
		out.print(mob_no);
		out.print(address);
		out.print(gender);
		out.print(DOB);
		out.print(city);
		out.print(state);
		out.print(country);
		out.print(age);

		out.print(degree);




	}

}

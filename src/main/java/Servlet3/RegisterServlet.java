package Servlet3;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
 {
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 out.println("<h2> Welcome to register servlet</h2>");
	 String name=request.getParameter("user_name");
	 String Password=request.getParameter("password");
	 String Email=request.getParameter("email");
	 String gender = request.getParameter("user_gender");
	 String course=request.getParameter("user_course");
	 String cond = request.getParameter("condition");
	 out.println(cond);
	 if(cond!=null)
	 {
	 if(cond.equals("checked"))
	 {
		out.println("<h2> Name: " + name+"<h2>") ;
		out.println("<h2> Password: " + Password+"<h2>") ;
		out.println("<h2> Email: " + Email+"<h2>") ;
		out.println("<h2> Gender: " + gender+"<h2>") ;
		out.println("<h2> Course: " + course+"<h2>") ;
	 }else {
		 out.println("<h2>You have not accpeted terms and condition</h2>");
	 }
 }
	 else
	 {
		 out.println("<h2>You have not accpeted terms and condition</h2>");
	 }
 }
}

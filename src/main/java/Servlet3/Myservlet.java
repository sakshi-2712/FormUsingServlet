package Servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
  public void doGet(HttpServlet request , HttpServletResponse response) throws  ServletException,IOException
  {
	System.out.println("this is get method...");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
    out.print("<h1> this is get method of my servlet </h1>");
  }

}

package com.ust.Servlet3ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3ex
 */
@WebServlet("/Servlet3ex")
public class Servlet3ex extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     
    public Servlet3ex() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Enumeration e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String value = request.getHeader(name);
			out.println(name + " = " + value);
		}
		
	}

}

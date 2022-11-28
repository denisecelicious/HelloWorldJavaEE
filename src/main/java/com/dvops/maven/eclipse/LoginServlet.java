package com.dvops.maven.eclipse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1) Retrieve user inputs from requests
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
	
		// 2) Compare user inputs with correct username and password
		String correctUsername = "student";
		String correctPassword = "password";
		
		if(userName.compareTo(correctUsername) == 0 && password.compareTo(correctPassword) == 0) {
			PrintWriter writer = response.getWriter();
			writer.println("You have successfully Login!");
		}
		else {
			PrintWriter writer = response.getWriter();
			writer.println("Wrong Credentials");
		}
		
		// 3) Return appropriate result
		doGet(request, response);
	}

}

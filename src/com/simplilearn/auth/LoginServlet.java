package com.simplilearn.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		response.setContentType("text/html");
		if(email.equals("admin@gmail.com")) {
			response.getWriter().println("<h2>User Found!....</h2>");
			    if(password.equals("password123")) {
			    	response.getWriter().println("<h2>User Login Successful!....</h2>");
			    }else {response.getWriter().println("<h2>Password not match..default password(password123)</h2>");}
		}//end if
		else {response.getWriter().println("<h2>User Not  Found!....</h2><p> looking For Default User admin@gmail.com</p>");
		}}
}





package com.niit.ecommerce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/ser1")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
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
		
		
		
		String nam1=(String) request.getParameter("nam1");
		String nam2=(String) request.getParameter("nam2");
		String pass=(String) request.getParameter("pass");
		if(nam1.equals("praveen") && nam2.equals("kumar") && pass.equals("hodor"))
		{
		 RequestDispatcher rd = request.getRequestDispatcher("/mainpage.html");
		 rd.forward(request, response);
		}
		else
		{ 
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.forward(request, response);
	
		}

		doGet(request, response);
	}

}

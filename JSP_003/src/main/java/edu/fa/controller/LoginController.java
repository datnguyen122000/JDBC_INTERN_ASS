package edu.fa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.fa.dao.AccountDAO;
import edu.fa.dao.impl.AccountDAOImpl;
import edu.fa.dao.AccountDAO;
import edu.fa.entities.Account;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("views/login.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			AccountDAO accountDAO = new AccountDAOImpl();
			String email = request.getParameter("email");
			String pass = request.getParameter("password");

			int status = 0;// status =0 don't remember account
			if (request.getParameter("status") != null) {
				status = Integer.parseInt(request.getParameter("status"));
			}
			Account account = accountDAO.getAccount(email, pass);
			HttpSession session = request.getSession();
			if (status == 1) {
				session.setAttribute("status", 1);
			} else {
				session.setAttribute("status", 0);
			}
			if (account != null) {
				session.setAttribute("account", account);
				request.getRequestDispatcher("edit").forward(request, response);
			} else {
				response.sendRedirect("login");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

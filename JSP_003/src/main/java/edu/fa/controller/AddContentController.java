package edu.fa.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.fa.dao.AccountDAO;
import edu.fa.dao.ContentDAO;
import edu.fa.dao.impl.ContentDAOImpl;
import edu.fa.dao.ContentDAO;
import edu.fa.entities.Account;
import edu.fa.entities.Content;

/**
 * Servlet implementation class AddContentController
 */
public class AddContentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("views/addContent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String title=request.getParameter("title");
			String brief=request.getParameter("brief");
			String description=request.getParameter("description");
			HttpSession session=request.getSession();
			Account account= (Account) session.getAttribute("account");
			
			Content content=new Content(title,brief,description,new Date(),account.getId());
			
			ContentDAO contentDAO=new ContentDAOImpl();
			boolean check=contentDAO.addContent(content);
			if(check) System.out.println("Add content success!");
			else  System.out.println("Add content fail!");
			
			response.sendRedirect("/JSP_003/add-content");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

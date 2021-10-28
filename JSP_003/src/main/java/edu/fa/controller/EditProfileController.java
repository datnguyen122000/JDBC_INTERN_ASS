package edu.fa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.fa.dao.AccountDAO;
import edu.fa.dao.ProfileDAO;
import edu.fa.dao.impl.ProfileDAOImpl;
import edu.fa.dao.ProfileDAO;
import edu.fa.entities.Account;
import edu.fa.entities.Profile;

/**
 * Servlet implementation class EditController
 */
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("views/editProfile.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String phone=request.getParameter("phone");
			String description=request.getParameter("description");
			HttpSession session=request.getSession();
			Account account= (Account) session.getAttribute("account");
			Profile profile=new Profile(account.getId(), firstName, lastName, phone, description);
			
			ProfileDAO profileDAO =new ProfileDAOImpl();
			Profile profileCheckExist=profileDAO.getProfileById(account.getId());
			
			if(profileCheckExist==null) {
				boolean check=profileDAO.addProfile(profile);
				if(check) System.out.println("Add profile success!");
				else System.out.println("Add profile fail!");
			}else {
				System.out.println(profile);
				boolean check=profileDAO.updateProfileByAccId(profile);
				if(check) System.out.println("Update profile success!");
				else System.out.println("Update profile fail!");
			}
			
			response.sendRedirect("/JSP_003/edit");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

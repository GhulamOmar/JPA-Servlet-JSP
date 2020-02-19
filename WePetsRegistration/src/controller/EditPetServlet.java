package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PetType;

/**
 * Servlet implementation class EditPetServlet
 */
@WebServlet("/editPetServlet")
public class EditPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			Typehelper dao = new Typehelper ();
			String pettype = request.getParameter("pettype");
			String petname = request.getParameter("petname");
			String ownername = request.getParameter("ownername");
			Integer tempId = Integer.parseInt(request.getParameter("id"));				
			PetType itemToUpdate = dao.searchForPetId(tempId);
			itemToUpdate.setPetname(petname);
			itemToUpdate.setPettype(pettype);
			itemToUpdate.setOwnername(ownername);					
			dao.updatePet(itemToUpdate);
			getServletContext().getRequestDispatcher("/viewAllItemsServlet").forward(request, response);


		}

	}
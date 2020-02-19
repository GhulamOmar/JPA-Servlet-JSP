package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PetType;

/**
 * Servlet implementation class AddpetServlet
 */
@WebServlet("/addpetServlet")
public class AddPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pettype = request.getParameter("pettype");
		String petname = request.getParameter("petname");
		String ownername = request.getParameter("ownername");
		if (pettype.isEmpty() || petname.isEmpty() || pettype == null || petname == null || ownername == null) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		} else {
			PetType li = new PetType(pettype, petname, ownername);
			Typehelper dao = new Typehelper();
			dao.insertPet(li);

			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}

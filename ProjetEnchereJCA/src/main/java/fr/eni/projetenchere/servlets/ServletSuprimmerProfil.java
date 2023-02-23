package fr.eni.projetenchere.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.bll.UtilisateurManager;

/**
 * Servlet implementation class ServletSuprimmerProfil
 */
@WebServlet("/ServletSuprimmerProfil")
public class ServletSuprimmerProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = null;

		String email = request.getParameter("EmailSupr");
		String mdp = request.getParameter("mdpSupr");

		UtilisateurManager um = new UtilisateurManager();
		boolean utilisateurExiste = um.deleteUtilisateur(email, mdp);

		if (utilisateurExiste) {
			rd = request.getRequestDispatcher("ServletDeconnexion");
			System.out.println("supression reussi");
		} else {

			rd = request.getRequestDispatcher("WEB-INF/ModifProfil.jsp");
			System.out.println("supression echouée");
		}
		rd.forward(request, response);

	}
}

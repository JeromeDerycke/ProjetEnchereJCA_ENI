package fr.eni.projetenchere.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.bll.BLLException;
import fr.eni.projetenchere.bll.UtilisateurManager;
import fr.eni.projetenchere.bo.Utilisateur;

/**
 * Servlet implementation class AjoutUtilisateur
 */
@WebServlet("/ServletAjoutUtilisateur")
public class ServletAjoutUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String bt;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/AjoutUtilisateur.jsp");
		
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rd = null;
		bt = request.getParameter("bt");
		

		if (bt.equals("annuler")) {
			 rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
			 rd.forward(request, response);

		} else if (bt.equals("valider")) {

			String email = request.getParameter("Email");
			String mdp = request.getParameter("MotDePasse");
			String nom = request.getParameter("Nom");
			String prenom = request.getParameter("Prenom");
			String pseudo = request.getParameter("Pseudo");
			String telephone = request.getParameter("Telephone");
			String rue = request.getParameter("Rue");
			String ville = request.getParameter("Ville");
			String cdp = request.getParameter("CodePostal");


			Utilisateur u = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, cdp, ville, mdp);
			UtilisateurManager um = new UtilisateurManager();

//			try {

			um.addUtilisateur(u);
			
			request.setAttribute("retour", "Insertion reussi");
			request.setAttribute("utilisateur", u);

			rd = request.getRequestDispatcher("/WEB-INF/Connexion.jsp");
			rd.forward(request, response);

//			} catch (BLLException e){
//				
//				request.setAttribute("retour", "insertion est un echec");
//				request.setAttribute("utilisateur", u);
//				request.setAttribute("erreur", e.getMessage());
//				
//				
//				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
//				rd.forward(request, response);
//				e.printStackTrace();
//			}

		}

	}

}

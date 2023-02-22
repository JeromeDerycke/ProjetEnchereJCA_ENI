package fr.eni.projetenchere.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.bll.ArticleVenduManager;
import fr.eni.projetenchere.bll.UtilisateurManager;
import fr.eni.projetenchere.bo.ArticleVendu;
import fr.eni.projetenchere.bo.Categorie;
import fr.eni.projetenchere.bo.Utilisateur;

/**
 * Servlet implementation class ServletNouvelleVente
 */
@WebServlet("/ServletNouvelleVente")
public class ServletNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String bt;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/NouvelleVente.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		bt = request.getParameter("bt");

		if (bt.equals("annuler")) {
			rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
			rd.forward(request, response);

		} else if (bt.equals("valider")) {

			String nom = request.getParameter("nom");
			String description = request.getParameter("description");
			LocalDate debut = request.getParameter("partydatedebut");
			LocalDate fin = request.getParameter("partydatefin");
			int prix = request.getParameter("prix");
			Categorie categorie = request.getParameter("categorie");
			

			ArticleVendu a = new ArticleVendu(nom, description, debut, fin, prix, categorie);
			ArticleVenduManager am = new ArticleVenduManager();
			
			am.addArticleVendu(a);
			request.setAttribute("retour", "Insertion reussi");
			request.setAttribute("utilisateur", a);

			rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
			rd.forward(request, response);
		}
	}
	
}

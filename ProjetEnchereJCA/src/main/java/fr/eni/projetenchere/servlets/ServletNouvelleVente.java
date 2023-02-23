package fr.eni.projetenchere.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.bll.ArticleVenduManager;
import fr.eni.projetenchere.bll.CategorieManager;
import fr.eni.projetenchere.bo.ArticleVendu;
import fr.eni.projetenchere.bo.Categorie;
import fr.eni.projetenchere.dal.CategorieDAO;
import fr.eni.projetenchere.dal.CategorieDAOJDBCImpl;
import fr.eni.projetenchere.dal.DAOFactory;

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
		RequestDispatcher rd = null;

		CategorieManager cm = new CategorieManager();
		List<Categorie> categories = null;

		categories = cm.selectAll();

		request.setAttribute("Categories", categories);

		System.out.println(categories);

		rd = request.getRequestDispatcher("/WEB-INF/NouvelleVente.jsp");
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
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.FRANCE);

		if (bt.equals("annuler")) {
			rd = request.getRequestDispatcher("/WEB-INF/Bienvenue.jsp");
			rd.forward(request, response);

		} else if (bt.equals("valider")) {

			String nom = request.getParameter("nom");
			String description = request.getParameter("description");
			int prix = Integer.parseInt(request.getParameter("prix"));
			LocalDate dateDebut = LocalDate.parse(request.getParameter("partydatedebut"), format);
			LocalDate dateFin = LocalDate.parse(request.getParameter("partydatefin"), format);			
			String categorie = request.getParameter("categorie");
			

			ArticleVendu a = new ArticleVendu(nom, description, dateDebut, dateFin, prix);
			ArticleVenduManager am = new ArticleVenduManager();

			am.addArticleVendu(a);
			request.setAttribute("retour", "Insertion reussi");
			request.setAttribute("utilisateur", a);

			rd = request.getRequestDispatcher("/WEB-INF/Bienvenue.jsp");
			rd.forward(request, response);
		}
	}

}

package fr.eni.projetenchere.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.bll.UtilisateurManager;
import fr.eni.projetenchere.bo.Utilisateur;

/**
 * Servlet implementation class ServletModifierProfil
 */
@WebServlet("/ServletModifierProfil")
public class ServletModifierProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModifierProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;

		Cookie[] cookies = request.getCookies();

		if (cookies != null) {

			for (Cookie c : cookies) {

				if (c.getName().equals("pseudo")) {

					Utilisateur utilisateur = new Utilisateur();
					UtilisateurManager um = new UtilisateurManager();

					utilisateur = um.select(c.getValue(), c.getValue());

					request.setAttribute("utilisateur", utilisateur);
					rd = request.getRequestDispatcher("/WEB-INF/ModifProfil.jsp");
					break;

				} else {
					rd = request.getRequestDispatcher("WEB-INF/Connexion.jsp");
				}
			}

		} else {

			rd = request.getRequestDispatcher("WEB-INF/Connexion.jsp");
		}

		rd.forward(request, response);

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
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
		
		
		um.updateUtilisateur(u);
		
		request.setAttribute("utilisateur", u);
		
		rd = request.getRequestDispatcher("/WEB-INF/Profil.jsp");
		rd.forward(request, response);
		
	}

}

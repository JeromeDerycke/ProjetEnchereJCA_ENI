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
import fr.eni.projetenchere.dal.UtilisateurDAOJDBCImpl;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = null;
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("connexion") && c.getValue().equals("ok")) {
					rd = request.getRequestDispatcher("WEB-INF/Accueil.jsp");					
					break;
				} else {
					rd = request.getRequestDispatcher("WEB-INF/Connexion.jsp");
					
				}
			}

		} else {
			rd = request.getRequestDispatcher("WEB-INF/Connexion.jsp");
			rd.forward(request, response);
		}

		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = null;

		String saisie = request.getParameter("login");
		String pseudo = saisie;
		String email = saisie;
		String mdp = request.getParameter("mdp");
		
		UtilisateurManager um = new UtilisateurManager();
		boolean utilisateurExiste = um.login(pseudo,email,mdp);

		if (utilisateurExiste) {

			Cookie cookieP = new Cookie("pseudo", saisie);

			if (request.getParameter("souvenir") != null) {
				if (request.getParameter("souvenir").equals("souv")) {
					Cookie cookie = new Cookie("connexion", "ok");
					cookie.setMaxAge(2592000);
					response.addCookie(cookie);
					cookieP.setMaxAge(2592000);
				}				
			}

			response.addCookie(cookieP);
			rd = request.getRequestDispatcher("WEB-INF/Accueil.jsp");
			System.out.println("connexion reussi");

		} else {

			rd = request.getRequestDispatcher("WEB-INF/Connexion.jsp");

			System.out.println("connexion echouée");
		}
		rd.forward(request, response);
	}

}

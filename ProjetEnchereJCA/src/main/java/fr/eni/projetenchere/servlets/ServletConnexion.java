package fr.eni.projetenchere.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.dal.UtilisateurDAOJDBCImpl;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String bt;

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
					rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
				} else {
					rd = request.getRequestDispatcher("/WEB-INF/Connexion.jsp");
				}
			}

		} else {
			rd = request.getRequestDispatcher("/WEB-INF/Connexion.jsp");
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
		
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		System.out.println(login);
		System.out.println(mdp);
		if (UtilisateurDAOJDBCImpl.login(login, mdp)) {
			rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
			rd.forward(request, response);
			System.out.println("connexion reussi");
		} else {
			  
			rd =request.getRequestDispatcher("/WEB-INF/Connexion.jsp");  
	        rd.include(request,response); 
	        System.out.println("connexion echouée");
		}
		
		 
		
	}

}

package fr.eni.projetenchere.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetenchere.bo.Utilisateur;
import fr.eni.projetenchere.dal.UtilisateurDAOJDBCImpl;

/**
 * Servlet implementation class ServletProfil
 */
@WebServlet("/ServletProfil")
public class ServletProfil extends HttpServlet {
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

				if (c.getName().equals("pseudo")) {

					Utilisateur utilisateur = UtilisateurDAOJDBCImpl.select(c.getValue(), c.getValue());
					request.setAttribute("utilisateur", utilisateur);
					rd = request.getRequestDispatcher("/WEB-INF/Profil.jsp");	
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

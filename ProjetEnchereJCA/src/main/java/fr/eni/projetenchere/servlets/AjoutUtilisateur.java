package fr.eni.projetenchere.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjoutUtilisateur
 */
@WebServlet("/AjoutUtilisateur")
public class AjoutUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String bt=null;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd=null;
		
		bt = request.getParameter("bt");
		
		
		
		rd = request.getRequestDispatcher("/WEB-INF/AjoutUtilisateur.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = null;
		
		if ( bt.equals("Annuler")) {
			rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
			
		} else if (bt.equals("Valider")) { 
			
		String email = request.getParameter("Email");
		String mdp = request.getParameter("MotDePasse");
		String nom = request.getParameter("Nom");
		String prenom = request.getParameter("Prenom");
		String pseudo = request.getParameter("Pseudo");
		String telephone = request.getParameter("Telephone");
		String rue = request.getParameter("Rue");
		String ville = request.getParameter("Ville");
		String cdp = request.getParameter("CodePostal");
		
		
		System.out.println(email);
		System.out.println(mdp);
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(pseudo);
		System.out.println(telephone);
		System.out.println(rue);
		System.out.println(ville);
		System.out.println(cdp);
		
		rd = request.getRequestDispatcher("/WEB-INF/Accueil.jsp");
		rd.forward(request, response);
			
		}
		
		
		
	}

}

package fr.eni.projetenchere.bll;

import fr.eni.projetenchere.bo.Utilisateur;
import fr.eni.projetenchere.dal.DAOFactory;
import fr.eni.projetenchere.dal.UtilisateurDAO;

public class UtilisateurManager {

	private static UtilisateurDAO utilisateurDAO;
	
	public UtilisateurManager() {
		utilisateurDAO = DAOFactory.getutilisateurDAO();
	}
	
	public void addUtilisateur(Utilisateur u) {
		utilisateurDAO.insert(u);
	}
	
	public Boolean login(String pseudo, String email, String mdp) {

		
		return utilisateurDAO.login(pseudo,email,mdp);
	}
	
	public Utilisateur select(String pseudo,String email) {
		
		Utilisateur utilisateur = utilisateurDAO.select(pseudo, email);
		return utilisateur;
	}

}

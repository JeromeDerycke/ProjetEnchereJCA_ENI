package fr.eni.projetenchere.bll;

import fr.eni.projetenchere.bo.Utilisateur;
import fr.eni.projetenchere.dal.DAOFactory;
import fr.eni.projetenchere.dal.UtilisateurDAO;

public class UtilisateurManager {

	public void addUtilisateur(Utilisateur u) {

		UtilisateurDAO ui = DAOFactory.getutilisateurDAO();
		ui.insert(u);
	}

}

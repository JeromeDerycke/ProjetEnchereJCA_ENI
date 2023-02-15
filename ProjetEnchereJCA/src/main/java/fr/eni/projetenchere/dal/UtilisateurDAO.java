package fr.eni.projetenchere.dal;

import fr.eni.projetenchere.bo.Utilisateur;

public interface UtilisateurDAO {

	public void insert(Utilisateur utilisateur);

	public void delete(Utilisateur utilisateur);

	public void select(Utilisateur utilisateur);

	public void selectAll(Utilisateur utilisateur);

	public void update(Utilisateur utilisateur);

}

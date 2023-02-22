package fr.eni.projetenchere.dal;

import fr.eni.projetenchere.bo.Utilisateur;

public interface UtilisateurDAO {

	public void insert(Utilisateur utilisateur);

	public void update(Utilisateur utilisateur);

	public Boolean login(String pseudo, String email, String mdp);

	public Utilisateur select(String pseudo, String email);

	public Boolean deleteUtilisateur(String email, String mdp);

	

}
package fr.eni.projetenchere.dal;

import java.util.List;

import fr.eni.projetenchere.bo.Utilisateur;

public interface UtilisateurDAO {

	public void insert(Utilisateur utilisateur);

	public void delete(Utilisateur utilisateur);

	public void select(Utilisateur utilisateur);

	public void selectAll(Utilisateur utilisateur);

	public void update(Utilisateur utilisateur);
	
//	public Boolean login (String pseudo,String email,String mdp);
//	
//	public List<Utilisateur> select (String pseudo, String email);

}

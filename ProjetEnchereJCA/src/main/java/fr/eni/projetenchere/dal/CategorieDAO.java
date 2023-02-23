package fr.eni.projetenchere.dal;


import java.util.List;

import fr.eni.projetenchere.bo.Categorie;

public interface CategorieDAO {

	public void insert (Categorie categorie);
	public void delete (Categorie categorie);	
	public void select (Categorie categorie);
	public void update (Categorie categorie);
	
	public List<Categorie> selectAll ();
	
	
	
}

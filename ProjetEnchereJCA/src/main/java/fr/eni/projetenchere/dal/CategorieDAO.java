package fr.eni.projetenchere.dal;

import fr.eni.projetenchere.bo.Categorie;

public interface CategorieDAO {

	public void insert (Categorie categorie);
	public void delete (Categorie categorie);
	public void select (Categorie categorie);
	public void selectAll (Categorie categorie);
	public void update (Categorie categorie);
	
}

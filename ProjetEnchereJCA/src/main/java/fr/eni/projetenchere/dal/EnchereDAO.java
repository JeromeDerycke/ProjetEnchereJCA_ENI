package fr.eni.projetenchere.dal;

import fr.eni.projetenchere.bo.Enchere;

public interface EnchereDAO {

	public void insert (Enchere enchere);
	public void delete (Enchere enchere);
	public void select (Enchere enchere);
	public void selectAll (Enchere enchere);
	public void update (Enchere enchere);	
	
}

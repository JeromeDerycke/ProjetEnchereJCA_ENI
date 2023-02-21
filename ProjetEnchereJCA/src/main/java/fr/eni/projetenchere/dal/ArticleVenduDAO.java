package fr.eni.projetenchere.dal;

import fr.eni.projetenchere.bo.ArticleVendu;


public interface ArticleVenduDAO {

	
	public void insert (ArticleVendu article);
	
	public void delete (ArticleVendu article);
	
	public void select (ArticleVendu article);
	
	public void selectAll (ArticleVendu article);
	
	public void update (ArticleVendu article);
	
	public ArticleVendu select(String nomArticle);
	
	
}

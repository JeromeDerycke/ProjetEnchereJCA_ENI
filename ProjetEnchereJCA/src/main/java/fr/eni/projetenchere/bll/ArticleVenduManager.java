package fr.eni.projetenchere.bll;

import fr.eni.projetenchere.bo.ArticleVendu;
import fr.eni.projetenchere.dal.ArticleVenduDAO;
import fr.eni.projetenchere.dal.DAOFactory;

public class ArticleVenduManager {
	
	private static ArticleVenduDAO articleVenduDAO;
	
	public ArticleVenduManager() {
		articleVenduDAO = DAOFactory.getarticleVenduDAO();
	}
	
	public void addArticleVendu(ArticleVendu a) {
		articleVenduDAO.insert(a);
	}
	
	public ArticleVendu select(String nomArticle) {
		ArticleVendu articleVendu = articleVenduDAO.select(nomArticle);
		return articleVendu;
	}

}

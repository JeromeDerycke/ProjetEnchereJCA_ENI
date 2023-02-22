package fr.eni.projetenchere.dal;

public class DAOFactory {

	public static UtilisateurDAO getutilisateurDAO() {
		return new UtilisateurDAOJDBCImpl();
	}
	
	public static ArticleVenduDAO getarticleVenduDAO() {
		return new ArticleVenduDAOJDBCImpl();
	}
	

}

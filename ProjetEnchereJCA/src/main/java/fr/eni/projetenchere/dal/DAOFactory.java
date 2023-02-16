package fr.eni.projetenchere.dal;

public class DAOFactory {

	public static UtilisateurDAO getutilisateurDAO() {
		return new UtilisateurDAOJDBCImpl();
	}

}

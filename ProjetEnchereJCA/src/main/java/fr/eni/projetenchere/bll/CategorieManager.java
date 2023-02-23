package fr.eni.projetenchere.bll;

import java.util.List;

import fr.eni.projetenchere.bo.Categorie;
import fr.eni.projetenchere.dal.CategorieDAO;
import fr.eni.projetenchere.dal.DAOFactory;


public class CategorieManager {
	
private static CategorieDAO categorieDAO; 
	
	public CategorieManager() {
		categorieDAO = DAOFactory.getcategorieDAO();
	}
	
	public List<Categorie> selectAll() {
		
		List<Categorie> categories = categorieDAO.selectAll();
		
		return categories;
	}

	
	



	
	

}

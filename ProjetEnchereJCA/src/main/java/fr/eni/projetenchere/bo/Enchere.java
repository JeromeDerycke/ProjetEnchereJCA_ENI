package fr.eni.projetenchere.bo;

import java.io.Serializable;
import java.time.LocalDate;

public class Enchere implements Serializable {

	private static final long serialVersionUID = 1L; 
	
	private ArticleVendu noArticle;
	private Utilisateur noUtilisateur;
	private int noEnchere;
	private LocalDate dateEnchere;
	private int montantEnchere;
	
	
	public Enchere () {
		
	}
	
	
	
	public Enchere(ArticleVendu noArticle, Utilisateur noUtilisateur, int noEnchere, LocalDate dateEnchere,
			int montantEnchere) {
		super();
		this.noArticle = noArticle;
		this.noUtilisateur = noUtilisateur;
		this.noEnchere = noEnchere;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}



	public Enchere(int noEnchere, LocalDate dateEnchere, int montantEnchere) {
		super();
		this.noEnchere = noEnchere;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}


	public Enchere(LocalDate dateEnchere, int montantEnchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontantEnchere() {
		return montantEnchere;
	}

	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}



	public ArticleVendu getNoArticle() {
		return noArticle;
	}




	public void setNoArticle(ArticleVendu noArticle) {
		this.noArticle = noArticle;
	}



	public Utilisateur getNoUtilisateur() {
		return noUtilisateur;
	}




	public void setNoUtilisateur(Utilisateur noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}




	public int getNoEnchere() {
		return noEnchere;
	}




	public void setNoEnchere(int noEnchere) {
		this.noEnchere = noEnchere;
	}

	
	
	
	
}

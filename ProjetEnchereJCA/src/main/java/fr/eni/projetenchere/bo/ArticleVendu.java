package fr.eni.projetenchere.bo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class ArticleVendu implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Categorie noCategorie; 
	private Utilisateur noUtilisateur;
	private int noArticle;	
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private String etatVente;
	private Retrait lieuRetrait;
	
	
	



	public ArticleVendu ( ) {
		
	}


	
	
	public ArticleVendu(Categorie noCategorie, Utilisateur noUtilisateur, int noArticle, String nomArticle,
			String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente,
			String etatVente, Retrait lieuRetrait) {
		super();
		this.noCategorie = noCategorie;
		this.noUtilisateur = noUtilisateur;
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
	}




	public ArticleVendu(int noArticle, Categorie noCategorie, Utilisateur noUtilisateur, String nomArticle,
			String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int miseAPrix, int prixVente,
			String etatVente) {
		super();
		this.noArticle = noArticle;
		this.noCategorie = noCategorie;
		this.noUtilisateur = noUtilisateur;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}




	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int miseAPrix, int prixVente, String etatVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
	}


	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int miseAPrix, Categorie noCategorie) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.noCategorie = noCategorie;
	}

	

	public Categorie getNoCategorie() {
		return noCategorie;
	}




	public void setNoCategorie(Categorie noCategorie) {
		this.noCategorie = noCategorie;
	}




	public Utilisateur getNoUtilisateur() {
		return noUtilisateur;
	}




	public void setNoUtilisateur(Utilisateur noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}




	public int getNoArticle() {
		return noArticle;
	}


	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}


	public String getNomArticle() {
		return nomArticle;
	}


	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}


	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}


	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}


	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}


	public int getMiseAPrix() {
		return miseAPrix;
	}


	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}


	public int getPrixVente() {
		return prixVente;
	}


	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}


	public String getEtatVente() {
		return etatVente;
	}


	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}


	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}




	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}


	public void setNoCategorie(String libelle) {

		
	}

	public void setNoUtilisateur(String pseudo) {

		
	}

	public void setRetraitRue (String lieuRetrait) {
		
	}
	
	public void setRetraitCp (String lieuRetrait) {
		
	}
	public void setRetraitVille (String lieuRetrait) {
	
}

	
	
	
}

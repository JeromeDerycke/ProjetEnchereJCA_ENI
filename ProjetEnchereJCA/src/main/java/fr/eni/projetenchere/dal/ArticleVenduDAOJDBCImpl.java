package fr.eni.projetenchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.projetenchere.bo.ArticleVendu;
import fr.eni.projetenchere.bo.Categorie;
import fr.eni.projetenchere.bo.Retrait;
import fr.eni.projetenchere.bo.Utilisateur;

public class ArticleVenduDAOJDBCImpl implements ArticleVenduDAO {

	private static final String INSERT_ARTICLE = "INSERT INTO ARTICLES_VENDUS (nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,no_utilisateur,no_categorie) VALUES(?,?,?,?,?,?,?)";
	private static final String SELECT_ARTICLE = "SELECT * FROM ARTICLES_VENDUS WHERE nom_article=?";

	@Override
	public void insert(ArticleVendu article) {

		ResultSet rs = null;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_ARTICLE,
						PreparedStatement.RETURN_GENERATED_KEYS)) {

			cnx.setAutoCommit(false);
			pstmt.setString(1, article.getNomArticle());
			pstmt.setString(2, article.getDescription());
			pstmt.setObject(3, article.getDateDebutEncheres());
			pstmt.setObject(4, article.getDateFinEncheres());
			pstmt.setInt(5, article.getMiseAPrix());
			pstmt.setObject(6, article.getNoUtilisateur());
			pstmt.setObject(7, article.getNoCategorie());
			
			int nbLigneAffectees = pstmt.executeUpdate();

			if (nbLigneAffectees >= 1) {
				rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					article.setNoArticle(rs.getInt(1));
				}

				rs.close();
				pstmt.close();
				cnx.commit();
				System.out.println(article);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(ArticleVendu article) {

	}

	@Override
	public void select(ArticleVendu article) {

	}

	@Override
	public void selectAll(ArticleVendu article) {

	}

	@Override
	public void update(ArticleVendu article) {

	}
	@Override
	public ArticleVendu select(String nomArticle) {
		ResultSet rs = null;
		ArticleVendu ArticleVendu = null;
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_ARTICLE)) {
			
			
			pstmt.setString(1,nomArticle);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ArticleVendu = new ArticleVendu();
				ArticleVendu.setNomArticle(rs.getString("nom_article"));
				ArticleVendu.setDescription(rs.getString("description"));
				ArticleVendu.setNoCategorie(((Categorie) rs).getLibelle());
				ArticleVendu.setMiseAPrix(rs.getInt("prix_initial"));
				ArticleVendu.setDateFinEncheres(rs.getDate("date_fin_enchere").toLocalDate());
				ArticleVendu.setNoUtilisateur(((Utilisateur)rs).getPseudo());
				ArticleVendu.setRetraitRue(((Retrait)rs).getRue());
				ArticleVendu.setRetraitCp(((Retrait)rs).getCodePostal());
				ArticleVendu.setRetraitVille(((Retrait)rs).getVille());
				
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ArticleVendu;
	}

}

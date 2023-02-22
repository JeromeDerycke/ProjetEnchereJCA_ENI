package fr.eni.projetenchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.projetenchere.bo.Utilisateur;

public class UtilisateurDAOJDBCImpl implements UtilisateurDAO {

	private static final String INSERT_UTILISATEUR = "INSERT INTO UTILISATEURS (pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String LOGIN_UTILISATEUR = "SELECT * FROM UTILISATEURS WHERE (pseudo=? OR email=?) AND mot_de_passe=?";
	private static final String SELECT_UTILISATEUR = "SELECT * FROM UTILISATEURS WHERE pseudo=? OR email=?";
	private static final String DELETE_UTILISATEUR = " DELETE FROM UTILISATEURS WHERE email=? AND mot_de_passe=?";
	private static final String UPDATE_UTILISATEUR = "UPDATE UTILISATEURS SET pseudo=?, nom=?, prenom=?, email=?, telephone=?, rue =?, code_postal=?, ville=?, mot_de_passe=?";

	@Override
	public void insert(Utilisateur utilisateur) {
		ResultSet rs = null;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR,
						PreparedStatement.RETURN_GENERATED_KEYS)) {

			cnx.setAutoCommit(false);
			;
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, 100);
			pstmt.setBoolean(11, false);

			int nbLigneAffectees = pstmt.executeUpdate();

			if (nbLigneAffectees >= 1) {
				rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}

				rs.close();
				pstmt.close();
				cnx.commit();
				System.out.println(utilisateur);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Boolean login(String pseudo, String email, String mdp) {
		ResultSet rs = null;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(LOGIN_UTILISATEUR)) {
			pstmt.setString(1, pseudo);
			pstmt.setString(2, email);
			pstmt.setString(3, mdp);
			rs = pstmt.executeQuery();
			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Boolean deleteUtilisateur(String email, String mdp) {

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR)) {

			pstmt.setString(1, email);
			pstmt.setString(2, mdp);

			int utilisateursupr = pstmt.executeUpdate();
			return utilisateursupr > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Utilisateur select(String pseudo, String email) {

		ResultSet rs = null;
		Utilisateur utilisateur = null;
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_UTILISATEUR)) {

			pstmt.setString(1, pseudo);
			pstmt.setString(2, email);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCodePostal(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return utilisateur;
	}

	@Override
	public void update(Utilisateur utilisateur) {

		ResultSet rs = null;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(UPDATE_UTILISATEUR)) {

			cnx.setAutoCommit(false);
			;
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());

			int nbLigneAffectees = pstmt.executeUpdate();

			if (nbLigneAffectees > 0) {

				pstmt.executeUpdate();

			}

			pstmt.close();
			cnx.commit();
			System.out.println(utilisateur);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

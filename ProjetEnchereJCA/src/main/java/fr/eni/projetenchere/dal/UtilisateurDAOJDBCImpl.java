package fr.eni.projetenchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.projetenchere.bo.Utilisateur;

public class UtilisateurDAOJDBCImpl implements UtilisateurDAO {

	private static final String INSERT_UTILISATEUR="INSERT INTO UTILISATEURS (pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
	
	
	@Override
	public void insert (Utilisateur utilisateur) {
		
		if(utilisateur==null)
		{ }
		
		try(Connection cnx = ConnectionProvider.getConnection();)
				{
			
					cnx.setAutoCommit(false);
					PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
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
					
					
					ResultSet rs = pstmt.getGeneratedKeys();
					
					
					
					System.out.println(utilisateur);
					
					
					
					
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
	}

	
	@Override
	public void delete(Utilisateur utilisateur) {
	}

	@Override
	public void select(Utilisateur utilisateur) {
	}

	@Override
	public void selectAll(Utilisateur utilisateur) {		
	}

	@Override
	public void update(Utilisateur utilisateur) {	
	}
}

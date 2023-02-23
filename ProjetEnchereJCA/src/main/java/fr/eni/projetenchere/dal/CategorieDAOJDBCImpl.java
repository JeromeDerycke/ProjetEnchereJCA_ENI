package fr.eni.projetenchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projetenchere.bo.Categorie;

public class CategorieDAOJDBCImpl implements CategorieDAO {

	private static final String SELECT_ALLCATEGORIE = " SELECT * FROM CATEGORIES";

	@Override
	public List<Categorie> selectAll() {

		List<Categorie> categories = new ArrayList<Categorie>();
		ResultSet rs = null;

		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALLCATEGORIE)) {
			rs = pstmt.executeQuery();
//			Categorie categorie = new Categorie();
			while (rs.next()) {
//				categorie.setNoCategorie(rs.getInt("no_categorie"));
//				categorie.setLibelle(rs.getString("libelle"));

				categories.add(new Categorie(rs.getInt("no_categorie"), rs.getString("libelle")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return categories;
	}

	@Override
	public void insert(Categorie categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Categorie categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(Categorie categorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Categorie categorie) {
		// TODO Auto-generated method stub

	}

}

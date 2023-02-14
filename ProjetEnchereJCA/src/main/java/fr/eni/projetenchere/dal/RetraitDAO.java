package fr.eni.projetenchere.dal;

import fr.eni.projetenchere.bo.Retrait;

public interface RetraitDAO {
	
	public void insert (Retrait retrait);
	public void delete (Retrait retrait);
	public void select (Retrait retrait);
	public void selectAll (Retrait retrait);
	public void update (Retrait retrait);

}

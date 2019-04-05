package fr.ensup.gestionetablissementscolaires.service;

import java.sql.SQLException;

public interface EtudiantInterface {
	void listerEtudiant() throws Exception;
	public void creerEtudiant(String idEtudiant,String nom,String prenom,String email,String adresse,String tel, java.sql.Date dateNaissance) throws Exception, SQLException;
		
}

package fr.ensup.gestionetablissementscolaires.service;

import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import fr.ensup.gestionetablissementscolaires.dao.EtudiantDao;

public class EtudiantService implements EtudiantInterface{

	
	EtudiantDao dao = new EtudiantDao();
	List<EtudiantDao> listes = new ArrayList<>();
	Iterator<EtudiantDao> it;
	
	public void listerEtudiant() throws Exception {
		dao.listerEtudiant();
	}
	
	public void creerEtudiant(String idEtudiant,String nom,String prenom,String email,String adresse,String tel, java.sql.Date dateNaissance) throws Exception, SQLException {
		dao.creerEtudiant(idEtudiant, nom, prenom);
		listes.add(dao);
		System.out.println("success");
		System.out.println(listes.size());
	}

	public EtudiantDao getDao() {
		return dao;
	}

	public void setDao(EtudiantDao dao) {
		this.dao = dao;
	}

	/*public void addEtudiants() {
		listes.add(dao);
	}*/
	
	public void afficherTousLesEtudiants() {
		for(int i=0; i<listes.size(); i++) 
            System.out.println(listes.get(i));  
	}
	
	
}

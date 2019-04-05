package fr.ensup.gestionetablissementscolaires.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import fr.ensup.gestionetablissement.domaine.Etudiant;
//import fr.ensup.gestionetablissementscolaires.service.EtudiantService;

public class Main {

	public static void main(String[] args) throws Exception {
//		UserForm uf = new UserForm();
//		uf.getFrame();
//		EtudiantService es = new EtudiantService();
//		es.afficherTousLesEtudiants();
		
		List<Etudiant> etudiants = creerEtudiant();
		
		List<String> listeEtudiants = new ArrayList<>();
		for (Etudiant etudiant : etudiants) {
			if(etudiant.getNomEtudiant() == "sarr" && etudiant.getIdEtudiant()!="1") {
				listeEtudiants.add(etudiant.getPrenomEtudiant().toUpperCase());
			}
		}
		System.out.println(listeEtudiants);
		
		List<String> listeEtudiants2;
		listeEtudiants2 = etudiants.stream()
				.filter(etudiant -> etudiant.getNomEtudiant()=="sarr")
				.filter(etudiant -> etudiant.getIdEtudiant()!="1")
				.map(etudiant -> etudiant.getPrenomEtudiant().toUpperCase())
				.collect(Collectors.toList());
		
		listeEtudiants2.forEach(n -> System.out.println(n));
		listeEtudiants2.forEach(n->System.out.println(n));
		System.out.println(listeEtudiants2);
	}
	
	
	
	public static List<Etudiant> creerEtudiant(){
		return Arrays.asList(
				new Etudiant("1","sarr","iso"),
				new Etudiant("1","mane","sadio"),
				new Etudiant("3","niang","mbaye"),
				new Etudiant("4","sarr","pape"),
				new Etudiant("5","sarr","ibou")
				);
		
	}

}

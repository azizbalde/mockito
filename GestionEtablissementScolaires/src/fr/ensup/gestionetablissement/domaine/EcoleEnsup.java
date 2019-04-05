package fr.ensup.gestionetablissement.domaine;

public class EcoleEnsup {
	private String nom, adresseEmailEnsup, adresseEnsup,telEnsup,directeur;
	
	

	public EcoleEnsup(String nom, String adresseEmailEnsup, String adresseEnsup, String telEnsup, String directeur) {
		this.nom = nom;
		this.adresseEmailEnsup = adresseEmailEnsup;
		this.adresseEnsup = adresseEnsup;
		this.telEnsup = telEnsup;
		this.directeur = directeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresseEmailEnsup() {
		return adresseEmailEnsup;
	}

	public void setAdresseEmailEnsup(String adresseEmailEnsup) {
		this.adresseEmailEnsup = adresseEmailEnsup;
	}

	public String getAdresseEnsup() {
		return adresseEnsup;
	}

	public void setAdresseEnsup(String adresseEnsup) {
		this.adresseEnsup = adresseEnsup;
	}

	public String getTelEnsup() {
		return telEnsup;
	}

	public void setTelEnsup(String telEnsup) {
		this.telEnsup = telEnsup;
	}

	public String getDirecteur() {
		return directeur;
	}

	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}

	@Override
	public String toString() {
		return "EcoleEnsup [nom=" + nom + ", adresseEmailEnsup=" + adresseEmailEnsup + ", adresseEnsup=" + adresseEnsup
				+ ", telEnsup=" + telEnsup + ", directeur=" + directeur + "]";
	}
	
}

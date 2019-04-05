package fr.ensup.gestionetablissement.domaine;

import java.sql.Date;


public class Etudiant{
	private String idEtudiant, nomEtudiant, prenomEtudiant, adresseEmailEtudiant;
	private String adresseEtudiant, telEtudiant;
	private java.sql.Date dateEtudiant;
	
	public Etudiant(String idEtudiant, String nomEtudiant, String prenomEtudiant, String adresseEmailEtudiant,
			String adresseEtudiant, String telEtudiant, Date dateEtudiant) {
		
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.adresseEmailEtudiant = adresseEmailEtudiant;
		this.adresseEtudiant = adresseEtudiant;
		this.telEtudiant = telEtudiant;
		this.dateEtudiant = dateEtudiant;
	}
	
	public Etudiant(String idEtudiant,String nom, String prenom) {
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nom;
		this.prenomEtudiant = prenom;
	}

	public Etudiant() {
		
	}
	public String getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(String idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public String getAdresseEmailEtudiant() {
		return adresseEmailEtudiant;
	}

	public void setAdresseEmailEtudiant(String adresseEmailEtudiant) {
		this.adresseEmailEtudiant = adresseEmailEtudiant;
	}

	public String getAdresseEtudiant() {
		return adresseEtudiant;
	}

	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}

	public String getTelEtudiant() {
		return telEtudiant;
	}

	public void setTelEtudiant(String telEtudiant) {
		this.telEtudiant = telEtudiant;
	}

	public java.sql.Date getDateEtudiant() {
		return dateEtudiant;
	}

	public void setDateEtudiant(java.sql.Date dateEtudiant) {
		this.dateEtudiant = dateEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + ", adresseEmailEtudiant=" + adresseEmailEtudiant + ", adresseEtudiant="
				+ adresseEtudiant + ", telEtudiant=" + telEtudiant + ", dateEtudiant=" + dateEtudiant + "]";
	}
	
	
	
	
}

package fr.ensup.gestionetablissementscolaires.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.ensup.gestionetablissement.domaine.Etudiant;

public class EtudiantDao extends ConnexionStatement{
	
	private Statement statement = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String idEtudiant,nom,prenom,email,adresse,tel;
	private java.sql.Date dateNaissance;
	
	
	
	@Override
	public String toString() {
		return "EtudiantDao [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + ", tel=" + tel + ", dateNaissance=" + dateNaissance + "]";
	}

	public void listerEtudiant() throws Exception {
		statement = this.getStatement();
		try {
			this.rs = statement.executeQuery("SELECT * FROM etudiant");
			while (rs.next()) {
				this.idEtudiant = rs.getString("idEtudiant");
				this.nom = rs.getString("nom");
				this.nom = rs.getString("prenom");
				this.email = rs.getString("email");
				this.adresse = rs.getString("adresse");
				this.tel = rs.getString("nom");
				this.dateNaissance =  rs.getDate("dateNaissance");
				
				toString();
				
			}
		} catch (Exception e) {
			System.out.println("requête ou saisie d'éléments non correcte");
		}
	}
	
	public Etudiant creerEtudiant(String idEtudiant,String nom, String prenom)  {
		
		try {
			ps = this.getConnect().prepareStatement("INSERT INTO etudiant values (?,?,?,?,?,?,?)");
			ps.setString(1, idEtudiant);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, email);
			ps.setString(5, adresse);
			ps.setString(6, tel);
			ps.setDate(7, dateNaissance);
			ps.executeUpdate();
		} catch (Exception e) {
			//throw e;
		}
		return new Etudiant(idEtudiant, nom, prenom);
	}
	
}

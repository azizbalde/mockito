package fr.ensup.gestionetablissement.domaine;

public class Enseignant {
	private String idEnseignant, nomEnseignant, prenomEnseignant;
	private String adresseEmailEnseignant, adresseEnseignant, telEnseignant, matiereEnseignee;
	
	public Enseignant(String idEnseignant, String nomEnseignant, String prenomEnseignant, String adresseEmailEnseignant,
			String adresseEnseignant, String telEnseignant, String matiereEnseignee) {

		this.idEnseignant = idEnseignant;
		this.nomEnseignant = nomEnseignant;
		this.prenomEnseignant = prenomEnseignant;
		this.adresseEmailEnseignant = adresseEmailEnseignant;
		this.adresseEnseignant = adresseEnseignant;
		this.telEnseignant = telEnseignant;
		this.matiereEnseignee = matiereEnseignee;
	}

	public String getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(String idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public String getNomEnseignant() {
		return nomEnseignant;
	}

	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}

	public String getPrenomEnseignant() {
		return prenomEnseignant;
	}

	public void setPrenomEnseignant(String prenomEnseignant) {
		this.prenomEnseignant = prenomEnseignant;
	}

	public String getAdresseEmailEnseignant() {
		return adresseEmailEnseignant;
	}

	public void setAdresseEmailEnseignant(String adresseEmailEnseignant) {
		this.adresseEmailEnseignant = adresseEmailEnseignant;
	}

	public String getAdresseEnseignant() {
		return adresseEnseignant;
	}

	public void setAdresseEnseignant(String adresseEnseignant) {
		this.adresseEnseignant = adresseEnseignant;
	}

	public String getTelEnseignant() {
		return telEnseignant;
	}

	public void setTelEnseignant(String telEnseignant) {
		this.telEnseignant = telEnseignant;
	}

	public String getMatiereEnseignee() {
		return matiereEnseignee;
	}

	public void setMatiereEnseignee(String matiereEnseignee) {
		this.matiereEnseignee = matiereEnseignee;
	}

	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + ", prenomEnseignant="
				+ prenomEnseignant + ", adresseEmailEnseignant=" + adresseEmailEnseignant + ", adresseEnseignant="
				+ adresseEnseignant + ", telEnseignant=" + telEnseignant + ", matiereEnseignee=" + matiereEnseignee
				+ "]";
	}
	
	
	
	
}

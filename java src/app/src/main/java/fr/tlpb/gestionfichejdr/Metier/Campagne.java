package fr.tlpb.gestionfichejdr.Metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Campagne {
	private int idCam;
	private String nomCam;
	private Date dateDebutCam, dateFinCam;
	private Joueur leMJ;
	private List<Personnage> lesPersonnages;
	
	public Campagne(int idCam, String nomCam, Date dateDebutCam, Date dateFinCam, Joueur leMJ) {
		this.idCam = idCam;
		this.nomCam = nomCam;
		this.dateDebutCam = dateDebutCam;
		this.dateFinCam = dateFinCam;
		this.leMJ = leMJ;
		this.lesPersonnages = new ArrayList<Personnage>();
	}

	public int getIdcam() {
		return idCam;
	}

	public void setIdcam(int idCam) {
		this.idCam = idCam;
	}

	public String getNomCam() {
		return nomCam;
	}

	public void setNomcam(String nomCam) {
		this.nomCam = nomCam;
	}

	public Date getDateDebutCam() {
		return dateDebutCam;
	}

	public void setDateDebutCam(Date dateDebutCam) {
		this.dateDebutCam = dateDebutCam;
	}

	public Date getDateFinCam() {
		return dateFinCam;
	}

	public void setDateFinCam(Date dateFinCam) {
		this.dateFinCam = dateFinCam;
	}

	public void ajouterPersonnage(Personnage lePersonnage){
		this.lesPersonnages.add(lePersonnage);
	}

	public void viderlesPersonnages(){
		this.lesPersonnages.clear();
	}

	public void supprimerPersonnage(int idPer) {
		this.lesPersonnages.remove(idPer);
	}

	public void supprimerPersonnage(Personnage lePersonnage){
		this.lesPersonnages.remove(lePersonnage);
	}

	public Personnage getLePersonnage(int idPer){
		return this.lesPersonnages.get(idPer);
	}
}

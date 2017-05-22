package fr.tlpb.gestionfichejdr.Metier;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	private int idJou;
	private String pseudoJou, nomJou, prenomJou, mdpJou, emailJou;
	private List<Personnage> lesPersonnages;
	private List<Campagne> lesCampagnes;
	
	public Joueur(int idJou, String pseudoJou, String nomJou, String prenomJou, String mdpJou, String emailJou) {
		this.idJou = idJou;
		this.pseudoJou = pseudoJou;
		this.nomJou = nomJou;
		this.prenomJou = prenomJou;
		this.mdpJou = mdpJou;
		this.emailJou = emailJou;
		this.lesPersonnages = new ArrayList<Personnage>();
		this.lesCampagnes = new ArrayList<Campagne>();
	}

	public Joueur(String pseudoJou, String mdpJou){
		String defaultVal = null;
		this.idJou = 0;
		this.pseudoJou = pseudoJou;
		this.nomJou = defaultVal;
		this.prenomJou = defaultVal;
		this.mdpJou = mdpJou;
		this.emailJou = defaultVal;
		this.lesPersonnages = new ArrayList<Personnage>();
		this.lesCampagnes = new ArrayList<Campagne>();

	}

	public int getIdJou() {
		return idJou;
	}

	public void setIdJou(int idJou) {
		this.idJou = idJou;
	}

	public String getPseudoJou() {
		return pseudoJou;
	}

	public void setPseudoJou(String pseudoJou) {
		this.pseudoJou = pseudoJou;
	}

	public String getNomJou() {
		return nomJou;
	}

	public void setNomJou(String nomJou) {
		this.nomJou = nomJou;
	}

	public String getPrenomJou() {
		return prenomJou;
	}

	public void setPrenomJou(String prenomJou) {
		this.prenomJou = prenomJou;
	}

	public String getMdpJou() {
		return mdpJou;
	}

	public void setMdpJou(String mdpJou) {
		this.mdpJou = mdpJou;
	}

	public String getEmailJou() {
		return emailJou;
	}

	public void setEmailJou(String emailJou) {
		this.emailJou = emailJou;
	}
	
	public void creerPersonnage(Personnage lePersonnage){
		this.lesPersonnages.add(lePersonnage);
	}

	public void viderMesPersonnages(){
        this.lesPersonnages.clear();
    }

    public void supprimerPersonnage(Personnage lePersonnage){
        this.lesPersonnages.remove(lePersonnage);
    }

    public void supprimerPersonnage(int idPer){
        this.lesPersonnages.remove(idPer);
    }

    public Personnage getLePersonnage(int idPer){
        return this.lesPersonnages.get(idPer);
    }

    public void creerCampagne(Campagne laCampagne){
        this.lesCampagnes.add(laCampagne);
    }

    public void viderlesCampagnes(){
        this.lesCampagnes.clear();
    }

    public void supprimerCampagne(int idCam){
        this.lesCampagnes.remove(idCam);
    }

    public void supprimerCampagne(Campagne laCampagne){
        this.lesCampagnes.remove(laCampagne);
    }

    public Campagne getLaCampagne(int idCam){
        return this.lesCampagnes.get(idCam);
    }

	public String toJson() {
		return "{" +
				"\"idJou\":\"" + idJou +
				"\", \"pseudoJou\":\"" + pseudoJou +
				"\", \"nomJou\":\"" + nomJou +
				"\", \"prenomJou\":\"" + prenomJou +
				"\", \"mdpJou\":\"" + mdpJou +
				"\", \"emailJou\":\"" + emailJou +
				"\"}";
	}
}

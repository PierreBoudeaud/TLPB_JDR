package fr.tlpb.gestionfichejdr.Metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Personnage {
	private int expacPer, agePer, poidsPer, taillePer, pointvieacPer,idPer;
	private String nomPer, prenomPer, descPer;
	private char sexePer;
	private Province laProvince;
	private SousRace laSousRace;
	private List<Campagne> lesCampagnes;
	private Joueur leJoueur;
	private Dictionary<Carriere, Date> lesCarrieres;
	private boolean pjPer;	//D�finit si joueur ou non
	
	public Personnage(int expacPer, int agePer, int poidsPer, int taillePer, int pointvieacPer, int idPer, String nomPer, String prenomPer, String descPer, char sexePer, Province laProvince, SousRace laSousRace, Joueur leJoueur, boolean pjPer){
		this.expacPer = expacPer;
		this.agePer = agePer;
		this.poidsPer = poidsPer;
		this.taillePer = taillePer;
		this.pointvieacPer = pointvieacPer;
		this.idPer = idPer;
		this.nomPer = nomPer;
		this.prenomPer = prenomPer;
		this.descPer = descPer;
		this.sexePer = sexePer;
		this.laProvince = laProvince;
		this.laSousRace = laSousRace;
		this.lesCampagnes = new ArrayList<Campagne>();
		this.lesCarrieres = new Hashtable<Carriere, Date>();
	}

	public int getExpacPer() {
		return expacPer;
	}

	public void setExpacPer(int expacPer) {
		this.expacPer = expacPer;
	}

	public int getAgePer() {
		return agePer;
	}

	public void setAgePer(int agePer) {
		this.agePer = agePer;
	}

	public int getPoidsPer() {
		return poidsPer;
	}

	public void setPoidsPer(int poidsPer) {
		this.poidsPer = poidsPer;
	}

	public int getTaillePer() {
		return taillePer;
	}

	public void setTaillePer(int taillePer) {
		this.taillePer = taillePer;
	}

	public int getPointvieacPer() {
		return pointvieacPer;
	}

	public void setPointvieacPer(int pointvieacPer) {
		this.pointvieacPer = pointvieacPer;
	}

	public int getIdPer() {
		return idPer;
	}

	public void setIdPer(int idPer) {
		this.idPer = idPer;
	}

	public String getNomPer() {
		return nomPer;
	}

	public void setNomPer(String nomPer) {
		this.nomPer = nomPer;
	}

	public String getPrenomPer() {
		return prenomPer;
	}

	public void setPrenomPer(String prenomPer) {
		this.prenomPer = prenomPer;
	}

	public String getDescPer() {
		return descPer;
	}

	public void setDescPer(String descPer) {
		this.descPer = descPer;
	}

	public char getSexePer() {
		return sexePer;
	}

	public void setSexePer(char sexePer) {
		this.sexePer = sexePer;
	}

	public Province getLaProvince() {
		return laProvince;
	}

	public void setLaProvince(Province laProvince) {
		this.laProvince = laProvince;
	}

	public SousRace getLaSousRace() {
		return laSousRace;
	}

	public void setLaSousRace(SousRace laSousRace) {
		this.laSousRace = laSousRace;
	}

	public boolean isPjPer() {
		return pjPer;
	}

	public void setPjPer(boolean pjPer) {
		this.pjPer = pjPer;
	}

	public List<Campagne> getLesCampagnes() {
		return lesCampagnes;
	}

	public void setLesCampagnes(List<Campagne> lesCampagnes) {
		this.lesCampagnes = lesCampagnes;
	}

	public Joueur getLeJoueur() {
		return leJoueur;
	}

	public void setLeJoueur(Joueur leJoueur) {
		this.leJoueur = leJoueur;
	}

	public Date getDateObtentionCarriere(Carriere laCarriere){
		return this.lesCarrieres.get(laCarriere);
	}
	
	public void setAjoutCarriere(Carriere laCarriere, Date dateObtention){
		this.lesCarrieres.put(laCarriere, dateObtention);
	}
	
	/*public boolean testObtentionCarriere(Carriere uneCarriere){
		return this.lesCarrieres.containsKey(uneCarriere);
	}*/
}

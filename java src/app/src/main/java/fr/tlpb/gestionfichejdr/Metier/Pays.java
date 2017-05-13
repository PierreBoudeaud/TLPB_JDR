package fr.tlpb.gestionfichejdr.Metier;

import java.util.ArrayList;
import java.util.List;

public class Pays {

	private int idPay;
	private String libPay;
	private List<Province> lesProvinces;
	
	public Pays(int idPay, String libPay, List<Province> lesProvinces) {
		this.idPay = idPay;
		this.libPay = libPay;
		this.lesProvinces = new ArrayList<Province>();
	}

	public int getIdPay() {
		return idPay;
	}

	public void setIdPay(int idPay) {
		this.idPay = idPay;
	}

	public String getLibPay() {
		return libPay;
	}

	public void setLibPay(String libPay) {
		this.libPay = libPay;
	}
	
	public void ajouterProvince(Province laProvince){
		this.lesProvinces.add(laProvince);
	}
	
	public void viderLesProvinces(){
		this.lesProvinces.clear();
	}
	
	public void supprimerProvince(Province laProvince){
		this.lesProvinces.remove(laProvince);
	}
	
	public void supprimerProvince(int caseProvince){
		this.lesProvinces.remove(caseProvince);
	}

	public Province getLaProvince(int idProvince){
		return this.lesProvinces.get(idProvince);
	}
}

package fr.tlpb.gestionfichejdr.Metier;

public class Carriere {

	private int idCar;
	private String libCar, descCar;
	
	public Carriere(int idCar, String libCar, String descCar) {
		this.idCar = idCar;
		this.libCar = libCar;
		this.descCar = descCar;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public String getLibCar() {
		return libCar;
	}

	public void setLibCar(String libCar) {
		this.libCar = libCar;
	}

	public String getDescCar() {
		return descCar;
	}

	public void setDesCar(String descCar) {
		this.descCar = descCar;
	}
}

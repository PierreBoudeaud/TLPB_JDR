package fr.tlpb.gestionfichejdr.Metier;

public class Race {

	private int idRac;
	private String libRac;
	
	public Race(int idRac, String libRac) {
		this.idRac = idRac;
		this.libRac = libRac;
	}

	public int getIdRac() {
		return idRac;
	}

	public void setIdRac(int idRac) {
		this.idRac = idRac;
	}

	public String getLibRac() {
		return libRac;
	}

	public void setLibRac(String libRac) {
		this.libRac = libRac;
	}
	
	
}

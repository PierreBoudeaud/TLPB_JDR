package fr.tlpb.gestionfichejdr.Metier;

public class Province {

	private int idPro;
	private String libPro;
	private Pays lePays;
	
	public Province(int idPro, String libPro, Pays lePays) {
		this.idPro = idPro;
		this.libPro = libPro;
		this.lePays = lePays;
	}

	public Pays getLePays() {
		return lePays;
	}

	public void setLePays(Pays lePays) {
		this.lePays = lePays;
	}

	public int getIdpro() {
		return idPro;
	}

	public void setIdpro(int idPro) {
		this.idPro = idPro;
	}

	public String getLibPro() {
		return libPro;
	}

	public void setLibpro(String libPro) {
		this.libPro = libPro;
	}
	
	
}

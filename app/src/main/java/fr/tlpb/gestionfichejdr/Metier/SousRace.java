package fr.tlpb.gestionfichejdr.Metier;

public class SousRace extends Race{

	private int idSra;
	private String libSra;
	
	public SousRace(int idRac, String libRac, int idSra, String libSra) {
		super(idRac, libRac);
		this.idSra = idSra;
		this.libSra = libSra;
	}

	public int getIdSra() {
		return idSra;
	}

	public void setIdSra(int idSra) {
		this.idSra = idSra;
	}

	public String getLibSra() {
		return libSra;
	}

	public void setLibSra(String libSra) {
		this.libSra = libSra;
	}
	
	
}

package no.hvl.dat100;

public class Lerar extends Person {
	private int maanedlonn;
	private int kontonummer; 
	
	public Lerar(String etternavn, String fornavn, int foedselsaar, char kjonn, int maanedlonn, int kontonummer) {
		super(etternavn, fornavn, foedselsaar, kjonn);
		this.maanedlonn = maanedlonn;
		this.kontonummer = kontonummer;
	}
	public int getMaanedlonn() {
		return maanedlonn;
	}

	public void setMaanedlonn(int maanedlonn) {
		this.maanedlonn = maanedlonn;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}
	@Override
	public String toString() {
	return "Lerar: " + super.toString() + ", maanedlonn = " + maanedlonn + ", kontonummer = " + kontonummer;
	}
	
	
}

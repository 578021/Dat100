package no.hvl.dat100;

public class Vare {

	private int varenr;
	private String navn;
	private double pris;
	
	public int getVarenr() {
		return varenr;
	}
	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris = pris;
	}
	public String skrivNr() {
		return varenr + ":" + navn + "," + pris;
	}
	
	public Vare(int varenr, String navn, double pris) {
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
	}
	
	public double moms() {
		double moms = pris*0.2;
		System.out.println(moms);
		return moms;
	}
	public boolean billigereEnn(Vare v) {
		if (this.pris < v.pris) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
		
	}
	public String toString() {
		return "Varenr: " + this.varenr + ", Navn: " + this.navn + ", Pris: " + pris + ".";
	}
	
}

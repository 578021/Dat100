package no.hvl.dat100;

public class Person {
	private String etternavn;
	private String fornavn;
	private int foedselsaar;
	private char kjonn;
	
	public Person() {
		etternavn = "";
		fornavn = "";
		foedselsaar = 0;
		kjonn = '*';
	}
	public Person(String etternavn, String fornavn, int foedselsaar, char kjonn) {
		this.etternavn = etternavn;
		this.fornavn = fornavn;
		this.foedselsaar = foedselsaar;
		this.kjonn = kjonn;
	}
	


	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public int getFoedselsaar() {
		return foedselsaar;
	}
	public void setFoedselsaar(int foedselsaar) {
		this.foedselsaar = foedselsaar;
	}
	public char getKjonn() {
		return kjonn;
	}
	public void setKjonn(char kjonn) {
		this.kjonn = kjonn;
	}
	@Override
	public String toString() {
		return "etternavn = " + fornavn + ", fornavn = " +etternavn  + ", foedselsaar = " + foedselsaar + ", kjonn = "
				+ kjonn ;
	}
	
	
}

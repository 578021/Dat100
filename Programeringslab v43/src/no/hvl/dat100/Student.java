package no.hvl.dat100;

public class Student extends Person{
	private int studentnummer;
	private String klasse;
	
	public Student(String etternavn, String fornavn, int foedselsaar, 
			char kjonn, int studentnummer, String Klasse) {
		super(etternavn, fornavn, foedselsaar, kjonn);
		this.studentnummer = studentnummer;
		this.klasse = klasse;
	}
	
	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	@Override
	public String toString() {
	return "Student: " + super.toString() + ", studentnummer = " + studentnummer + ", klasse = " + klasse;
	}
}

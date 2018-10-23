package no.hvl.dat100;

public class Kvadrat {
	private int sidelengde;
	
	public void skrivut() {
		int t = getSidelengde();
		for(int j = 0; j < t; j++) {
		for(int i = 0; i < t; i++) {
		System.out.print("*");
		}
		System.out.println("");
		}
		System.out.println("");
	}
	public Kvadrat(){
		sidelengde = 0;
	}
	
	public Kvadrat(int sl) {
		sidelengde = sl;
	}
	public int Areal() {
		return sidelengde*sidelengde;
	}
	public int Omkrets() {
		return sidelengde*4;
		}
	public double Diagonal() {
		return Math.sqrt(2)*sidelengde;
	}

	public int getSidelengde() {
		return sidelengde;
	}

	public void setSidelengde(int sidelengde) {
		this.sidelengde = sidelengde;
	}
	public boolean sum(Kvadrat a, Kvadrat b) {
		return this.Areal() == a.Areal() + b.Areal();
		}
		
	}

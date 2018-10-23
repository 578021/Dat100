package no.hvl.dat100;

public class Varelager {

	private int antall;
	private Vare[] lager;
	
	public Varelager(int start) {
	lager = new Vare[start];
	antall = 0;
	}
	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public Vare[] getLager() {
		return lager;
	}

	public void setLager(Vare[] lager) {
		this.lager = lager;
	}

	public Varelager(int antall, Vare[] lager) {
		this.antall = antall;
		this.lager = lager;
	}
	
	public void leggTil(Vare v) {
		if(antall < lager.length) {
			lager[antall] = v;
			antall++;
		}else
			System.out.println("Det er fullt");
	}
	public boolean soekVare(int vareNr) {
		boolean funnet = false;
		int i = 0;
		while(!funnet && i<antall) {
			if(vareNr == (lager[i].getVarenr())) {
				funnet = true; 
			}else {
				i++;
			}
		}return funnet;
	}
	public int finn(int vareNr) {
	boolean funnet = false;
	int i = 0;
	int resultat = -1;
	while(!funnet && i<antall) {
		if(vareNr == (lager[i].getVarenr())) {
			funnet = true;
		}else {
			i++;
		}
	}
	if(funnet) {
		resultat = i;
	}
	return resultat;
	}
	public double totalPris() {
		double sum = 0;
		int i = 0;
		for(i=0; i<lager.length; i++) {
			sum+=lager[i].getPris();
		}
		return sum;
	}
	public Vare slett(int vareNr) {
		Vare bruk = null;
		int index = finn(vareNr);
		if(index != -1) {
			bruk = lager[index];
			lager[index]=lager[antall-1];
			lager[antall-1]=null;
			antall--;
		}
		return bruk;
	}
	public void skrivUt() {
		for(int i = 0; i<antall; i++) {
			System.out.println(lager[i].toString());	
		}System.out.println("");
	}

}

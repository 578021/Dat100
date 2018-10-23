package no.hvl.dat100;

import java.util.Arrays;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble; 
import static javax.swing.JOptionPane.showInputDialog;
public class Grensesnitt {
	
	public static void lesFlereVarer(Varelager lager) {
		System.out.println("Programmet leser inn studenter");
		String tallTxt = showInputDialog("Oppgi antall registreringer");
		int ant = parseInt(tallTxt);
		Vare var = null;
		
		for(int i = 0; i < ant; i++) {
			var = lesVare();
			lager.leggTil(var);
		}
	}
	public static void visAlle(Varelager lager) {
		System.out.println("Alle studenter:");
		Vare var = null;
		for(int i = 0; i < lager.getAntall(); i++) {
			var = lager.getLager()[i];
			skrivVare(var);
		}
	}
	public static void visAlleSortert(Varelager lager) {
		System.out.println("Alle varene sortert: ");
		int stor = lager.getAntall();
		String[] nrTab = new String[stor];
		for(int i = 0; i < nrTab.length; i++) {
			nrTab[i] = lager.getLager()[i].skrivNr();
		}
		Arrays.sort(nrTab);
		for(int i = 0; i < nrTab.length; i++) {
			System.out.println(nrTab[i]);
		}
	}
	public static Vare lesVare() {
		String tallTxt = showInputDialog("Oppgi varenr: ");
		int varenr = parseInt(tallTxt);
		String navn = showInputDialog("oppgi varenavn: ");
		String prisTxt = showInputDialog("oppgi pris: ");
		double pris = parseDouble(prisTxt);
		Vare var = new Vare(varenr, navn, pris);

		return var;
	}
	public static void skrivVare(Vare var) {
		System.out.println(var);	

	}
}

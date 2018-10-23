package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
public class Konto {

	private int kontonummer;
	private int saldo;
	public Konto(int kontonummer, int saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}
	
	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void lese() {
		System.out.println(saldo);
	}
	public void settinn() {
		String tallTxt = showInputDialog("Sett inn anntal i kr: ");
		int belop = parseInt(tallTxt);
		saldo = saldo + belop;
		System.out.println("Saldoen din er: " + saldo);
	}
	public void taut() {
		String tallTxt = showInputDialog("Ta ut anntal i kr: ");
		int belop = parseInt(tallTxt);
		saldo = saldo - belop;
		System.out.println("Saldoen din er: " + saldo);
	}
}

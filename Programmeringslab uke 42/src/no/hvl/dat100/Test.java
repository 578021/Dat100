package no.hvl.dat100;

public class Test {

	public static void main(String[] args) {
	/*Kvadrat kv3 = new Kvadrat(3);
	Kvadrat kv4 = new Kvadrat(4);
	Kvadrat kv5 = new Kvadrat(5);
	
	kv3.skrivut();
	kv4.skrivut();
	kv5.skrivut();
	
	System.out.println(kv3.Areal());
	System.out.println(kv4.Areal());
	System.out.println(kv5.Areal());
	System.out.println("");
	System.out.println(kv3.Omkrets());
	System.out.println(kv4.Omkrets());
	System.out.println(kv5.Omkrets());
	System.out.println("");
	System.out.println(kv3.Diagonal());
	System.out.println(kv4.Diagonal());
	System.out.println(kv5.Diagonal());
	
	Konto k1 = new Konto(321, 5000);
	Konto k2 = new Konto(123, 600000);
	Konto k3 = new Konto(456, 1000000);
	
	k3.taut();
	k2.settinn();
	k1.lese();
	k2.lese();
	k3.lese();
	
	Vare spade = new Vare(123, "Spade", 119.99);
	Vare hammer = new Vare(234, "Hammer", 200.00);
	
	spade.moms();
	hammer.moms();
	spade.billigereEnn(hammer);
	hammer.billigereEnn(spade);
	System.out.println(spade.toString());
	System.out.println(hammer.toString());
	*/
		
	Varelager v1 = new Varelager(9);
	Vare vare1 = new Vare(1, "Spade", 159.90);
	Vare vare2 = new Vare(2, "Spyd", 1559.90);
	Vare vare3= new Vare(3, "Hammer", 59.90);
	Vare vare4 = new Vare(4, "Spiker", 5.90);
	Vare vare5 = new Vare(5, "Skrue", 9.90);
	v1.leggTil(vare1);
	v1.leggTil(vare2);
	v1.leggTil(vare3);
	v1.leggTil(vare4);
	v1.leggTil(vare5);
	v1.skrivUt();
	v1.slett(2);
	v1.skrivUt();
	Grensesnitt.lesFlereVarer(v1);
	Grensesnitt.visAlle(v1);
	Grensesnitt.visAlleSortert(v1);
	
	
	} 
	

}

package no.hvl.dat100;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Tove", "Maldnes", 1999, 'k', 155782, "B-klassen");
		Student s2 = new Student("Ole", "Kjellstova", 1996, 'm', 178023, "A-klassen");
		Lerar l1 = new Lerar("Stian", "Klovn", 1972, 'm', 497000, 128749);
		Lerar l2 = new Lerar("Kristen", "Knarvik", 1961, 'k', 500000, 193452);
		Student s3 = new Student("Ola", "Kjellstoven", 1997, 'm', 178123, "C-klassen");
		
		PersonSamling samling = new PersonSamling(2);
		samling.leggTil(s1);
		samling.leggTil(s2);
		samling.leggTil(l1);
		samling.leggTil(l2);
		samling.leggTil(s3);
		samling.skrivUt();
		System.out.println(samling.eldst().getEtternavn());
	}
}

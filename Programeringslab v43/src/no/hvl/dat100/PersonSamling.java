package no.hvl.dat100;

public class PersonSamling {
	private int antall;
	private Person[] person;
	
	public PersonSamling(int start) {
		person = new Person[start];
		antall = 0;
	}
	public void leggTil(Person p) {
		if(antall < person.length) {
			person[antall] = p;
			antall++;
		}else if (antall == person.length) {
			Person[] personv2 = new Person[person.length*2];
			for(int i = 0; i < person.length; i++) {
				personv2[i] = person[i];
				personv2[antall] = p;
				
			}
			antall++;
			person = personv2;
		}
	}
	public void skrivUt() {
		for(int i = 0; i<antall; i++) {
			System.out.println(person[i].toString());
		}
	}
	public Person eldst() {
		Person temp = null;
		int eldst = person[0].getFoedselsaar();
		for(int i = 0; i < antall; i++) {
			if(person[i].getFoedselsaar()<eldst) {
				eldst = person[i].getFoedselsaar();
				temp = person[i];
			}
		}
		return temp;
	}
	
}

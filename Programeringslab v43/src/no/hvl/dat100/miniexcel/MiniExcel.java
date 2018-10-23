package no.hvl.dat100.miniexcel;

public class MiniExcel {
	private static int[][] data = { { 1, 2, 4, 0 }, { 2, 2, 4, 0}, { 3, 4, 5, 0 }, { 5, 6, 5, 0 }, { 0, 0, 0, 0 } };

	public static void skrivUt() {

		System.out.println("-----");

		// TODO - START
		for(int[] a : data) {
			for(int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		// iterer igjennom tabellen og skriv ut - utvidet for-løkke

		// TODO _END

		System.out.println("-----");
	}

	public static void beregnSum() {

		// TODO - START
		
		
		for(int i = 0; i < data.length; i++) {
			int sum = 0;
			int[] rad = data[i];
			int sistepos = rad.length-1;
			for(int j = 0; j < rad.length; j++) {
				int a = rad[j]; 
				sum = sum + a;
			}
			rad[sistepos] = sum;
		}
		// summer hver rad og skriv summen i siste element
	
		// TODO - END

		
		// TODO - START
	
		int sisteradpos = data.length - 1;
		int radlengde = data[0].length;
		int[] sisterad = data[sisteradpos];
		for(int i = 0; i < radlengde; i++) {
			int sum = 0;
		for(int j = 0; j < data.length; j++) {
			sum = sum + data[j][i];
		}
		sisterad[i]=sum;
		}
		// summer hver kolonne og skrive summen i siste element

		// TODO - END

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}


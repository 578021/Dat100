package no.hvl.dat100.lesinnfil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LeseFraFil {
	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/lesinnfil/";

	static public void main(String[] args) throws FileNotFoundException {

		String filnavn;
		for (int i = 1; i <= 3; i++) {
			filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

			try {
				File file = new File(MAPPE_STR + filnavn);
				Scanner reader = new Scanner(file);

				int linenumber = 1;

				// les innhold i filen linje for linje
				String line;

				while (reader.hasNextLine()) {
					line = reader.nextLine();
					System.out.println(linenumber + " " + line);
					linenumber++;
				}

				reader.close();
			} catch (FileNotFoundException e) {
				if (i < 2) {
					JOptionPane.showMessageDialog(null,
							"Filen " + filnavn + " finnes ikke, du har 2 forsøk igjen \n" + e.getMessage());
				} else if (i < 3) {
					JOptionPane.showMessageDialog(null,
							"Filen " + filnavn + " finnes ikke, du har 1 forsøk igjen \n" + e.getMessage());
				} else{
					JOptionPane.showMessageDialog(null,
							"Filen " + filnavn + " finnes ikke, ingen flere forsøk \n" + e.getMessage());
				}
			}
		}
	}
}

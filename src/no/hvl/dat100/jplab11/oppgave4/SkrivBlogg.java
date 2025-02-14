package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean sjekket = false;
		PrintWriter skriver = null;

		try {
			skriver = new PrintWriter(mappe + "/" + filnavn);

			skriver.println(samling.toString());

		} catch (FileNotFoundException e) {
			sjekket = false;
		} finally {
			if (skriver != null)
				skriver.close();
			sjekket = true;
		}
		return sjekket;
	}

}

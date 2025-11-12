package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try{
            String filepath = Paths.get(mappe, filnavn).toString();
            PrintWriter writer = new PrintWriter(filepath);

            writer.print(samling.toString());
            writer.close();

            return true;
        } catch(FileNotFoundException e){
            System.out.println("Feil ved skriving til fil: " + e.getMessage());

            return false;
        } catch (IOException e){
            System.out.println("Feil ved skriving til fil: "+ e.getMessage());
            return false;
        }
	}
}

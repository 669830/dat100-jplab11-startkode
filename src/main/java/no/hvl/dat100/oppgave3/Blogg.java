package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[]  innleggstabell;
    private int nesteledig;

	public Blogg() {
        innleggstabell = new Innlegg[20];
        nesteledig = 0;

	}

	public Blogg(int lengde) {

        innleggstabell = new Innlegg[lengde];
        nesteledig = 0;
	}

	public int getAntall() {

        return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i = 0; i < innleggstabell.length; i++){
            if (innleggstabell[i].erLik(innlegg)) {

                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		if(nesteledig < innleggstabell.length){
            return true;
        }else{
            return false;
        }

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(finnes(innlegg))
            return true;{
        }
        if(!ledigPlass()){
            return false;
        }
        innleggstabell[nesteledig] = innlegg;
        nesteledig++;
        return true;

    }
	
	public String toString() {
        String resultat = nesteledig + "\n";

        for (int i = 0; i < nesteledig; i++) {
            resultat += innleggstabell[i].toString();
        }

        return resultat;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nyTabell = new Innlegg[innleggstabell.length*2];
        for(int i = 0; i < innleggstabell.length; i++){
            nyTabell[i] =innleggstabell[i];
        }
        innleggstabell = nyTabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if(finnes(innlegg)){
            return false;
        }
        if(!ledigPlass()){
            utvid();
        }
        innleggstabell[nesteledig] = innlegg;
        nesteledig++;
        return true;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int posisjon = finnInnlegg(innlegg);
        if(posisjon == -1){
            return false;
        }
        for(int i = 0; i < nesteledig -1; i++){
            innleggstabell[i] = innleggstabell[i+1];
        }
        innleggstabell[nesteledig -1] = null;
        nesteledig--;

        return true;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
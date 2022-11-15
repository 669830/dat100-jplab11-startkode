package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
//hei
public class Blogg {

	protected Innlegg[] innleggtabell;

	protected int nesteledig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		nesteledig = 0;

	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return new Innlegg[innleggtabell.length];

	}
		
	public int finnInnlegg(Innlegg innlegg) {

		//throw new UnsupportedOperationException(TODO.method());
		boolean funnet = false;
		int pos = 0;
		
		while(pos<nesteledig && !funnet) {
			if(innleggtabell[pos].erLik(innlegg)) 
				funnet = true;
			else
					pos++;
		}
			if(funnet)
				return pos;
			else
				return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean funnet = false;
		int pos = finnInnlegg(innlegg);
		if(pos>=0)
			return funnet = true;
		else
			return funnet = false;
	}

	public boolean ledigPlass() {
		
		boolean ledig;
		
		if(nesteledig < innleggtabell.length)
			return ledig = true;
		else
			return ledig = false;

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean legg = false;
		if(ledigPlass()) {
			innleggtabell[nesteledig]=innlegg;
			nesteledig++;
			return legg = true;
		}
		else 
			return legg;
	}

	public String toString() {
		String str = nesteledig + "\n";
		
		for (int pos = 0; pos < nesteledig; pos++) {
			
			str += innleggtabell[pos].toString();
			
		}
		return str;
	}


	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
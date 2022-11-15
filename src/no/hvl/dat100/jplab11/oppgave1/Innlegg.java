package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

//hei
public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
		
	//konstruktør
	public Innlegg(int id, String bruker, String dato) {

		this.id=id;
		this.bruker = bruker;
		this.dato=dato;
		this.likes=0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id=id;
		this.bruker = bruker;
		this.dato=dato;
		this.likes=likes;
	}
	//get metode
	public String getBruker() {
		
		return bruker;

	}
	//set metode
	public void setBruker(String bruker) {
		this.bruker=bruker;
	}

	public String getDato() {
		return dato;
	}
	//set metode
	public void setDato(String dato) {
		this.dato=dato;
		}
	//get metode
	public int getId() {
		return id;

	}
	//get metode
	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes = likes+1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		boolean erlik = false;
		if (this.id==innlegg.getId()) {
			erlik = true;
		}
		return erlik;

	}
	
	@Override
	public String toString() {
		
		String str;
		
		str = id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n";

		return str;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

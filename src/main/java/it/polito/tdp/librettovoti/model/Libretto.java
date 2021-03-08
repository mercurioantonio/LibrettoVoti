package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	public void add(Voto v) {
		
		this.voti.add(v);
	}
	
/*	public void stampaVotiUguali (int punteggio) {
		//il libretto stampa da solo i voti
		System.out.println();
	}
	
	public String votiUguali (int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli
		//--> solo il nome?
		//--> tutto il voto.toString()
	}
*/
	
	public List<Voto> listaVotiUguali (int punteggio){
		List<Voto> risultato = new ArrayList<>() ;
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v);
			}
		}
		
		return risultato;
	}
	
	
	public Libretto votiUguali (int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
		      //risultato.add(v);
				risultato.voti.add(v);
			}
		}
		
		return risultato;
	}
	/**
	 * Ricerca un voto del corso di cui è specificato il nome
	 * Se il corso non esiste restituisce null
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		for(Voto v : this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato = v;
				break;
			}
		}
		
		return risultato;
	}
	
	public String toString () {
		String s = "";
		for(Voto v : this.voti) {
			s = s + v.toString() + "\n" ;
		}
		
		return s;
	}

}

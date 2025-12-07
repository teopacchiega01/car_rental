package it.unipv.pois.bikar_car_rental.model.Cliente;

import it.unipv.pois.bikar_car_rental.model.Patenti.Patente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;

public class Privato extends Cliente {
	private String nome;
	private String cognome;
	private int eta;
	
	public Privato(String id, Posizione pos, Patente pat, String nome, String cognome, int eta) {
		super(id, pos, pat);
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	public Privato(String id, Posizione pos, Patente pat) {
		super(id, pos, pat);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
}

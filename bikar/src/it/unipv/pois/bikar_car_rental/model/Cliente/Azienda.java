package it.unipv.pois.bikar_car_rental.model.Cliente;

import it.unipv.pois.bikar_car_rental.model.Patenti.Patente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;

public class Azienda extends Cliente {
	private String nome;
	private RagioneSociale rs;
	
	public Azienda(String id, Posizione pos, Patente pat, String nome, RagioneSociale rs) {
		super(id, pos, pat);
		this.nome = nome;
		this.rs = rs;
	}
	public Azienda(String id, Posizione pos, Patente pat) {
		super(id, pos, pat);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public RagioneSociale getRs() {
		return rs;
	}
	public void setRs(RagioneSociale rs) {
		this.rs = rs;
	}
	
	
}

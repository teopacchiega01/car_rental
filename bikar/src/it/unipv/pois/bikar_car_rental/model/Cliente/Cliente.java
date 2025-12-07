package it.unipv.pois.bikar_car_rental.model.Cliente;

import it.unipv.pois.bikar_car_rental.model.Patenti.Patente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;

public abstract class Cliente {
	private String id;
	private Posizione pos;
	private Patente pat;
	
	public Cliente(String id, Posizione pos, Patente pat) {
		super();
		this.id = id;
		this.pos = pos;
		this.pat = pat;
	}
	public Cliente() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Posizione getPos() {
		return pos;
	}
	public void setPos(Posizione pos) {
		this.pos = pos;
	}
	public Patente getPat() {
		return pat;
	}
	public void setPat(Patente pat) {
		this.pat = pat;
	}
	
	
}

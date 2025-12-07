package it.unipv.pois.bikar_car_rental.model.Patenti;

import java.util.EnumSet;

public class Patente {
	private String codice;
	private EnumSet<TipoPatente> abilitazioni;
	
	public Patente(String codice, EnumSet<TipoPatente> abilitazioni) {
		super();
		this.codice = codice;
		this.abilitazioni = abilitazioni;
	}
	public Patente() {
		super();
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public EnumSet<TipoPatente> getAbilitazioni() {
		return abilitazioni;
	}
	public void setAbilitazioni(EnumSet<TipoPatente> abilitazioni) {
		this.abilitazioni = abilitazioni;
	}
	
	
}

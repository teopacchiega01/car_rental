package it.unipv.pois.bikar_car_rental.model.Veicoli.Autoveicoli;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;
import it.unipv.pois.bikar_car_rental.model.Veicoli.TipoCarburante;
import it.unipv.pois.bikar_car_rental.model.Veicoli.Veicolo;

public abstract class Autoveicolo extends Veicolo {
	private boolean cambio_automatico;

	
	public Autoveicolo() {
		super();
	}
	public boolean isCambio_automatico() {
		return cambio_automatico;
	}
	public void setCambio_automatico(boolean cambio_automatico) {
		this.cambio_automatico = cambio_automatico;
	}
	
}

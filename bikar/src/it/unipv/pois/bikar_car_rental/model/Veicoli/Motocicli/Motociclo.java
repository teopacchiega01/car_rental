package it.unipv.pois.bikar_car_rental.model.Veicoli.Motocicli;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;
import it.unipv.pois.bikar_car_rental.model.Veicoli.TipoCarburante;
import it.unipv.pois.bikar_car_rental.model.Veicoli.Veicolo;

public abstract class Motociclo extends Veicolo {
	private int numero_tempi;

	public Motociclo(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			double tariffazione, boolean disponibile, TipoPatente pat_richiesta, int numero_tempi) {
		super(marca, modello, targa, pos, carburante, tariffazione, disponibile, pat_richiesta);
		this.numero_tempi = numero_tempi;
	}
	public Motociclo(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			double tariffazione, boolean disponibile, TipoPatente pat_richiesta) {
		super(marca, modello, targa, pos, carburante, tariffazione, disponibile, pat_richiesta);
	}
	public Motociclo() {
		super();
	}
	public int getNumero_tempi() {
		return numero_tempi;
	}
	public void setNumero_tempi(int numero_tempi) {
		this.numero_tempi = numero_tempi;
	}
	
	
}

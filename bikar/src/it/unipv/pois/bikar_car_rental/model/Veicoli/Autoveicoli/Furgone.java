package it.unipv.pois.bikar_car_rental.model.Veicoli.Autoveicoli;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;
import it.unipv.pois.bikar_car_rental.model.Veicoli.TipoCarburante;

public class Furgone extends Autoveicolo {
	private double portata_massima;
	
	public Furgone(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			double tariffazione, boolean disponibile, TipoPatente pat_richiesta, boolean cambio_automatico,
			double portata_massima) {
		super(marca, modello, targa, pos, carburante, tariffazione, disponibile, pat_richiesta, cambio_automatico);
		this.portata_massima = portata_massima;
	}
	public Furgone(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			boolean disponibile, boolean cambio_automatico) {
		super(marca, modello, targa, pos, carburante, 2, disponibile, TipoPatente.B, cambio_automatico);
	}
	public Furgone() {
		super();
	}
	

	public double getPortata_massima() {
		return portata_massima;
	}
	public void setPortata_massima(double portata_massima) {
		this.portata_massima = portata_massima;
	}
	@Override
	public Posizione getPosizione() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoPatente getPatenteRichiesta() {
		// TODO Auto-generated method stub
		return null;
	}

}

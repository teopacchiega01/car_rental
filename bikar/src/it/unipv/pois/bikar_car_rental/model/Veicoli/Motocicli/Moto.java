package it.unipv.pois.bikar_car_rental.model.Veicoli.Motocicli;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;
import it.unipv.pois.bikar_car_rental.model.Veicoli.TipoCarburante;

public class Moto extends Motociclo {
	private boolean borse_laterali;
	
	public Moto(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			boolean disponibile, int numero_tempi, boolean borse_laterali) {
		super(marca, modello, targa, pos, carburante, 0.8, disponibile, TipoPatente.A2, numero_tempi);
		this.borse_laterali = borse_laterali;
	}
	public Moto(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			boolean disponibile, int numero_tempi) {
		super(marca, modello, targa, pos, carburante, 0.8, disponibile, TipoPatente.A2, numero_tempi);
	}
	public Moto() {
		super();
	}
	public boolean isBorse_laterali() {
		return borse_laterali;
	}
	public void setBorse_laterali(boolean borse_laterali) {
		this.borse_laterali = borse_laterali;
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

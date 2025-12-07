package it.unipv.pois.bikar_car_rental.model.Veicoli.Motocicli;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;
import it.unipv.pois.bikar_car_rental.model.Veicoli.TipoCarburante;

public class Scooter extends Motociclo {
	private boolean vano_sella;
	
	public Scooter(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			boolean disponibile, int numero_tempi, boolean vano_sella) {
		super(marca, modello, targa, pos, carburante, 0.5, disponibile, TipoPatente.A1, numero_tempi);
		this.vano_sella = vano_sella;
	}
	public Scooter(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			boolean disponibile, int numero_tempi) {
		super(marca, modello, targa, pos, carburante, 0.5, disponibile, TipoPatente.A1, numero_tempi);
	}
	public Scooter() {
		super();
	}
	public boolean isVano_sella() {
		return vano_sella;
	}
	public void setVano_sella(boolean vano_sella) {
		this.vano_sella = vano_sella;
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

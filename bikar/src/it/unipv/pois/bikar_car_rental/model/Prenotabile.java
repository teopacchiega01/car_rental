package it.unipv.pois.bikar_car_rental.model;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;

public interface Prenotabile {
	public boolean isDisponibile();
	public Posizione getPosizione();
	public double getTariffazione();
	public TipoPatente getPatenteRichiesta();
	
}

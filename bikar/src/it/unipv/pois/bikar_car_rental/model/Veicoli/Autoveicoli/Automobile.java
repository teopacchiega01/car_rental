package it.unipv.pois.bikar_car_rental.model.Veicoli.Autoveicoli;

import java.util.ArrayList;

import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;
import it.unipv.pois.bikar_car_rental.model.Veicoli.TipoCarburante;

public class Automobile extends Autoveicolo {
	private int numero_porte;
	
	
	public Automobile() {
		super();
	}
	public int getNumero_porte() {
		return numero_porte;
	}
	public void setNumero_porte(int numero_porte) {
		this.numero_porte = numero_porte;
	}
	
	
	@Override
	public Posizione getPosizione() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected ArrayList<TipoCarburante> getCarburantiAmmessi() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected ArrayList<TipoPatente> getPatentiAmmesse() {
		// TODO Auto-generated method stub
		return null;
	}

}

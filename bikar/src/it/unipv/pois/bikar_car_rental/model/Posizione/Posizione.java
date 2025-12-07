package it.unipv.pois.bikar_car_rental.model.Posizione;

public class Posizione {
	private double latitudine;
	private double longitudine;
	
	public Posizione(double latitudine, double longitudine) {
		super();
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}
	public Posizione() {
		super();
	}
	public double getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}
	public double getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}
	
	
}

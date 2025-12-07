package it.unipv.pois.bikar_car_rental.model;

import java.time.Duration;
import java.time.LocalDate;

import it.unipv.pois.bikar_car_rental.model.Cliente.Cliente;

public class Prenotazione {
	private Cliente noleggiante;
	private Prenotabile noleggiato;
	private LocalDate inizio_noleggio;
	private Duration durata_noleggio;
	private double costo;
	
	
	public Prenotazione(Cliente noleggiante, Prenotabile noleggiato, LocalDate inizio_noleggio,
			Duration durata_noleggio, double costo) {
		super();
		this.noleggiante = noleggiante;
		this.noleggiato = noleggiato;
		this.inizio_noleggio = inizio_noleggio;
		this.durata_noleggio = durata_noleggio;
		this.costo = costo;
	}
	public Prenotazione() {
		super();
	}
	public Cliente getNoleggiante() {
		return noleggiante;
	}
	public void setNoleggiante(Cliente noleggiante) {
		this.noleggiante = noleggiante;
	}
	public Prenotabile getNoleggiato() {
		return noleggiato;
	}
	public void setNoleggiato(Prenotabile noleggiato) {
		this.noleggiato = noleggiato;
	}
	public LocalDate getInizio_noleggio() {
		return inizio_noleggio;
	}
	public void setInizio_noleggio(LocalDate inizio_noleggio) {
		this.inizio_noleggio = inizio_noleggio;
	}
	public Duration getDurata_noleggio() {
		return durata_noleggio;
	}
	public void setDurata_noleggio(Duration durata_noleggio) {
		this.durata_noleggio = durata_noleggio;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}

package it.unipv.pois.bikar_car_rental.model.Veicoli;

import java.util.ArrayList;

import it.unipv.pois.bikar_car_rental.model.Prenotabile;
import it.unipv.pois.bikar_car_rental.model.Patenti.TipoPatente;
import it.unipv.pois.bikar_car_rental.model.Posizione.Posizione;

public abstract class Veicolo implements Prenotabile{
	private String marca;
	private String modello;
	private String targa;
	private Posizione posizione;
	private	TipoCarburante carburante;
	private double tariffazione;
	private boolean disponibile;
	private int eta_minima;
	
	public Veicolo(String marca, String modello, String targa, Posizione pos, TipoCarburante carburante,
			double tariffazione, boolean disponibile, int eta_minima) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.posizione = pos;
		this.carburante = carburante;
		this.tariffazione = tariffazione;
		this.disponibile = disponibile;
		this.eta_minima = eta_minima;
	}
	public Veicolo() {
		super();
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Posizione getPos() {
		return posizione;
	}
	public void setPos(Posizione pos) {
		this.posizione = pos;
	}
	public TipoCarburante getCarburante() {
		return carburante;
	}
	public void setCarburante(TipoCarburante carburante) {
		this.carburante = carburante;
	}
	public double getTariffazione() {
		return tariffazione;
	}
	public void setTariffazione(double tariffazione) {
		this.tariffazione = tariffazione;
	}
	public boolean isDisponibile() {
		return disponibile;
	}
	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	public int getEta_minima() {
		return eta_minima;
	}
	public void setEta_minima(int eta_minima) {
		this.eta_minima = eta_minima;
	}
	
	/*aggiustare questa classe e tutte le sottoclassi
	questi metodi restituiscono un'arrayList i cui elementi sono
	ciascuno un elemento dell'enum x:
	Automobile richiede patente B o C, quindi la sua implementazione
	di getPatentiAmmesse() restituisce un'arrayList contenente TipoPatente.B e TipoPatente.C;
	in prenotazione ci sarà un metodo di verifica per controllare se il cliente ha un'abilitazione
	che è nell'arrayList restituita dal metodo.
	Lo stesso vale per i carburanti
	*/
	protected abstract ArrayList<TipoCarburante> getCarburantiAmmessi();
	protected abstract ArrayList<TipoPatente> getPatentiAmmesse();
	
}

package gestionealbergo;

import java.time.*;

public class Prenotazione {
	
	private LocalDateTime arrivoIl; 
	private String richieste;
	private LocalDateTime partenza;
	private Camera camera;
	private Cliente cliente;
	
	public Prenotazione(LocalDateTime giornoArrivo,LocalDateTime partenza, Cliente cliente){
		if(giornoArrivo!=null)
			this.arrivoIl=giornoArrivo;
		else
			throw new IllegalArgumentException("specificare data");
		if(partenza!=null)
			this.partenza=partenza;
		else
			throw new IllegalArgumentException("specificare data");
		if(cliente!=null)
			this.cliente=cliente;
		else
			throw new IllegalArgumentException("inserire cliente");
	}
	
	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}
	
	public int getNumeroNotti() {
		return Period.between(arrivoIl.toLocalDate(), partenza.toLocalDate()).getDays();
	}
	
	public String getRichieste() {
		return richieste;
	}
	
	public LocalDateTime getPartenza() {
		return partenza;
	}
	
	public Camera getCamera() {
		return camera;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
}

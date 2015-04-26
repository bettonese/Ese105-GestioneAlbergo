package gestionealbergo;
import java.util.*;
import java.time.*;

 public abstract class Camera {
	private String numero;
	private Vector<Prenotazione> prenotazioni;
	private int postiLetto;
	
	public Camera(String numero, int postiLetto){
		if(numero!=null)
			this.numero=numero;
		else
			throw new IllegalArgumentException("inserire un numero");
		if(postiLetto>0)
			this.postiLetto=postiLetto;
		else
			throw new IllegalArgumentException("i posti letto devono essere maggiori di 0");
		this.prenotazioni=new Vector<Prenotazione>();
	}

	public void addPrenotazione(Prenotazione p) throws Exception{
		if(this.isDisponibile(p.getArrivoIl(), p.getPartenza())){
			prenotazioni.addElement(p);
		}
		else
			throw new Exception("Camera non disponibile");
	}
	
	public boolean isDisponibile(LocalDateTime arrivoIl, LocalDateTime partenza){
		boolean controllo = true;
		for(Prenotazione p : prenotazioni) {
			if(arrivoIl.isAfter(p.getPartenza())==true && partenza.isBefore(p.getArrivoIl())==true)
			{
				controllo = false;
			}
		}
		return controllo;
	}

	public String getNumero() {
		return numero;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public int getPostiLetto() {
		return postiLetto;
	}

}

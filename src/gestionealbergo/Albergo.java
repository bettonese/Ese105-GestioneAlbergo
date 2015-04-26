package gestionealbergo;

import java.util.*;

public class Albergo {
	private String nome;
	public Vector<Camera> camere;

	public Albergo(String nome){
		if(nome!=null)
			this.nome=nome;
		else
			throw new IllegalArgumentException("inserire un nome");
		this.camere=new Vector<Camera>();
	}
	public Vector<Camera> getCamere() {
		return camere;
	} 
	

}

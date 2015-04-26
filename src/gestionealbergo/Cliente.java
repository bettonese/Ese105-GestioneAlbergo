package gestionealbergo;

public class Cliente {
	private String nome;
	private String cognome;
	private String cellulare;
	private String email;
	
	public Cliente(String nome, String cognome, String cellulare){
		if(nome!=null)
			this.nome=nome;
		else
			throw new IllegalArgumentException("nome non presente");
		if(cognome!=null)
			this.cognome=cognome;
		else
			throw new IllegalArgumentException("cognome non presente");
		if(cellulare!=null)
			this.cellulare=cellulare;
		else
			throw new IllegalArgumentException("numero non presente");
	}
	
	public Cliente(String nome, String cognome, String cellulare, String email){
		if(nome!=null)
			this.nome=nome;
		else
			throw new IllegalArgumentException("nome non presente");
		if(cognome!=null)
			this.cognome=cognome;
		else
			throw new IllegalArgumentException("cognome non presente");
		if(cellulare!=null)
			this.cellulare=cellulare;
		else
			throw new IllegalArgumentException("numero non presente");
		if(email!=null)
			this.email=email;
		else
			throw new IllegalArgumentException("mail non presente");
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome!=null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("nome non presente");
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		if(cognome!=null)
			this.cognome = cognome;
		else
			throw new IllegalArgumentException("cognome non presente");
	}
	public String getCellulare() {
		return cellulare;
	}
	public void setCellulare(String cellulare) {
		if(cellulare!=null)
			this.cellulare = cellulare;
		else
			throw new IllegalArgumentException("cellulare non presente");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email!=null)
			this.email = email;
		else
			throw new IllegalArgumentException("mail non presente");
	}
	@Override
	public String toString() {
		return "Prenotazione [nome=" + nome + ", cognome=" + cognome
				+ ", cellulare=" + cellulare + ", email=" + email + "]";
	}

}

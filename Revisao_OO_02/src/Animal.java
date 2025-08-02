
public class Animal {

	public Animal() {	
	System.out.println("Teste");

	}

	// Construtor
	public Animal(String nmAnimal, int idaAnimal, Double psAnimal, String tpAnimal, String dnAnimal) {
		nomeAnimal = nmAnimal;
		idadeAnimal = idaAnimal;
		pesoAnimal = psAnimal;
		tipoAnimal = tpAnimal;
		donoAnimal = dnAnimal;		
	}
	
	public String Informacoes() {
		return "Nome do Animal: " + nomeAnimal + ", idade do animal: " + idadeAnimal + ", peso do animal: " + pesoAnimal + ", tipo do animal: " + tipoAnimal + ", dono do animal: " + donoAnimal;
	}
		
	

	// Atributos
	private String nomeAnimal;
	private int idadeAnimal;
	private Double pesoAnimal;
	private String tipoAnimal;
	private String donoAnimal;

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public Double getPeso() {
		return pesoAnimal;
	}

	public void setPeso(Double peso) {
		this.pesoAnimal = peso;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getDonoAnimal() {
		return donoAnimal;
	}

	public void setDonoAnimal(String donoAnimal) {
		this.donoAnimal = donoAnimal;
	}

	public void caoEmitirSom() {
		System.out.println("Au au!");
	}

	public void gatoEmitirSom() {
		System.out.println("Miau!");
	}
}

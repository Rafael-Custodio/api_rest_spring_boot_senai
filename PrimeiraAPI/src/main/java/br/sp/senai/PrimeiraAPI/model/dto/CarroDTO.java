package br.sp.senai.PrimeiraAPI.model.dto;

public class CarroDTO {
	
	private String chassi;
	private String modelo;
	private int ano;
	private String marca;
	
	public CarroDTO(String chassi, 
			String modelo, 
			int ano, String marca) {
		this.chassi = chassi;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


}

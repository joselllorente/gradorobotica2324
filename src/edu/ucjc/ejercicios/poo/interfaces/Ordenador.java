package edu.ucjc.ejercicios.poo.interfaces;

public class Ordenador implements Updatable {

	private String marca;
	private String modelo;
	
	public Ordenador(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public void insert() {
		System.out.println("Insertando un ordenador");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	

}

package edu.ucjc.ejercicios.poo.interfaces;

public class Persona implements Insertable {
	private String dni;
	private String nombre;
	
	
	public Persona(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public void insert() {
		System.out.println("Insertando Persona");

	}

}

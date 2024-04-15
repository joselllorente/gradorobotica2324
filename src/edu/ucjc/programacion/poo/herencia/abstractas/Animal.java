package edu.ucjc.programacion.poo.herencia.abstractas;

public abstract class Animal {
	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Clase1 [nombre=" + nombre + "]";
	}
	
	public void respirar() {
		System.out.println("Animal respirando");
	}
	
	public abstract void beber();
	
	public abstract void comer();
}

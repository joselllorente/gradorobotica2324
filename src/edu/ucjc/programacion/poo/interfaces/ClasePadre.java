package edu.ucjc.programacion.poo.interfaces;

public class ClasePadre {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ClasePadre [nombre=" + nombre + "]";
	}
	
	public void metodo5() {
		System.out.println("Llamando método 5");
	}
}

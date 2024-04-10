package edu.ucjc.ejercicios.poo.herencia;

public class Instrumento {
	private String nombre;
	private String tipo;
	private double precio;
	private String marca;
	private boolean afinado;
	
	public Instrumento(String nombre, String tipo, double precio, String marca) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.marca = marca;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean isAfinado() {
		return afinado;
	}
	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", marca=" + marca + "]";
	}

	
	void afinar () {
		double num = Math.random()*10;
		
//		if (num<=8) {
//			this.afinado = true;
//		}
		
		//Operador ternario
		//this.afinado = num<=8 ? true : false;
		
		this.afinado = num<=8;
		System.out.println("Instrumento "+nombre+ " afinado "+this.afinado);
	}
	
	void tocar () {
		
		System.out.println("El instrumento "+ nombre +
				" est�  " + (this.afinado?"sonando bien":"tocando mal") );
		
		
	}
	
	
}

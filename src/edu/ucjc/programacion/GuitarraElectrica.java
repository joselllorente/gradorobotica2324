package edu.ucjc.programacion;

import edu.ucjc.ejercicios.poo.herencia.Guitarra;

public class GuitarraElectrica extends Guitarra {
	private double potencia;

	public GuitarraElectrica(String nombre, String tipo, double precio, String marca, int numCuerdas, String material,
			double potencia) {
		super(nombre, tipo, precio, marca, numCuerdas, material);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", toString()=" + super.toString() + "]";
	}

	@Override
	protected void tocar() {
		// TODO Auto-generated method stub
		super.tocar();
		System.out.println("Es una guitarra electrica con "+potencia+ " watios");
	}
	
	
	
}

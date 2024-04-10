package edu.ucjc.ejercicios.poo.herencia;

public class Guitarra extends Instrumento{

	private int numCuerdas;
	private String material;
	
	public Guitarra(String nombre, String tipo, double precio, String marca, int numCuerdas, String material) {
		super(nombre, tipo, precio, marca);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", material=" + material + ", toString()=" + super.toString()
				+ "]";
	}
	
	@Override
	protected void tocar() {
		System.out.println("Se esta tocando la guitarra " + (this.isAfinado()?"bien":"mal") );
	}

}

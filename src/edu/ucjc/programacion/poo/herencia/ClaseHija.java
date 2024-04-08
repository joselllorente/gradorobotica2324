package edu.ucjc.programacion.poo.herencia;

public class ClaseHija extends ClasePadre {
	private String atributo2;

	public ClaseHija() {
		super("", 1);
	}
	public ClaseHija(String atributo1, 
			int numero1, 
			String atributo2) {
		super(atributo1);
		this.atributo2 = atributo2;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	
	//Sobreescritura
	//+ mismo nombre
	//+ Devuelve lo mismo
	//+ acepta mismo número y tipo de parámetros
	//+ modificador de acceso el mismo o menos restrictivo
	@Override
	public void metodo1(int numero) {
		System.out.println("Metodo1 Hija");

	}
	
	@Override
	public String toString() {
		return "ClaseHija [atributo2=" + atributo2 + ", atributo1=" + getAtributo1() + ", getNumero1()="
				+ getNumero1() + "]";
	}
	
	
	
	
}

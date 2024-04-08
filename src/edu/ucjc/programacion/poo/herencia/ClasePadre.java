package edu.ucjc.programacion.poo.herencia;

public class ClasePadre {
	private String atributo1;
	private int numero1;
	
//	public ClasePadre() {
//		
//	}
	
	public ClasePadre(String atributo1, int numero1) {
		//super();
		this.atributo1 = atributo1;
		this.numero1 = numero1;
	}
	
	public ClasePadre(String atributo1) {
		//super();
		this.atributo1 = atributo1;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public void metodo1(int num) {
		System.out.println("Metodo1 Padre");
	}
	
}

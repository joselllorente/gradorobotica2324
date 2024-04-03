package edu.ucjc.programacion.poo;

public class Persona {
	//Variables de instancia
	String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	//Constructores
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public Persona() {

	}

	
	public Persona(String nombre) {

		this.nombre = nombre;
	}

	public Persona(String nombre, String apellidos, String dni, int edad) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	//Métodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public void correr () {
		if (this.edad<18) {
			System.out.println("Corre muy rápido");
		}else if (edad>=18 && edad <40){
			System.out.println("Corre rápido");
		}else {
			System.out.println("Corre lento");
		}
		
		
	}
	
}

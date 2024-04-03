package edu.ucjc.ejercicios.poo.ejercicio4;

import edu.ucjc.ejercicios.poo.Alumno;

/*
 * Definir método que eleve un numero a la potencia pasada
 * Definir un método que le cambie la edad a un alumno elevándola al cubo
 * En el main, 
 * 	 + elevar un número a la 4 y mostrar el resultado
 * 	 + Crear un alumno y cambiarle su edad
 * 
 * 
 */
public class Ejercicio4 {
	
	private double potencia (int base, int potencia) {
		
		double resultado = Math.pow(base, potencia);
		
		return resultado;
	}
	
	private void cambiarEdadAlumno(Alumno alumno) {
		double resultado = potencia(alumno.getEdad(),3);
		alumno.setEdad((int)resultado);
	}
	

	public static void main(String[] args) {
		Ejercicio4 ejer4 = new Ejercicio4();
		int numero = 6;
		double resultado = ejer4.potencia(numero, 4);
		System.out.println(resultado);
		
		Alumno alumno1 = new Alumno("N1","A1","1111A");
		alumno1.setEdad(19);
		ejer4.cambiarEdadAlumno(alumno1);
		System.out.println(alumno1.getEdad());

	}

}

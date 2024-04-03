package edu.ucjc.programacion.repaso.ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		int tamanioArray = scan.nextInt();
		
		int [] numeros = new int [tamanioArray];
		
		int [][] numerosBidimensional = new int [2][3];
		
		for(int i=0; i<tamanioArray;i++) {
			System.out.println("Introduce el valor de la posición "+i);
			numeros[i]=scan.nextInt();
		}

		for(int i=0; i<tamanioArray;i++) {
			int numero = numeros[i];
			if (numero%2==0) {
				System.out.println(numero);
			}
		}
		
	}

}

package edu.ucjc.ejercicios.condicionalesybucles;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			System.out.println("\n1. Pintar numeros");
			System.out.println("2. Pintar cuadrado");
			System.out.println("3. Numeros Fibonnacci");
			System.out.println("4. Salir");
			
			System.out.println("Seleccione una opción");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch(opcion) {
				case 1: 
					for(int i=1;i<10;i++) {
						System.out.print(i+"\t");
						if(i%3==0) {
							//System.out.println();
							System.out.print("\n");
						}
					}
					break;
				case 2: 
					int tamanyo = 4;
					for (int i=0;i<tamanyo;i++) {
						for(int j=0;j<tamanyo;j++) {
							if(i==0 || i==tamanyo-1) {
								System.out.print("* ");
							}else {
								if(j==0 || j==tamanyo-1) {
									System.out.print("* ");
								}else {
									System.out.print("  ");
								}
							}
						}
						System.out.println();
					}
					
					
					break;
				case 3: 
					System.out.println("Introduce números a mostrar de la serie de Fibonacci");
					int cantidadNumeros = scan.nextInt();
					
					int num1 = 0;
					int num2 = 1;
					System.out.println(num1);
					System.out.println(num2);
					for (int i=0; i<cantidadNumeros-2; i++) {
						
						int suma = num1+num2;
						System.out.println(suma);
						num1 = num2;
						num2 = suma;
						
					}
					
					break;
				case 4: System.out.println("Adios!!");break;
				default: System.out.println("El número es incorrecto elige otra opción!!");break;
			}
			
			
			
		}while(opcion!=4);

	}

}

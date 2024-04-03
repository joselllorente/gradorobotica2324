package edu.ucjc.programacion.repaso;

public class Condicionales {

	public static void main(String[] args) {
		int numero = 9;
		int numero2 = 10;
		System.out.println(numero++ );
		System.out.println(numero+=10);
		boolean cumpleCondicion = numero++ > 9;
		if (cumpleCondicion && numero2 >6) {
			System.out.println("Numero mayor 9");
		}else if (numero >=6 && numero <7 ){
			System.out.println("Numero mayor que 6 <7");
		}else if (numero >4 || numero ==10 ){
			System.out.println("Numero 10");
		}
		else {
			System.out.println("otro resultado");
		}
		System.out.println("=======================");
		
		
		int opcion=3;
		//Evalua enteros y Strings
		switch (opcion) {
			case 3: 
			case 9: System.out.println("El valor es 3 o 9");break;
			default: System.out.println("El valor es otro");
		
		}
		
		
		
	}

}

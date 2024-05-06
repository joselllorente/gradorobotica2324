package edu.ucjc.ejercicios.colecciones;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		Set<String> colores = new HashSet();
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Blanco");
		String c= new String("Rojo");
		System.out.println(c.hashCode());
		colores.add(new String("Rojo"));
		
		for (String color : colores) {
			System.out.println(color);
		}
	}

}

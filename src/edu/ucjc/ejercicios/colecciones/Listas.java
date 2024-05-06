package edu.ucjc.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.List;

import edu.ucjc.ejercicios.poo.composición.Coche;

public class Listas {

	public static void main(String[] args) {
		
		ArrayList lista1 = new ArrayList();
		lista1.add("Dato1");
		lista1.add(2);
		Coche c1 = new Coche("1111A","Ford");
		lista1.add(c1);
		
		System.out.println(lista1.size());

//		for (Object object : lista1) {
//			if (object instanceof Coche) {
//				System.out.println(((Coche)object).getMatricula());
//			}else {
//				System.out.println(object);
//			}
//		}
		
		Coche c2 = new Coche("2222A","Ford");
		List<Coche> coches = new ArrayList();
		coches.add(c2);
		coches.add(c1);
		coches.add(new Coche("3333B","Renault"));
		coches.add(0,c1);
		for (Coche coche : coches) {
			System.out.println(coche.getMatricula());
		}
		
		
		coches.remove(c2);
		//coches.remove(c2);
		System.out.println("=========================");
		for (Coche coche : coches) {
			System.out.println(coche.getMatricula());
		}
		//System.out.println(coches.get(1).getMatricula());
		
		System.out.println(c2.getMatricula());
		
		
		System.out.println(coches.get(coches.size()-1));
		
	}

}





package edu.ucjc.ejercicios.colecciones;

import java.util.HashMap;
import java.util.Map;

import edu.ucjc.ejercicios.poo.composición.Coche;

public class Mapas {

	public static void main(String[] args) {
		
		Map<String, Coche> coches = new HashMap();
		Coche c2 = new Coche("2222A","Ford");
		Coche c1 = new Coche("1111A","Renault");
		Coche c3 = new Coche("3333A","BMW");
		
		coches.put(c2.getMatricula(), c2);
		coches.put(c1.getMatricula(), c1);
		coches.put(c3.getMatricula(), c3);
		
		System.out.println(coches.get("3333A").getMarca());
		
		
	}

}

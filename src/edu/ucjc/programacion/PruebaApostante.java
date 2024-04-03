package edu.ucjc.programacion;

public class PruebaApostante {

	public static void main(String[] args) {
		
		String var1 = "Hola";
		String var2 = new String ("Hola");
		String var3 = "Hola";
		System.out.println(var1.equals(var2));
		
		
		
		
		Apostante a3 =new Apostante();
		Apostante a1 = new Apostante("Jose");
		int num=9;
		System.out.println("Hola"+num+2);
		a1.getContador();
		Apostante a2 = new Apostante("Jose");
		
		Apostante.contador= 2;
		Apostante.contador = 3;
		
		//Jose3
		System.out.println(a1.nombre + a1.contador);
		//Eva3
		System.out.println(a2.nombre + a2.contador);
		//3
		System.out.println(Apostante.contador);

	}

}

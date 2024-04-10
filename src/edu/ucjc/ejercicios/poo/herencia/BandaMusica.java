package edu.ucjc.ejercicios.poo.herencia;

import edu.ucjc.programacion.GuitarraElectrica;

public class BandaMusica {

	private String nombre;
	
	public BandaMusica(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Guitarra guitarra = new Guitarra("Guitarra","Española",300,"Yamaha",5,"Madera");
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra Electrica","Española",300,"Yamaha",5,"Madera",100);
		Instrumento bateria = new Bateria("Bateria","Tipo1",500.0,"Marca1",2,3);
		Piano piano = new Piano("Piano","Cola",1000, "Marca1", 5, 3);
		
		Instrumento guitarra2 = new Guitarra("Guitarra2","Española",300,"Yamaha",5,"Madera");
		//guitarra2.tocar();
		
		//Guitarra guitarra3 = new Instrumento("Guitarra","Española",300,"Yamaha");
		
		Instrumento [] instrumentos = {guitarra,guitarraElectrica,bateria, piano, guitarra2	};
		BandaMusica banda = new BandaMusica("The Beatles");
		banda.iniciarConcierto(instrumentos);
		
//		Instrumento bateria2 = new Bateria("Bateria","Tipo1",500.0,"Marca1",2,3);
//		((Bateria)bateria2).aporrear();
	}
	
	private void iniciarConcierto(Instrumento [] instrumentos) {
		//Afinamos
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		System.out.println();
		//Tocar
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Bateria) {
				Bateria bateria = (Bateria)instrumento;
				bateria.aporrear();
			}else {
				instrumento.tocar();
			}
		}
	}
}

package edu.ucjc.ejercicios.poo.ejercicio3;

import edu.ucjc.ejercicios.poo.Alumno;
import edu.ucjc.ejercicios.poo.Utilidades;

public class MenuUniversidadConMetodos {

	public static void main(String[] args) {
		
//		int edad = Utilidades.pideDatoEntero("Introduce tu edad");
//		System.out.println(edad);
//		String nombre = Utilidades.pideDatoString("Introduce tu nombre");
//		System.out.println("nombre: "+nombre);
		int opcion = 0;
		
		MenuUniversidadConMetodos menu = new MenuUniversidadConMetodos();
		Alumno[] alumnos = null;
		do {
			
			String[] opciones = {"1. Crear Universidad","2. Insertar Alumnos",
					"3. Mostrar Alumno","4. Buscar Alumno","5. Borrar Alumno","6. Salir"};
			Utilidades.pintarMenu(opciones);
			opcion = Utilidades.pideDatoEntero("Introduce una opción");
			
			switch(opcion) {
				case 1: alumnos = menu.crearUniversidad(); break;
				case 2: menu.insertarAlumnos(alumnos); break;
				case 3: menu.mostrarAlumnos(alumnos);break;
				case 4: menu.buscarAlumno(alumnos);break;
				case 5: menu.borrarAlumo(alumnos); break;
				case 6: System.out.println("Adios!!!");break;
				default: System.out.println("Opción incorrecta");
			}
			
		}while(opcion!=6);
		
	}

	private Alumno[] crearUniversidad() {
		int numAlumnos = Utilidades.pideDatoEntero("Introduce número de alumnos de la Universidad");
		
		Alumno[] alumnosUni = new Alumno[numAlumnos];
		
		return alumnosUni;
	}
//	
	private void insertarAlumnos (Alumno[] alumnos) {
		
		if (alumnos!=null) {
			
			for(int i=0; i<alumnos.length; i++) {
				String nombre = Utilidades.pideDatoString("Introduce nombre alumno" + (i +1) );
				String apellidos = Utilidades.pideDatoString("Introduce apellidos alumno" + (i +1) );
				String dni = Utilidades.pideDatoString("Introduce dni alumno" + (i +1) );
				int edad = Utilidades.pideDatoEntero("Introduce edad alumno" + (i +1) );
				
				Alumno alumno = new Alumno(nombre,apellidos,edad,dni);
				alumnos[i] = alumno;
			}

		}else {
			System.out.println("Debes crear primero la Universidad, selecciona la opción 1");
		}
		
	}
	
	private void mostrarAlumnos (Alumno[] alumnos) {
		if (alumnos!=null) {
			for (Alumno alumno   : alumnos  ) {
				if(alumno!=null) {
					System.out.println("Nombre: " + alumno.getNombre());
					System.out.println("Apellidos: " + alumno.getApellidos());
					System.out.println("Dni: " + alumno.getDni());
					System.out.println("Edad: " + alumno.getEdad());
				}else {
					System.out.println("No hay alumno");
				}
			}
		}else {
			System.out.println("Debes crear primero la Universidad, selecciona la opción 1");
		}
		
	}
	private void buscarAlumno (Alumno[] alumnos) {
		String dniBusqueda = Utilidades.pideDatoString("Introduce el dni a buscar");
		
		if (alumnos!=null) {
			boolean alumnoEncontrado = false;
			for (Alumno alumno  : alumnos  ) {
				if(alumno!=null) {
					if (alumno.getDni().equals(dniBusqueda)) {
						alumnoEncontrado = true;
						System.out.println("Alumno encontrado:");
						System.out.println("\tNombre: " + alumno.getNombre());
						System.out.println("\tApellidos: " + alumno.getApellidos());
						System.out.println("\tDni: " + alumno.getDni());
						System.out.println("\tEdad: " + alumno.getEdad());
						break;
					}
				}
			}
			
			if (!alumnoEncontrado) {
				System.out.println("No hay ningun alumno con el dni "+ dniBusqueda);
			}
		}else {
			System.out.println("Debes crear primero la Universidad, selecciona la opción 1");
		}
	}
	
	private void borrarAlumo(Alumno [] alumnos) {
		String dniBorrar = Utilidades.pideDatoString("Introduce el dni a borra");
		
		if (alumnos!=null) {
			boolean alumnoEncontrado = false;
			int i=0;
			for (Alumno alumno  : alumnos  ) {
				if(alumno!=null) {
					alumnoEncontrado = true;
					if (alumno.getDni().equals(dniBorrar)) {
						alumnos[i]=null;
						break;
					}
				}
				i++;
			}
			
			if (!alumnoEncontrado) {
				System.out.println("No hay ningun alumno con el dni "+ dniBorrar);
			}
		}else {
			System.out.println("Debes crear primero la Universidad, selecciona la opción 1");
		}
	}
	
}







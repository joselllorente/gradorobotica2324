package edu.ucjc.ejercicios.poo;

public class Universidad {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Alumno1","Apellido1",20,"Rob�tica",1);
		String [] asignaturasAlumno1 = {"Asignatura1","Asignatura2","Asignatura3"};
		alumno1.setAsignaturas(asignaturasAlumno1);
		alumno1.setEmail("alumno1@correo.es");
		alumno1.mostrarInfoAlumno();
		
		String [] asignaturasAlumno2 = new String[3];
		asignaturasAlumno2[0]="Asignatura1";
		asignaturasAlumno2[1]="Asignatura2";
		Alumno alumno2 =new Alumno("Alumno2","Apellido2",21,"Rob�tica",3,asignaturasAlumno2);
		alumno2.mostrarInfoAlumno();
		alumno1.setEmail("alumno2@correo.es");
		
		Alumno alumno3 = new Alumno("Alumno3","Apellido3",19,"Rob�tica",2,"alumno3@correo.es");
		alumno3.mostrarInfoAlumno();
		
		Alumno alumno4 = new Alumno("Alumno4","Apellido4",18,"Rob�tica",1, 
				new String[] {"Asignatura4","Asignatura5","Asignatura6"});
		alumno4.mostrarInfoAlumno();
		alumno4.setEmail("alumno4@correo.es");
		
		
		Alumno [] alumnos = {alumno1,alumno2,alumno3,alumno4};
		
		for (Alumno alumno : alumnos) {
			//validarEmail(alumno.getEmail());
//			System.out.println(alumno.getNombre());
//			System.out.println(alumno.getApellidos());
//			System.out.println();
			//Llamada al m�todo en la clase alumno
			//alumno.validarEmail();
			Universidad uni = new Universidad();
			//uni.metodo2();//Se puede pero no es obligatorio ya que el m�todo existe aunque no est� el objeto
			uni.validarEmail(alumno.getEmail());
			
			Utilidades.validarEmail(alumno.getEmail());
		}
		Utilidades.metodo1();
		
	}
	
	public static void metodo2() {

	}
	
	void validarEmail (String email) {
		boolean isValid = true;
		String mensaje = "";
		email= email.trim();
		System.out.println(email);
		metodo2();
		
		if (email.contains(" ")) {
			isValid = false;
			mensaje += " tiene un espacio en blanco";
		}
		
		if (!email.contains("@") || email.indexOf("@")!= email.lastIndexOf("@") ){
			isValid = false;
			mensaje += " debe tener una @";
		}else {
			int poscionArroba = email.indexOf("@");
			String dominio = email.substring(poscionArroba+1);
			if(!dominio.contains(".")) {
				isValid = false;
				mensaje += " debe contener un punto despu�s de la @";
			}else {
				if (dominio.indexOf(".")<2) {
					isValid = false;
					mensaje += " La distancia entre la @ y el primer punto despu�s de �sta tiene que ser superior a 2";
				}
				String subdominio = dominio.substring( dominio.lastIndexOf(".")+1 );
				if (subdominio.length()<2 || subdominio.length()>5) {
					isValid = false;
					mensaje += "El n�mero de caracteres despu�s del �ltimo punto debe estar entre 2 y 5";
				
				}
				
			}
		}
		
		
		
		if (!isValid) {
			System.out.println("El email "+ email + " no es valido " + mensaje);
		}
	}

}

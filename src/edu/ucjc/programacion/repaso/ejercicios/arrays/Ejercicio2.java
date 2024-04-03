package edu.ucjc.programacion.repaso.ejercicios.arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		String [] emails = {
				"emai l1@email.es  ",
				" email2email.es ",
				"3emai@l3@email.es    ",
				"4email4@emailes",
				"5asdasd@a.sdsad.es",
				"6asdasd@asdsad.e",
				"asdasd@asdsad.es"};

		//for(int i=0;i<emails.length;i++) {
		// System.out.println(emails[i]);
		for(String email : emails) {
			boolean isValid = true;
			String mensaje = "";
			email= email.trim();
			System.out.println(email);
			
			
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

}

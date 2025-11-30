//Programa de logín predefinido simple de 3 usaurios
package practica;

import java.util.Scanner;

public class Practica4 {
	static Scanner scr = new Scanner(System.in);
	
	public static String readuser() {	//Funcion para poder mostrar un menu String
		System.out.println("Usuario:");
		return scr.next().toLowerCase();
	}
	
	public static int readpassword() {	//Funcion para poder mostrar un menu int
		System.out.println("Contraseña:");
		return scr.nextInt();
	}
	
	
	public static boolean Bduser(String User, int password ) {
		//Creamos Usuarios pre-definidos y las declaramos Strings
		String user1 = "gabi";
		String user2 = "juan";
		String user3 = "sofia";
		//Creamos contraseñas pr-edefinidas y las declaramos int
		int contra1 = 1234;
		int contra2 = 4321;
		int contra3 = 2134;
		
		boolean comprobacion = false;
		
		//Comprobacion de que el usaurio y contraseña son correctos con operados de disyuncion "||" y "&&" conjuncion.
		if (user1.equals(User) && contra1 == password|| user2.equals(User) && contra2 == password || user3.equals(User) && contra3 == password) {
			comprobacion = true;
			return comprobacion;
		} else {
			
			return  comprobacion = false;
		}
		
		
	}
	
	public static void bucle (boolean comprobacion, String User, int password) {
		int contador = 3;
	    if (comprobacion) {
	    	System.out.println("Bienvenido/a " + User);
	    }
	    if (!comprobacion) {
	        for (int i = contador; i > 0; i--) {  // Corrección: i > 0 en lugar de i == 0
	            System.out.println("Intentos de inicio de sesion: " + i);
	            
	            // ✅ LLAMANDO LAS FUNCIONES DENTRO DEL BUCLE
	             User = readuser();        // Llamas la función de usuario
	             password = readpassword();      // Llamas la función de contraseña
	            
	            // Verificamos si ahora las credenciales son correctas
	            boolean nuevaComprobacion = Bduser(User,password);
	            
	            if (nuevaComprobacion) {
	                System.out.println("Bienvenido/a " + User + " Has podido acceder a la session al intento numero:" + (contador - i + 1));
	                break;  // Salimos del bucle si es correcto
	            } else {
	                System.out.println("❌ Credenciales incorrectas");
	                if (i > 1) {
	                    System.out.println("Te quedan " + (i - 1) + " intentos");
	                }
	            }
	        }
	    }
	}
	
	
	
	public static void main(String[] args) {
		
		//menus de Usuario y contraseña
		String User = readuser();
		int password = readpassword();
		
		boolean comprobacion = Bduser(User, password);
		
		bucle(comprobacion, User, password);
		
	}

}

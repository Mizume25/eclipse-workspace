/*
 * Programa que ejecuta un juego de adivinar numeros
 * 
 * */
package practica;

import java.util.Scanner;

public class PR17 {
	
	//Cearemos un scanner como a varaible de una classe apra que todo el programa peuda leerlo
	static Scanner scr = new Scanner(System.in);
	
	//Crearemos un Scanner principal que pida un numero del 0-100
	public static int read () {
		System.out.println("Introduce un numero (0 - 100):");
		return scr.nextInt();
	}
	
	//Crearemos una funcion de lectura String para ejecutar en caso de que el usaurio se canse
	public static String pregunta () {
		System.out.println("¿Quieres seguir participando?");
		return scr.next().toLowerCase(); // Añadiremos toLowerCase(); para evitar altercados con las minusculas o mayusculas
	}
	
	
	
	public static int comprobacion (int numero1, int numero2) {
		if (numero1 == numero2) {
			System.out.println("Felicidades has adivinado el numero random:" + numero1);
			return numero1;
		} else  {
			System.out.println("No has encertado el numero random");
			return numero2;
		}
	}
	
	//Crearemos funciones para realizar 3 secciones de pistas
	// Estas se dividiran en: 0 -40 | 41 - 70 | 71 - 100
	public static void pistas (int numero1, int numero2, String respuesta) {
	boolean acierto = false;

	
	// Estas se dividiran en: 0 -40 | 41 - 70 | 71 - 100
	
	while (respuesta.equals("si") && !acierto) {	
		//Dentro de cada sector de pistas hay 2 condicioens: o bien el numero random es mayor o menor
		if (numero1 > numero2) {
			System.out.println("El numero random es mayor");
		} else {
			System.out.println("El numero random es menor");
				
		}
		
		if (numero1 <= 40) {
			System.out.println("El numero se encuentra entre 0 - 40"); //SECCION 1 - 0-40
		} else if (numero1 >= 41 && numero1 <= 70) {
			System.out.println("El numero se encuentra entre 41 - 70"); //SECCION 2 - 41 - 70
		} else if (numero1 >= 71 && numero1 <= 100) {
			System.out.println("El numero se encuentra entre 71 - 100"); // SECCION 3 - 71 - 100
	}
	
	//Secuecnia usuario responde > se equivoca > le hace print de animos > le pregunta si quiera continuar
	numero2 = read();
	System.err.println("¡Prueba otra vez!");
	
	if (numero1 == numero2) {
		System.out.println("Felicidades has adivinado el numero random:" + numero1);
		acierto = true;
	}
	
	respuesta = pregunta();
	
	}
	
	if (respuesta.equals("no") &&  !acierto) {
		System.out.println("Animo! estuvistes muy cerca de acertar al numero:" + numero1);
		
	}
	}
	
	public static void main(String[] args) {
	//Datos de entrada
	// Generar numero random int de 1-100 con Math.random
	int numero1 = (int)(Math.random()*100); // Variable int para que trunque numeros decimales a numeros enteros y otro para que cumpla la seceuncia de que su numero random debe estar entre 0-100
	// Menu donde pregunta el numero + titulo
	System.out.println("--ADIVINA EL NUMERO--");
	int numero2 = read();
	// 1º Comprobacion y print del resultado de existo o erroneao
	int comprobacion = comprobacion(numero1,numero2);
	//2º pregunta para asegurar si quiere continuar el programa
	String respuesta = pregunta ();
	//3º Comprobacion simultanea de los datos y repeticion del esquema
	pistas (numero1, comprobacion, respuesta);
	
	
	
		

	}

}

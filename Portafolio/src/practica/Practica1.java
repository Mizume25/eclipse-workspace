/*
 * Programa que pide nombre usuario y devuelve una linea de codigo
 * */
package practica;

import java.util.Scanner;

public class Practica1 {
	static Scanner scr = new Scanner(System.in); // Scanner statico para que todo el programa peuda leer datos de teclado
	
	
	public static String read (){
		System.out.print("Introduce tu nombre:");
		return scr.next();
	}
	
	public static void menu (String nombre) {
		
		System.out.print("Hola " + nombre + " como estas?");
	}
	
	
	
	public static void main(String[] args) {
		
		//Operacion y calculo 
		String nombre = read();
		//Mostrar Resultado 
		menu(nombre);
	}

}

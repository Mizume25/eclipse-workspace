package EstructurasControl;

import java.util.Scanner;

public class Practica5 {
	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		// Estructuras iteratives
	int numero1 = read("Numero 1: ");
	int numero2 = read("Numero 2: ");
		// Mostrar las iteraciones
	resultado(numero1,numero2);
	}
	//1º Funcion que pueda leer datos
	public static int read(String titulo) {
	System.out.print(titulo);
	return scr.nextInt();
	}
	
	//2º Funcioon que muestra la iteracion
	public static void resultado (int numero1,int numero2) {
	//Mientras numero 2 sea mayor que numero 1 es 
	if (numero2 > numero1) {
		for (;numero2 >= numero1; numero2--) {
			System.out.println(numero2);
			}
		
	 } else {
	 System.out.println("Numero 2 debe ser mayor que numero 1");
	 }
	}
}

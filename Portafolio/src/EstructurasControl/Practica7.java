package EstructurasControl;

import java.util.Scanner;

public class Practica7 {
	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		// Donats dos nombres enters positius a i b, calcula el resultat de realitzar la seva multiplicació a partir de sumes.
		int a = read("A: ");
		int b = read("B: "); //Modificamos menu teclado
		
		//Calcular y mostrar resultado e iteracion
		System.out.print(a +" * "+ b +" = ");
		for (int i = 0; i < b; i++) { // EL index pasa a ser el a para poder imprimir un numero fijo un numero de iteraciones determinada
		System.out.print(" + " + a);
		}
// corregir menu de salida
	}
	
	public static int read(String titulo) {
		System.out.print(titulo);
		return scr.nextInt();
	}

}

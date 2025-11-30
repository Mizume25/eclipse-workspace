package RepasoGeneral;

import java.util.Scanner;

public class RepasoGeneral5 {
	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		// Escribe un programa que solicite una cantidad en kilogramos y haga la conversión a libras.
			//Declaramos a varaibles
		double euros = cambios("Euros: ");
		double dollar = cambios("¿Cuanto vale 1€ a $? ");
		System.out.printf("La cantidad %.2f € a dollares americanos equivale a: %.2f $",euros,(euros * dollar));
		
	}
	//1º Funcion que lee los menus de calculos
	public static double cambios (String titulo) {
	System.out.print(titulo);
	return scr.nextDouble();
	}
	
	
}


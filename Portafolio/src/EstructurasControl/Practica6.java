package EstructurasControl;

import java.util.Scanner;

public class Practica6 {
	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		// Saber cuantos parejos hay en una iteracion de una relacion n2>n1
	
		//Declaramos variables
		int n1 = read("N1: ");
		int n2 = read("N2: ");
		
		//Funciones que cuentant las iteraciones
		parejos(n1,n2); // Argumentos n1 y n2 para que funcione
	}
	public static int read(String titulo) {
		System.out.print(titulo);
		return scr.nextInt();
		}
	
	public static void parejos(int n1,int n2) {
	int contador = 0; // Contador de parejos
	int temp = n1; // La iteracion n1 la usamos como index asique necesitamos una varaible temporal que muestre su valor inicial
	if (n2>n1) {
		for (; n1<=n2; n1++) {
			if (n1%2==0) {
				contador++; // El contador se habilita por cada secuencia donde sea true n1 % 2 == 0
			}		
		}
		
	 } else {
		 System.out.println("n2 debe ser mayor que n1");
	 }
	
	System.out.println("Numero de nombres parejos entre " + "[" + temp + " - " + n2 +"]: " + contador );
	}
}

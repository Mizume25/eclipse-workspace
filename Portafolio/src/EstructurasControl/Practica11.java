package EstructurasControl;

import java.util.Scanner;

public class Practica11 {
static Scanner scr = new Scanner (System.in); // Variable de la classe

	public static void main(String[] args) {
	int i = 0; // Index de el array
	int[] numeros = new int[10]; // Creamos un array con un esapcio de 10 numeros
	boolean sistema = true; // Creamos la estructura booleana
	int numeroUsuario = 0;
	int suma = 0;
	
	
	
	String enunciado = " ";
	// Mostrar Menu
	numeroUsuario = read(i); // Activa el lector de teclado
	
	numeros = arraynumero(numeroUsuario,i,sistema);
	
	calculo (i,suma,numeros);
	}
	
	// Funcion que lee el teclado
	public static int read (int i) {
		System.out.println("Numero " + (i+1) + ": ");
		return scr.nextInt(); //Imprimira un meno teclado
		
		}
	
	//Funcion para el bucle
	public static int [] arraynumero (int numeroUsuario, int i, boolean sistema) {
		int[] numeros = new int[10];
		do {
			
			numeroUsuario = read(i);//Imprimira numero de usuario
			numeros[i] += numeroUsuario; // Se guarda la variable sea o no impar
			if (numeroUsuario % 2 != 0) {
				i++;	
			} else {
			sistema = false;
			}
		
		}while(i <= 9 && sistema);
		
		return numeros; //Devolvemos el array con todos los numeros guardados
	}
	
	
	public static void calculo(int i, int suma, int numeros[]) {
if (i <= 5 ) {
			
			for (int j = i - 1; j >= 0; j--) {
			System.out.print(numeros[j] + " ");
			suma += numeros[j];
			
			} 
		} else{
			int diff = i-5; // Hago la diferencia entre un numero de iteraciones  menos 5
			for (int j = i - 1; j >= diff; j--) { // j se posiciona en la ultima posicion de el array y j recorrera un bucle hasta diff decremetnandose
				System.out.print(numeros[j] + " ");
				suma += numeros[j];
				
				}
		}
		System.out.println("\nResultado final de la suma de los ultimos numeros " + suma);
	}
	

}

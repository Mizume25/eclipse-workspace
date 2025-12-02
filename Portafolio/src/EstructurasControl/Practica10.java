package EstructurasControl;

import java.util.Scanner;

public class Practica10 {
	static Scanner scr = new Scanner (System.in); // Lectura de teclado para todas la funciones
	
	public static int read (int i) {
	System.out.println("Numero " + (i+1) + ": ");
	return scr.nextInt(); //Imprimira un meno teclado
	
	}
	public static void main(String[] args) {	
	//Funcion bucle  que imprima la secuencia completa o parcial
	int numeroUsuario = 0;
			//Secuencia For
	boolean sistema = true;
	int i = 0; //Imprimimeos un index
	int suma = 0;
	String enunciado = " ";
	int[] numeros = new int[10];
	
	// Iteracion de I == 0,1,2,3,4,5,6,7,8,9 (10 iteraciones)
	//Array == 0,1,2,3,4,5,6,7,8,9 (Espacio de Array)
	do {
		
			numeroUsuario = read(i);//Imprimira numero de usuario
			numeros[i] += numeroUsuario; // Se guarda la variable sea o no impar
			if (numeroUsuario % 2 != 0) {
				i++;	
			} else {
			sistema = false;
			}
		
		}while(i <= 9 && sistema);
		//Imprimimos la accion realizada por el usuario ya sea por imprimir 10 numeros o haber introducido pares
		
		
		enunciado = sistema? "Has terminado la secuencia!":"Has introducido un numero par";
		System.out.println(enunciado);
		
		System.out.print("\nNumero introducidos: ");
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
	
	
	
	
	
	/*Haz un programa que solicite 10 números al usuario e imprima la suma de los últimos
	 *  5 valores introducidos. Además, incluye la condición de que si el usuario introduce 
	 *  un número par mientras está introduciendo los 10 números no pida más números al usuario,
	 *   dé un mensaje al usuario del que se ha introducido un número par y muestre la suma tal y
	 *    como estaba en ese momento. En caso de que todavía no se hubieran empezado a sumar números 
	 *    la suma sería 0.
	 *  (Ejercicio propuesto original núm. 2)*/
}

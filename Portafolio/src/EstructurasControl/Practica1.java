package EstructurasControl;

import java.util.Scanner;

public class Practica1 {
	//Declaramos Scanner como variable de una casa 
	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		/*Escribe un programa que solicite dos números y una letra. El programa presenta un menú para realizar una operación con los dos números:
			Si la letra es "s" : les suma
			si es "r": les resta, 
			si la letra es "m": multiplica
			si la letra es "d": los divide.*/
	
	double numero1 = read("Numero 1: ");
	double numero2 = read("Numero 2: ");
	char letra = readchar();
	resultado(numero1,numero2,letra);
	
	

	}
	
	//1º Funcion que pide un numero
	public static double read(String titulo) {
	System.out.println(titulo);
	return scr.nextDouble();
	}
	//2º Menu de operaciones que devuelve un char
	public static char readchar () {
	System.out.println("==Menu de Operacions Aritmetiques==");
	System.out.println("s = sumar");
	System.out.println("r = restar");
	System.out.println("m = multiplicar");
	System.out.println("d = division");
	System.out.print("Selecciona una operacion: ");
	return scr.next().charAt(0);
	}
	//3º Estructuras de control de las operacioens aritmeticas
	public static void resultado (double numero1, double numero2, char letra) {
	//Podemos modificar las estructuras para que ordenen restas y no den negativos y tmabien divisiones
			
	double operacion = 0;
	if (letra == 's' || letra == 'S'){
	operacion = numero1 + numero2;
	} else if (letra == 'r' || letra == 'R') {
	// 			CONDICIONAL		TRUE		|		FALSE
	operacion = numero1 > numero2? numero1 - numero2:numero2 - numero1;
	} else if (letra == 'm' || letra == 'M') {
	operacion = numero1 * numero2;	
	} else if (letra == 'd' || letra == 'D') {
//			CONDICIONAL		TRUE		|		FALSE
		operacion = numero1 > numero2? numero1 / numero2:numero2 / numero1; // Se divide siempre Grande / pequeño
	}
	
	if (numero1 > numero2) {
	System.out.println("El resultado " + numero1 + " y " + numero2 + " es igual a " + operacion);
		} else {
			System.out.println("El resultado " + numero2 + " y " + numero1 + " es igual a " + operacion);
		}
	}

}

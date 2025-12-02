package EstructurasControl;

import java.util.Scanner;

public class Practica4 {
static Scanner scr = new Scanner (System.in); // Teclado statico
	public static void main(String[] args) {
		// Escribe un programa que solicite 3 números y los muestre ordenados de mayor a menor.
		int primerNumero = read("numero 1");
		int segundoNumero = read("numero 2");
		int tercerNumero = read("numero 3");
		
		//Determinar Numero Grande,medio y pequeño
		int numeroGrande = numeroGrande(primerNumero,segundoNumero,tercerNumero);
		int numeroPequeño = numeroPequeño(primerNumero,segundoNumero,tercerNumero);
		int numeroMedio = numeroMedio(numeroGrande,numeroPequeño,primerNumero,segundoNumero,tercerNumero);
	
		//Menu de salida
		System.out.println("\n==Ordernar Numero==");
		System.out.println("Numero más grande: " + numeroGrande);
		System.out.println("Numero más medio: " + numeroMedio);
		System.out.println("Numero más medio: " + numeroPequeño);
		//Mostrar Numeros
	}
	//1º Funcion que lee los numeros
	public static int read (String titulo) {
	System.out.print("Introduce el " + titulo + ": ");
	return scr.nextInt();
	}
	
	//2º Funcion para encontrar numero grande
	public static int numeroGrande(int primerNumero,int segundoNumero, int tercerNumero) {
	int numeroGrande = 0;
	
	if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
		numeroGrande = primerNumero;
	} else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
		numeroGrande = segundoNumero;
	  } else {
		numeroGrande = tercerNumero;
	  }
		return numeroGrande;
	}
	//3º Funcion para encontrar numero grande
	public static int numeroPequeño (int primerNumero,int segundoNumero, int tercerNumero) {
		int numeroPequeño = 0;
		if (primerNumero < segundoNumero && primerNumero < tercerNumero) {
			numeroPequeño = primerNumero;
		} else if (segundoNumero < primerNumero && segundoNumero < tercerNumero) {
			numeroPequeño = segundoNumero;
		  } else {
			  numeroPequeño = tercerNumero;
		  }
			return numeroPequeño;
	}
	
	public static int numeroMedio(int numeroGrande,int numeroPequeño,int primerNumero,int segundoNumero,int tercerNumero) {
		int numeroMedio = 0;
	if (numeroGrande > primerNumero && primerNumero > numeroPequeño) {
		numeroMedio = primerNumero;
	} else if (numeroGrande > segundoNumero && segundoNumero > numeroPequeño) {
		numeroMedio = segundoNumero;
	} else {
		numeroMedio = tercerNumero;
	}
	
	return numeroMedio;
	}
	
}

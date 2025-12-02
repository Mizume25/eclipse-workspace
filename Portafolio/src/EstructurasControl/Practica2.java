package EstructurasControl;

import java.util.Scanner;

public class Practica2 {
static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// Modificació del programa anterior.//El programa demana el dia de la setmana (dilluns, dimarts, dimecres ...)//i mostra el número de dia: 
		
	String dia = MenuPrincipal(); // Menu Principal
	int numdia = resultado(dia); // Recibe el dato y lo guarda en una variable
	System.out.println("El dia " + dia + " es el numero " + numdia); // Imprimimos resultado
	
		

	}
	//1º Funcion que pide que escribas día de la semana
	public static String MenuPrincipal() {
	System.out.print("Introduce el dia: ");
	return scr.next().toLowerCase();
	}
	
	//1º Funcion que pide que escribas día de la semana
		public static int resultado(String dia) {
		int numdia = 0;
		switch (dia) {
		case "lunes":
			numdia = 1;
			break;
		case "martes":
			numdia = 2;
			break;
		case "miercoles":
			numdia = 3;
			break;
		case "jueves":
			numdia = 4;
			break;
		case "viernes":
			numdia = 5;
			break;
		case "sabado":
			numdia = 6;
			break;
		case "domingo":
			numdia = 7;
			break;
		default:
		System.out.println("Opcion de día no valido");
			break;
		}
		
		return numdia;  //Retornamos la variable
		}
	
}

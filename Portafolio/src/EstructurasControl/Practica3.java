package EstructurasControl;

import java.util.Scanner;

public class Practica3 {
static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// Modificació del programa anterior.//El programa demana el dia de la setmana (dilluns, dimarts, dimecres ...)//i mostra el número de dia: 
		
	int dia = MenuPrincipal(); // Menu Principal
	String nombreDia= resultado(dia); // Recibe el dato y lo guarda en una variable
	System.out.println("El dia " + dia + " es el " + nombreDia); // Imprimimos resultado
	
		

	}
	//1º Funcion que pide que escribas día de la semana
	public static int MenuPrincipal() {
	System.out.print("Introduce el numero del dia: ");
	return scr.nextInt();
	}
	
	//1º Funcion que pide que escribas día de la semana
		public static String resultado(int dia) {
		String nombreDia = "";
		switch (dia) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miercoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sabado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
		System.out.println("Opcion de día no valido");
			break;
		}
		
		return nombreDia;  //Retornamos la variable
		}
	
}

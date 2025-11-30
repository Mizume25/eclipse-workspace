/*
 * Menu de comida estructurado en un switch
 * */

package practica;

import java.util.Scanner;

public class Practica2 {
	static Scanner scr = new Scanner(System.in);
	
	public static int menu(){
		System.out.print("--Menu del día--");
		System.out.println("1. Pizza");
		System.out.println("2. Hamburguesa");
		System.out.println("3. Pasta");
		System.out.println("4. Ensalada");
		System.out.print("Introduce el numero del meno (1-4):");
		return scr.nextInt();
	}
	
	
	public static void operacio (int numeroMenu){
		switch (numeroMenu) {
		case 1:
			System.out.println("Pizza");
			break;
			
		case 2:
			System.out.println("Hamburguesa");
			break;
			
		case 3:
			System.out.println("Pasta");
			break;
			
		case 4:
			System.out.println("Ensalada");
			break;
		default:
			System.out.println("Numero de Menu Incorrecto");
			break;
		}
	}
	public static void main(String[] args) {
		int numeroMenu = menu();
		
		operacio(numeroMenu);
	}

}

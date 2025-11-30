package practica;

import java.util.Scanner;

public class Practica3 {
	static Scanner scr = new Scanner(System.in);
	
	public static String read() {
		System.out.println("--Tienda de Bob--");
		System.out.println("GENERAL | SOCIO | VIP | PREMIUM");
		System.out.print("Introduce el tipo de cliente que eres:");
		return scr.next().toLowerCase();
		
	}
	
	public static double compra () {
		System.out.print("Introduce el precio de tu compra:");
		return scr.nextDouble();
	}
	
	public static double operacio(String comanda, double precio) {
	double descuento = 0;
	switch (comanda) {
	case "general":
		descuento = precio*0.0;
		break;
	case "socio":
		descuento = precio*0.10;
		break;

	case "vip":
		descuento = precio*0.20;
		break;
		
	case "premium":
		descuento = precio*0.30;
		break;
		
	default:
		System.out.println("El tipo de ciente no es valido");
		break;
	}
	
	return descuento;
	
	}
	public static void resultado(String comanda, double precio, double descuento) {
		
		System.out.println("--Recibo de tu consulta--");
		System.out.println("Tipo de cliente: " + comanda);
		System.out.printf("Descuento aplicado: %.2f€%n", descuento);
		System.out.printf("Precio Producto: %.2f€%n", precio);
		System.out.printf("Precio Final: %.2f€%n", (precio - descuento));
		
	}
	public static void main(String[] args) {
		//Lectura de datos
		String comanda = read();
		
		double precio = compra();
		//Operacion
		double descuento = operacio(comanda, precio);
		//Resultados
		resultado(comanda, precio, descuento);
	}

}

package practica;

import java.util.Scanner;

public class EmpresaReciclaje {
	static Scanner scr = new Scanner(System.in);
	
	//1º Menu Principal
	public static String menu (int contador) {
		System.out.println("==EMPRESA RECICLAJE==");
		System.out.println("\nVidreo | Papel | Plastico");
		System.out.println("[fin] para cerrar el programa");
		System.out.print("Introduce el " + contador + "º material:" );
			return scr.next().toLowerCase();
	}
	//2º alternativa para ejecutar/parar o repetir menu
	public static boolean sistema(String menu) {
	// Si el usuario pone fin en primer lugar
		if(menu.equals("fin")) {
			return false; //Devuelve un false
		} else {			
	 	return true; // Hasta que finalmente escriba vidreo o plastico o papel no sale y no activa el while del main
	}
		
}
	//3º Funcion mostrar menu peso
	public static double peso(String menu) {
	System.out.print("Peso del " + menu + ":");
	return scr.nextDouble();
	}
	
	//4º Funcion que crea un arrray y guarda los datos
	public static double [] datosMateriales(double[] datosMateriales, String menu, double peso,int PosicionPapel, int PosicionPlastico,int PosicionVidreo) {
	    //Por cada iteracion nueva se guardara en una array especifica	
		if(menu.equals("papel")) {
	    		datosMateriales[PosicionPapel] += peso;
	    		
	    		} else if (menu.equals("plastico")) {
	    		datosMateriales[PosicionPlastico]  += peso;
	    		
			    	} else if (menu.equals("vidreo")) {
			    datosMateriales[PosicionVidreo]  += peso;
			    
			    }
	    	return datosMateriales;
	}
	
	public static void MenuResltados(double[] datosMateriales, int PosicionPapel,int PosicionPlastico, int PosicionVidreo) {
		System.out.println();
		System.out.printf("Papel: %.2f kg\n",  datosMateriales[PosicionPapel]);
		System.out.printf("Plastico: %.2f kg\n",  datosMateriales[PosicionPlastico]);
		System.out.printf("Vidreo: %.2f kg\n",  datosMateriales[PosicionVidreo]);
		System.out.println();	
		double capital = datosMateriales[PosicionPapel]*1.23 + datosMateriales[PosicionPlastico]*0.45 + datosMateriales[PosicionVidreo]*0.98;
		
		System.out.printf("Dinero acumulado: %.2f €\n" , capital);
		
		double porcentajeTotal = datosMateriales[PosicionPapel] + datosMateriales[PosicionPlastico] + datosMateriales[PosicionVidreo];
		System.out.println();
		System.out.printf("Porcentaje sobre el total de papel: %.2f%%\n",   (datosMateriales[PosicionPapel]/porcentajeTotal)*100);
		System.out.printf("Porcentaje sobre el total de plastico: %.2f%%\n",  (datosMateriales[PosicionPlastico]/porcentajeTotal)*100);
		System.out.printf("Porcentaje sobre el total de vidreo: %.2f %%\n", (datosMateriales[PosicionVidreo]/porcentajeTotal)*100);
	}
	
	public static void main(String[] args) {
	//Declaracion de Variables
	int contador = 1;
	double peso = 0;
	int PosicionPapel = 0;
	int PosicionPlastico = 1;
	int PosicionVidreo = 2;
	
	//1º Menu que se guarda a un String
	String menu = menu(contador);
	//Declarem array amb una capacitat gran
		double[] datosMateriales = new double[3];
		//En caso de error imprimira un while-comprobacion
			boolean sistema = sistema(menu);
		//Programa en ejecuccion	
			while (sistema) { 
				
				sistema = menu.equals("fin")? false:true;
				if (!sistema) continue;
				// En cualquier otro caso siempre y cuando no esciba el materail correcto no saldra de las secuencia 	
				if (!menu.equals("vidreo") && !menu.equals("papel") && !menu.equals("plastico")) {
					System.out.println("\nNo se permite este tipo de material");
					System.out.println("\nVuelva a introduce el " + contador + "º material O [fin] para cerrar el programa:");
						menu = scr.next().toLowerCase();
						continue;
						//Si usuario en la comprobacion segunda  hace un fin tambien saldra directamente al resumen del programa	
					} 
				
				sistema = menu.equals("fin")? false:true;	
					
				
				peso = peso(menu); //Menu que pide peso
				System.out.printf("%s: %.1fg\n", menu, peso * 1000); //Hacemos una conversion a gramos
						contador++; //El contador aumenta la iteracion
							//Funcion ejecuta un array
							datosMateriales = datosMateriales(datosMateriales ,menu,peso, PosicionPapel,PosicionPlastico,PosicionVidreo);	
						
						menu = menu(contador);
						sistema = sistema(menu);
				}
				MenuResltados(datosMateriales,PosicionPapel,PosicionPlastico,PosicionVidreo);
				
				
			
		}

}

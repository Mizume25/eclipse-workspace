package practica;

import java.util.Scanner;

public class EmpresaReciclajeV2 {
	// Creamos un Scanner
	static Scanner scr = new Scanner(System.in);

	// 1º Funcion de Menu Principal
	public static String menuPrincipal(int numeromaterial) {
		System.out.println("==EMPRESA RECICLAJE==");
		System.out.println("\nVidreo | Papel | Plastico");
		System.out.println("[fin] para cerrar el programa");
		System.out.print("Introduce el " + numeromaterial + "º material:");
		return scr.next().toLowerCase();
	}

	// 2º Funcion boolean para ejecutar el programa
	public static boolean sistema(String menuPrincipal) {
		return !menuPrincipal.equals("fin");
	}

	// 3º Funcion mostrar menu peso
	public static double pesoMaterial(String menu) {
		System.out.print("\nPeso del " + menu + ":");
		return scr.nextDouble();
	}

	public static void main(String[] args) {
		// Declaración de varaibles
		// Sumero de iteraciones con el menuPrincipal (material 1,2,3...)
		int numeroMaterial = 1;
		String menuPrincipal = "";
		boolean sistema = false;
		double pesoMaterial = 0;
		// Declracion simultanea de varaibleas
		double sumaPlastico, sumaPapel, sumaVidreo;
		sumaPlastico = sumaPapel = sumaVidreo = 0;

		menuPrincipal = menuPrincipal(numeroMaterial);

		while (sistema(menuPrincipal)) {
			sistema = menuPrincipal.equals("fin") ? false : true; // Una primera comprobacion, ya que si el bucle se vuelve a ejecutar y el usaurio se equivoca y pone fin finalice el programa
			
			if (!sistema)  continue;
			// En cualquier otro caso siempre y cuando no esciba el materail correcto no saldra de las secuencia
			
			if (!menuPrincipal.equals("vidreo") && !menuPrincipal.equals("papel") && !menuPrincipal.equals("plastico")) {
				
				System.out.println("\nNo se permite este tipo de material como: " +"\""+menuPrincipal+"\"");
				System.out.println("\n");
				menuPrincipal = menuPrincipal(numeroMaterial);
				continue;
				// Si usuario en la comprobacion segunda hace un fin tambien saldra directamente al resumen del programa
			}
			
			pesoMaterial = pesoMaterial(menuPrincipal); // Menu que pide peso
			System.out.printf("%s: %.0fg\n", menuPrincipal, pesoMaterial * 1000); // Hacemos una conversion a gramosç
			System.out.println("\n");
			numeroMaterial++; // Incrementamos el numero del menu

			//Guardara diferentes pesos en una varaible determianda
			if (menuPrincipal.equals("papel")) {
				
				if(pesoMaterial <= 10) { // en caso de que supere un peso le pondra un mensaje y continuara la secuecnia
				sumaPapel += pesoMaterial;	
				
				}else{
				System.out.printf("La cantidad %.2f kg para %s es demasiado grande", pesoMaterial, menuPrincipal);
				--numeroMaterial; // en caso de que supere una cantidad decrementamos contador para que reinicie la iteracion
				System.out.println("\n");
				}
			
			} else if (menuPrincipal.equals("plastico")) {
				
				if(pesoMaterial <= 50) {
					sumaPlastico += pesoMaterial;	
					
				} else {
					System.out.printf("\nLa cantidad %.2f kg para %s es demasiado grande\n", pesoMaterial, menuPrincipal);
					--numeroMaterial;
					System.out.println("\n");
					}

			} else if (menuPrincipal.equals("vidreo")) {
				
				if(pesoMaterial <= 50) {
					sumaVidreo += pesoMaterial;	
					
				} else {
					System.out.printf("\nLa cantidad %.2f kg para %s es demasiado grande\n", pesoMaterial, menuPrincipal);
					--numeroMaterial;
					System.out.println("\n");
					}

			}
			//Volvera a ejcutar menuprincipal
			menuPrincipal = menuPrincipal(numeroMaterial);
		}
		//Menu de resultados con printf
			//En caso de que el resultado sea 0 en los 3 osea fin en la primera iteracion
			//1º En caso de que el contador sea 1 quiere decir que el usuario o intoducido Strings validos o pesos invalidos y ha regresado ala iteracion 1 
			//2º En caso de que el usuario introduzca valores 0 en las 3 iteraciones tambien saldra el mensaje
		if(numeroMaterial == 1 || sumaPapel == 0 && sumaPlastico == 0 && sumaVidreo == 0) {
		System.out.println("\nNo se ha introducio ningun material");
		} else {
		
		System.out.println(); //Bloque de codigo printf con una condicional corta que imprima o bien el mensaje o bien el valor
		System.out.printf("Papel: %s\n", sumaPapel == 0 ? "Papel no introducido" : sumaPapel + " kg");
		System.out.printf("Plastico: %s\n", sumaPlastico == 0 ? "Plastico no introducido" : sumaPlastico + " kg");
		System.out.printf("Vidreo: %s\n", sumaVidreo == 0 ? "Vidreo no introducido" : sumaVidreo + " kg");		
		System.out.println();
		double capital = sumaPapel * 1.23 + sumaPlastico * 0.45 + sumaVidreo * 0.98; //Operaciones de conversion
		System.out.printf("Dinero acumulado: %.4f €\n", capital);

		double porcentajeTotal = sumaPapel + sumaPlastico + sumaVidreo; //Operaciones de porcentaje
		System.out.println();
		System.out.printf("Porcentaje sobre el total de papel: %.3f%%\n", (sumaPapel / porcentajeTotal) * 100);
		System.out.printf("Porcentaje sobre el total de plastico: %.3f%%\n", (sumaPlastico / porcentajeTotal) * 100);
		System.out.printf("Porcentaje sobre el total de vidreo: %.3f %%\n", (sumaVidreo / porcentajeTotal) * 100);
		}
	}
}

package Prueba5_Ej2;
import java.util.*;
public class EntradasApp {

	private static Scanner sc = new Scanner(System.in);
	
	private static int enPrincipal = 1000;
	private static int enPlatea= 200;
	private static int enVip = 25;
	
	public static void main(String[] args) {
		int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                	mostrarEntradasLibres();
                	break;
                case 2:                 
                	venderEntradas();               
                	break;            
                case 3: 
                	System.out.println("Saliendo del programa...");
                	break;
                default:
                	System.out.println("Opción no válida, inténtelo de nuevo.");
            }
        } while (opcion != 3);   
	}
	
	private static void mostrarMenu() {
		System.out.println(" ");
		System.out.println("---Menu Para la venta de entradas---");
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		System.out.print("Elija una opción: ");

	}
    	
	private static void mostrarEntradasLibres() {
		System.out.println(" ");
		System.out.println("---Entradas libres para cada zona---");
		System.out.println("1-Principal: " + enPrincipal);
		System.out.println("2-Platea: " + enPlatea);
		System.out.println("3-VIP: " +  enVip);
	}
	
	private static void venderEntradas() {
		System.out.println(" ");
		System.out.println("---Vender entrada---");
		System.out.println("Selecciones la zona que desea: (1-Principal 2-Platea 3-VIP 4-Salir)");
		System.out.print("Elija una opción: ");
		int opcion = sc.nextInt();
        sc.nextLine();
		
		
		switch (opcion) {
		  case 1:
          	enPrin();
          	break;
          case 2:                 
          	enPla();               
          	break; 
          case 3:                 
        	enVIP();               
            break; 
          case 4: 
          	System.out.println("Saliendo del programa...");
          	break;
          default:
          	System.out.println("Opción no válida, inténtelo de nuevo.");
      
		}
		
	}

	private static void enPrin() {
		System.out.println(" ");
		System.out.print("Selccione la cantidad de entradas: ");
		int n = sc.nextInt();
        sc.nextLine();
        
        if (enPrincipal<n){
        	System.out.print("No quedan suficientes entradas.");
        }else {
        	System.out.print("Entradas vendidas.");
        	enPrincipal -= n;
        }
        
        		
	}
	
	private static void enPla() {
		System.out.println(" ");
		System.out.print("Selccione la cantidad de entradas: ");
		int n = sc.nextInt();
        sc.nextLine();
        
        if (enPlatea<n){
        	System.out.print("No quedan suficientes entradas.");
        }else {
        	System.out.print("Entradas vendidas.");
        	 enPlatea -= n;
        }
       		
	}
	
	private static void enVIP() {
		System.out.println(" ");
		System.out.print("Selccione la cantidad de entradas: ");
		int n = sc.nextInt();
        sc.nextLine();
        
        if (enVip<n){
        	System.out.print("No quedan suficientes entradas.");
        }else {
        	System.out.print("Entradas vendidas.");
        	enVip -= n;	
        }       	
	}
	
}
	

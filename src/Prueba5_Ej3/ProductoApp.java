package Prueba5_Ej3;
import java.util.*;
public class ProductoApp {

	//Scanner
	private static Scanner sc = new Scanner(System.in);
	
	private static int maxPro = 1000;
	private static Producto [] producto = new Producto[maxPro];

	private static int contPro = 0;
	
	//Main
	public static void main(String[] args) {
		int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                	introducirDatosNuevoInventario();
                	break;
                case 2:                 
                	nuevoProducto();               
                	break;    
                case 3:                 
                	busacarProductoModificar();               
                	break;  
                case 4:                 
                	eliminarProducto();               
                	break;  
                case 5:                 
                	mostrarValorTotal();               
                	break;  
                case 6:                 
                	informeRoturaStock();               
                	break;  
                case 7: 
                	System.out.println("Saliendo del programa...");
                	break;
                default:
                	System.out.println("Opción no válida, inténtelo de nuevo.");
            }
        } while (opcion != 7);   
	}
	
	//Metodos
	private static void mostrarMenu() {
		System.out.println(" ");
		System.out.println("---Menu Gestión ---");
		System.out.println("1. Introducir datos nuevo inventario.");
		System.out.println("2. Nuevo producto.");
		System.out.println("3. Buscar producto y modificar información.");
		System.out.println("4. Eliminar producto.");
		System.out.println("5. Mostrar valor total del inventario.");
		System.out.println("6. Informe rotura de stock.");
		System.out.println("7. Salir");
		System.out.print("Elija una opción: ");
	}
			  
	private static void introducirDatosNuevoInventario() {
    	int opcion;
    	
        do {
        	System.out.print("Introduzca todos los productos que disponga en su inventari. (Pulsa 1 para añadir) o (Pulsa 2 para salir): ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                	nuevoProducto();
                	break; 
                case 2: 
                	System.out.println("Saliendo...");
                	break;
                default:
                	System.out.println("Opción no válida, inténtelo de nuevo.");
            }
        } while (opcion != 2);         
	}
	
	private static void nuevoProducto() {   	
    	if (contPro >= maxPro) {
    	    System.out.println("No se pueden añadir más productos. Capacidad máxima alcanzada.");
    	    return;
    	}   	
        
    	System.out.println(" ");
        System.out.print("Introduzca nombre para el nuevo producto: ");
        String nombre = sc.nextLine();
        
        System.out.print("Introduzca el stock del nuevo producto: ");
        int stoc = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Introduzca la precio de compra para el nuevo producto: ");
        double precio = sc.nextDouble(); 
        sc.nextLine();       
    	
        producto[contPro] = new Producto(nombre, stoc, precio);   	
    	 
    	System.out.println("Nuevo producto añadido: "+ producto[contPro]);   	
    	contPro++;
    }
	
    private static void busacarProductoModificar() { 
    	System.out.print("Introduzca el nombre del producto a modificar: ");    
		String nom = sc.nextLine();	
        
        boolean encontrado = false;
        
        for (int i = 0; i < contPro; i++) {
        	if (producto[i].getNombre().equals(nom)) {                   	
            	
				System.out.println("Introduzca un nuevo nombre al producto: ");
				producto[i].setNombre(sc.nextLine());
				
				System.out.println("Introduce un nuevo stock para ese producto: ");
				producto[i].setStock(sc.nextInt());	
				
				System.out.println("Introduce nuevo precio: ");
				producto[i].setPrecio(sc.nextDouble());								

				encontrado = true;
            }
        }
        
        if (encontrado) {
            System.out.println("El producto fue modificado correctamente.");
        } else {
            System.out.println("No se encontró ningún producto con ese nombre.");
        }	
    }
	
	private static void eliminarProducto() {         
		System.out.println("Introduzca  el nombre del producto a eliminar: ");    
		String nombre = sc.nextLine();	        
	        
        boolean encontrado = false;
        
        for (int i = 0; i < contPro; i++) {
        	if (producto[i].getNombre().equals(nombre)) {  
            		                
                for (int j = i; j < contPro - 1; j++) {
                	producto[j] = producto[j + 1];
                }
                
                producto[contPro - 1] = null;
                contPro--;
                encontrado = true;            
            }
        }
        
        if (encontrado) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún producto con ese nombre.");
        }
    }
	
	private static void mostrarValorTotal() {  
		double valorTotalInvent = 0;
		System.out.println("Total de productos en el inventario: " + contPro);  
		System.out.println("Valor Total inventario: " + valorTotalInvent); 
		
		for (int i = 0; i < contPro; i++) {

			/*
			producto[i].getStock += valorTotalInvent;
			producto[i].getPrecio += valorTotalInvent;	
			*/		 
            	          
		}           	
	}
	
	private static void informeRoturaStock() {
		System.out.println(" ");
        System.out.println("Productos con stock por debajo de 50.");
        
		for (int i = 0; i < contPro; i++) {
			if (producto[i].getStock() <50) {  
				System.out.println("Nombre: " + producto[i].getNombre() + ", stock: "+ producto[i].getStock()+", uds.");
			}
		}
		System.out.println("---------------");
	}	
}

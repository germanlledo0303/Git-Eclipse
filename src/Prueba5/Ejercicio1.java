package Prueba5;
import java.util.*;

import Prueba5_Ej3.Producto;
public class Ejercicio1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		Frase [] palabras = new Frase[5];
		
		System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine(); 
        
        String fra =frase.trim();
        
        int contPalabras = 1;
        
        for (int i = 0; i < frase.length(); i++) {
        	
        	if (Character.isWhitespace(fra.charAt(i)))  {       		
        		contPalabras++;
        	}
        }
        
        
        
        
        System.out.print("La frase contiene " + contPalabras + " palabras.");
        sc.close();
        
	}

}

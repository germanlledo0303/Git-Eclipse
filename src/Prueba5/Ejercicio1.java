package Prueba5;
import java.util.*;

import Prueba5_Ej3.Producto;
public class Ejercicio1 {

	public static void main(String[] args) {	    
        var sc = new Scanner(System.in);

        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine(); 

        // Eliminar espacios iniciales y finales
        String fra = frase.trim();

        // Inicializar contadores y variables
        int contPalabras = 0;
        String palabraMasLarga = "";
        String palabraMasCorta = "";
        StringBuilder palabraActual = new StringBuilder();

        for (int i = 0; i <= fra.length(); i++) {
            char c = i < fra.length() ? fra.charAt(i) : ' ';

            if (c == ' ' || c == '\t' || i == fra.length()) {
                if (palabraActual.length() > 0) {
                    String palabra = palabraActual.toString();
                    contPalabras++;

                    if (palabraMasLarga.isEmpty() || palabra.length() > palabraMasLarga.length()) {
                        palabraMasLarga = palabra;
                    }
                    if (palabraMasCorta.isEmpty() || palabra.length() < palabraMasCorta.length()) {
                        palabraMasCorta = palabra;
                    }

                    palabraActual.setLength(0);
                }
            } else {
                palabraActual.append(c);
            }
        }

        // Mostrar resultados
        System.out.println("La frase contiene " + contPalabras + " palabras.");
        System.out.println("Palabra más larga: " + palabraMasLarga + " (" + palabraMasLarga.length() + " caracteres)");
        System.out.println("Palabra más corta: " + palabraMasCorta + " (" + palabraMasCorta.length() + " caracteres)");

        sc.close();
    }
}

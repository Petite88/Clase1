package main;

import java.io.Console;

/**
 * Dos asteriscos es para documentar el programa
*/

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
//		InputConsola.leerLinea("Escribe tu nombre");
		String nombre = InputConsola.leerLinea("Escribe tu nombre");
		System.out.println("-hola, "+ nombre);
	}

}

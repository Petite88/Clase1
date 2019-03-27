package main;
/**
 * 
 * @author petite Es una clase para recibir datos de consola. 
 *
 */
import java.util.Scanner;
public class InputConsola {
	public static String leerLinea(String mensaje){
		System.out.println(mensaje);
		String nombre = (new Scanner(System.in)).nextLine();
		return nombre;
	}
	int leerNumero(String mensaje){
		int numero = 0;
		return numero;
	}
}

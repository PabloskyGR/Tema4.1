package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variables donde guardaremos los valores que introduzca el usuario para 'n' y
		// 'm'
		int n, m;

		// Variable donde guardaremos el array que queramos construir
		int tabla[];

		// Le pedimos al usuario los valores de 'n' y de 'm'
		System.out.println("Dime los valores de 'n' y de 'm':");
		n = sc.nextInt();
		m = sc.nextInt();

		// Creamos el array de tipo entero on la longitud del valor que se haya
		// introducido de 'n'
		tabla = new int[n];

		// Usando la clase Arrays.fill, añadimos el valor de 'm' en todas las posiciones
		// la tabla
		Arrays.fill(tabla, m);

		// Mostramos un mensaje antes de enseñar la tabla
		System.out.println("La tabla contiene los siguientes valores:");
		System.out.print("[ ");

		// Usamos un bucle for para recorrer la tabla e ir mostrando todos los valores
		// de las posiciones
		for (int i = 0; i < tabla.length; i++) {
			// Usamos un condicional para que la última posición no imprima una coma al
			// final
			if (i == tabla.length - 1) {
				System.out.print(tabla[i] + " ");
				// En caso de que no sea el último imprime los valores con coma
			} else {
				System.out.print(tabla[i] + ", ");
			}
		}

		System.out.print("]");

		// Cerramos el sacnner
		sc.close();

	}

}

package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// variable donde guardaremos los valores del array
		int tabla[] = new int[55];

		// Variable auxiliar que nos ayudara para ir implementando valores a las
		// posiciones de los array
		int aux = 1;

		// Bucle for para ir rellenando de valores las posiciones de la tabla
		for (int i = 0; i < 10; i++) {
			/*
			 * Usamos el Arrays.fill para ir dandole valores a las posiciones Formula para
			 * saber el inicio de donde rellenar: i * (i + 1) / 2 Fórmula para saber el
			 * final de donde rellenar: (i + 1) * (1 + 2) / 2
			 */
			Arrays.fill(tabla, i * (i + 1) / 2, (i + 1) * (i + 2) / 2, aux);
			aux++;
		}

		// Mensaje antes de mostrar la tabla
		System.out.println("La tabla quedaría de la siguiente manera:");
		
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

	}

}

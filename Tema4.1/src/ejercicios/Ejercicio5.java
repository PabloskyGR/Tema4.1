package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos una tabla de tipo Integer y con una longitud de 8
		Integer tabla[] = new Integer[8];

		// Variable donde guardaremos las puntuaciones de cada jugador
		int puntuacion;

		// Usamos un bucle for para ir recorriendo la tabla y vamos dandole los valores
		// que se vaya escribiendo a las posiciones de la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dime la puntuación del juagdor(Habitualmente 1000-2800):");
			puntuacion = sc.nextInt();

			tabla[i] = puntuacion;
		}

		// Usamos un arrays.sort para ordenar la tabla y un Collections.reverseOrder
		// para ordenador de mayor a menor
		Arrays.sort(tabla, Collections.reverseOrder());

		// Usamos un arrys.toString para mostrar el contenido de la tabla ordenado
		System.out.println(Arrays.toString(tabla));

		// Cerramos el scanner
		sc.close();
	}

}

package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos una tabla de tipo int y de longitud 30
		int tabla[] = new int[30];

		// Usamos un bucle for para recorrer la tabla e ir dandole valores random a las
		// posiciones
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) Math.random() * 10;
		}

		// Usamos un arrays.sort para ordenadar la tabla
		Arrays.sort(tabla);

		// Y usamos un arrays.toString para mostrar la tabla con sus valores ordenados
		System.out.println(Arrays.toString(tabla));
	}

}

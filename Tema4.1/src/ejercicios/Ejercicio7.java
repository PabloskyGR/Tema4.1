package ejercicios;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos un arrays de tipo int con una lontigud de 6
		int apuesta[] = new int[6];

		// Creamos otro array del tipo int y con una longitud de 6
		int ganadora[] = new int[6];

		// Variable que usaremos para contar el número de aciertos que hay
		int aux = 0;

		// Con un bucle for vamos generando números aleatorios para las posiciones de
		// los 2 arrays
		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i] = (int) (Math.random() * 50);
			ganadora[i] = (int) (Math.random() * 50);
		}

		// Mostramos la combinación de la apuesta realiazada
		System.out.println("Apuesta realizada:     " + Arrays.toString(apuesta));

		// Ordenamos el array con los valores ganadores
		Arrays.sort(ganadora);

		// Mostramos a combinación de la apuesta ganadora
		System.out.println("Combinación ganadora:  " + Arrays.toString(ganadora));

		// Con un for-each vamos mirando los números del array apuesta y los buscamos en
		// el array con los números ganadores
		for (int numeroApuesta : apuesta) {
			if (Arrays.binarySearch(ganadora, numeroApuesta) >= 0) {
				aux++;
			}
		}

		// Mostramos un mensaje con los aciertos que ha tenido el usuario
		System.out.println("Has acertado un total de: " + aux + " números");

	}

}

package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos una tabla de tipo int y de una longitud de 1000
		int tabla[] = new int[1000];

		// Variable donde guardaremos el número que quiera buscar el usuario
		int num;

		// variable auxiliar qu nos servirá como contador para ver cuantas veces aparece
		// el número que haya introducido el usuario
		int aux = 0;

		// Variable que usaremos para comprobar que el número introducido se encuentra
		// al menos una vez en la tabla
		int existe;

		// Usamos un bucle for para ir recorriendo la tabla e ir añadiendole números
		// aleatorios a las posiciones de la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}

		// Le pedimos al usuario que número quiere buscar que se comprenda entre el 0 y
		// el 99
		System.out.println("Dime que número quieres buscar(0-99):");
		num = sc.nextInt();

		// Ordenamos la tabla para poder hacer la búsqueda a continuación
		Arrays.sort(tabla);

		// Comprobamos si el número existe en la tabla usando el Arrays.binarySearch
		existe = Arrays.binarySearch(tabla, num);

		// En caso de que el número exista, mostramos un mensaje de que existe y a
		// continuación con un bucle for recorremos la tabla buscando cuantas veces
		// aparece ese número en la tabla, y enseñamos un mensaje de cuantas veces
		// aparece en la tabla
		if (existe >= 0) {
			System.out.println("Existe el número " + num + " en la tabla");
			for (int i = 0; i < tabla.length; i++) {
				if (tabla[i] == num) {
					aux++;
				}
			}
			System.out.println("El número " + num + " aparece: " + aux + " veces en la tabla");
			// En caso de que no exista el número introducido en la tabla mostramos un
			// mensaje de no existe en la tabla ese número
		} else {
			System.out.println("No existe el número " + num + " en la tabla");
		}

		// Cerramos el scanner
		sc.close();

	}

}

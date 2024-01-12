package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variables donde iremos guardando los valores que vaya introdudciendo el
		// usuario
		int valores1, valores2;

		// Creamos una tabla de tipo entero y de longitud de 10
		int tabla1[] = new int[10];

		// Creamos otra tabla de tipo entero y de longitud de 10
		int tabla2[] = new int[10];

		// Le pedimos al usuario que nos introduzca 10 números para la primera tabla
		System.out.println("Dime 10 número para una tabla:");

		// Usamos un bucle for para pedir 10 números y que se vayan añadiendo al array
		for (int i = 0; i < tabla1.length; i++) {
			valores1 = sc.nextInt();
			tabla1[i] = valores1;
		}

		// Pedimos otros 10 números al usuario
		System.out.println("Dime otros 10 números para otra tabla:");

		// usamos otro bucle for para pedir otros 10 números e ir añadiendolo al array
		for (int i = 0; i < tabla2.length; i++) {
			valores2 = sc.nextInt();
			tabla2[i] = valores2;
		}

		// Comprobamos que las tablas sean iguales
		if (Arrays.equals(tabla1, tabla2)) {
			// En caso de que sean iguales mostramos un mensaje diciendo que son iguales
			System.out.println("Las dos tablas son iguales");
		} else {
			// En caso de que nos ean iguales mostramos un mensaje diciendo que no son
			// iguales
			System.out.println("Las tablas no son iguales");
		}

		// Cerramos el scanner
		sc.close();

	}

}

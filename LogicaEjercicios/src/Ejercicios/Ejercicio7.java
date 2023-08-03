package Ejercicios;


import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * - PEDIR NUMEROS POR TECLADO HASTA QUE SE INTRODUZCA UN 0 - ESCRIBE CUANTOS
		 * NUMEROS SE HAN INTRODUIDO SIN CONTAR EL 0 - ESCRIBE LA SUMA DE TODOS LOS
		 * NUMEROS INTRODUCIDOS - ESCRIBE LA MEDIA
		 */

		int n = -1;
		int contador = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		while (n != 0) {
			System.out.print("Introduce un numero (0 para terminar): ");
			n = sc.nextInt();
			if (n != 0) {
				contador++;
				suma = suma + n;
			}
		}
		sc.close();

		System.out.println("Se han introducido " + contador + " numeros.");
		System.out.println("La suma de todos los numeros es: " + suma);
		System.out.println("La media es: " + (double) suma / contador);
	}

}

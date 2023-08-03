package Ejercicios;


public class Ejercicio18 {

	public static void main(String[] args) {
		/*
		 * Crear un array con 10 n�meros aleatorios entre 1 y 50 (usa while) y
		 * escr�belos.
		 */

		int[] numeros = new int[10];

		int i = 0;
		while (i < numeros.length) {
			numeros[i] = (int) Math.ceil(Math.random() * 50);
			i++;
		}

		i = 0;

		while (i < numeros.length) {
			System.out.println(numeros[i]);
			i++;
		}

	}

}

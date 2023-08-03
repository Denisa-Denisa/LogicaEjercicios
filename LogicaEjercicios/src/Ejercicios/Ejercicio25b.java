package Ejercicios;


public class Ejercicio25b {

	public static void main(String[] args) {
		/*
		 * Crea un array con 10 n�meros aleatorios. Despu�s calcula la suma de todos
		 * ellos y escribe el resultado.
		 */

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			numeros[i] = (int) Math.ceil(Math.random() * 1000);
		}

		int suma = 0;
		for (int i = 0; i < 10; i++) {
			suma += numeros[i];
		}
		System.out.println("Suma total: " + suma);

	}

}

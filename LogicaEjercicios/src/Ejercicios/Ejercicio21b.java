package Ejercicios;


public class Ejercicio21b {

	public static void main(String[] args) {
		/*
		 * Genera 1000 n�meros aleatorios entre 1 y 100. Guarda en un array los n�meros
		 * divisibles por 7 u 11.
		 */

		byte[] numeros = new byte[1000];
		int j = 0;

		for (int i = 1; i <= 1000; i++) {
			byte n = (byte) Math.ceil(Math.random() * 100);
			if (n % 7 == 0 || n % 11 == 0) {
				numeros[j] = n;
				j++;
			}
		}

		for (int i = 0; numeros[i] != 0; i++) {
			System.out.println(numeros[i]);
		}
	}

}

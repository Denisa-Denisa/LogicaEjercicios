package Ejercicios;


public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * Crea un array con las frutas: manzana, mandarina, pera, pl�tano y fresa.
		 * Escribe una fruta aleatoriamente.
		 */

		String[] frutas = { "manzana", "mandarina", "pera", "platano", "fresa" };

		int pos = (int) (Math.random() * frutas.length);

		System.out.println(frutas[pos]);
	}

}

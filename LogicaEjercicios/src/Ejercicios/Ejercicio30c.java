package Ejercicios;


public class Ejercicio30c {

	public static void main(String[] args) {
		/*
		 * Crea un programa que: a. Genere dos vectores con 10 n�meros aleatorios entre
		 * 1 y 100. b. Escribe los dos vectores. c. Escribe la intersecci�n d. Escribe
		 * la uni�n (No es necesario tener en cuenta los repetidos)
		 */
		int[] numeros1 = new int[10];
		int[] numeros2 = new int[10];

		for (int i = 0; i < 10; i++) {
			numeros1[i] = (int) Math.ceil(Math.random() * 100);
			numeros2[i] = (int) Math.ceil(Math.random() * 100);
		}

		System.out.print("Array 1: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%3d ", numeros1[i]);
		}
		System.out.println();
		System.out.print("Array 2: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%3d ", numeros2[i]);
		}
		System.out.println();

		System.out.print("Interseccion: ");
		for (int i = 0; i < numeros1.length; i++) {
			for (int j = 0; j < numeros2.length; j++) {
				if (numeros1[i] == numeros2[j]) {
					System.out.print(numeros1[i] + " ");
				}
			}
		}
		System.out.println();

		System.out.print("Union: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%3d ", numeros1[i]);
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%3d ", numeros2[i]);
		}
	}

}

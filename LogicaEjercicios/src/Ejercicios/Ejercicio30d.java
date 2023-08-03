package Ejercicios;


public class Ejercicio30d {

	public static void main(String[] args) {
		/*
		 * Crea un programa que: a. Genere dos vectores con 10 n�meros aleatorios entre
		 * 1 y 100. b. Escribe los dos vectores. c. Escribe la intersecci�n d. Escribe
		 * la uni�n (No es necesario tener en cuenta los repetidos)
		 */
		int[] numeros1 = crearArray(10);
		int[] numeros2 = crearArray(10);

		// Escribir el array 1
		System.out.print("Array 1: ");
		escribirArray(numeros1);
		System.out.println();

		System.out.print("Array 2: ");
		escribirArray(numeros2);
		System.out.println();

		System.out.print("Interseccion: ");
		escribirInterseccion(numeros1, numeros2);
		System.out.println();

		System.out.print("Union: ");
		escribirUnion(numeros1, numeros2);
	}

	public static void escribirUnion(int[] array1, int[] array2) {
		escribirArray(array1);
		escribirArray(array2);
	}

	public static void escribirInterseccion(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
				}
			}
		}
	}

	public static void escribirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d ", array[i]);
		}
	}

	public static int[] crearArray(int cantidad) {
		int[] array = new int[cantidad];

		for (int i = 0; i < array.length; i++) {
			array[i] = aleatorioEntre1y100();
		}

		return array;
	}

	public static int aleatorioEntre1y100() {
		return (int) Math.ceil(Math.random() * 100);
	}
}

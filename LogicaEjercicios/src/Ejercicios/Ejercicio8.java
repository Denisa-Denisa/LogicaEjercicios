package Ejercicios;


import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * 1. PIDE 10 NUMEROS ENTEROS Y GUARDALOS EN UN ARRAY 2. ESCRIBE CUANTOS NUMEROS
		 * PARES HAY EN EL ARRAY 3. ESCRIBE EL NUMERO MAS ALTO DEL ARRAY 4. ESCRIBE EL
		 * NUMERO MAS BAJO DEL ARRAY 5. ESCRIBE UNA FUNCION QUE IMPRIMA LOS NUMEROS DEL
		 * ARRAY 6. ESCRIBE UNA FUNCION QUE DEVULEVA EL ARRAY ORDENADO DE MENOR A MAYOR
		 */

		final int MAXIMO_NUMEROS = 10;
		int[] misNumeros, arrayOrdenado;

		misNumeros = pedirEnteros(MAXIMO_NUMEROS);

		System.out.println("Has introducido " + contarPares(misNumeros) + " numeros pares.");

		System.out.println("El numero mayor es: " + mayor(misNumeros));
		System.out.println("El numero menor es: " + menor(misNumeros));

		System.out.println("Listado de los numeros del array:");
		imprimir(misNumeros);

		System.out.println("Listado del array ordenado:");
		arrayOrdenado = obtenerOrdenado(misNumeros);
		imprimir(arrayOrdenado);
		System.out.println("Listado original:");
		imprimir(misNumeros);

	}

	public static int[] pedirEnteros(int cantidad) {
		int[] numeros = new int[cantidad];

		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i < numeros.length) {
			System.out.print("Introduce el numero " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
			i++;
		}
		sc.close();
		return numeros;
	}

	public static int contarPares(int[] array) {
		int pares = 0;
		int pos = 0;

		while (pos < array.length) {
			if (esPar(array[pos])) {
				pares++;
			}
			pos++;
		}

		return pares;
	}

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	public static int mayor(int[] array) {
		int grande = array[0];
		int pos = 1;

		while (pos < array.length) {

			if (array[pos] > grande) {
				grande = array[pos];
			}
			pos++;
		}

		return grande;
	}

	public static int menor(int[] array) {
		int peque = array[0];
		int pos = 1;

		while (pos < array.length) {
			if (array[pos] < peque) {
				peque = array[pos];
			}
			pos++;
		}

		return peque;
	}

	public static void imprimir(int[] numeros) {
		int pos = 0;
		while (pos < numeros.length) {
			System.out.print(numeros[pos] + " ");
			pos++;
		}
		System.out.println("");
	}

	public static void ordenar(int[] numeros) {
		int pos = 0, i, aux;

		while (pos < numeros.length) {
			i = pos + 1;
			while (i < numeros.length) {
				if (numeros[i] < numeros[pos]) {
					aux = numeros[pos];
					numeros[pos] = numeros[i];
					numeros[i] = aux;
				}
				i++;
			}
			pos++;
		}
	}

	public static int[] obtenerOrdenado(int[] numeros) {
		int[] ordenado;

		ordenado = clonar(numeros);
		ordenar(ordenado);
		return ordenado;
	}

	public static int[] clonar(int[] numeros) {
		int pos = 0;
		int[] clone = new int[numeros.length];
		while (pos < numeros.length) {
			clone[pos] = numeros[pos];
			pos++;
		}

		return clone;
	}
}

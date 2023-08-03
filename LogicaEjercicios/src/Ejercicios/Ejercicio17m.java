package Ejercicios;


public class Ejercicio17m {

	public static void main(String[] args) {
		/*
		 * CREA UN ARRAY BIDIMENSIONAL DE 25 X 25 LLENALO DE NUMEROS ALEATORIOS ENTRE 1
		 * Y 125 ESCRIBELO POR PANTALLA CREAR UNA FUNCION QUE CUENTE CUANTOS NUMEROS HAY
		 * ENTRE UN RANGO
		 */

		final int SIZE = 25;
		final int VALOR_MINIMO = 1;
		final int VALOR_MAXIMO = 125;

		int[][] numeros = new int[SIZE][SIZE];

		for (int fila = 0; fila < numeros.length; fila++) {
			for (int col = 0; col < numeros[fila].length; col++) {
				numeros[fila][col] = dameNumeroAleatorio(VALOR_MINIMO, VALOR_MAXIMO);
			}

		}

		for (int fila = 0; fila < numeros.length; fila++) {
			escribirArray(numeros[fila]);
			System.out.println();
		}

		int cantidad = contarNumeros(numeros, 25, 35);
		System.out.println("Total de numeros entre 25 y 35: " + cantidad);
	}

	public static int contarNumeros(int[][] datos, int rangoInferior, int rangoSuperior) {
		int cantidadNumeros = 0;

		for (int fila = 0; fila < datos.length; fila++) {
			for (int col = 0; col < datos[fila].length; col++) {
				if (datos[fila][col] >= rangoInferior && datos[fila][col] <= rangoSuperior) {
					cantidadNumeros++;
				}
			}
		}

		return cantidadNumeros;
	}

	public static int dameNumeroAleatorio(int minimo, int maximo) {
		return (int) Math.floor(Math.random() * (maximo - minimo + 1)) + minimo;
	}

	public static void escribirArray(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%3d ", vector[i]);
		}
	}

}

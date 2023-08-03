package Ejercicios;


import java.util.Scanner;

public class Ejercicio18m {

	public static void main(String[] args) {
		/*
		 * CREAR UNA FUNCION QUE DEVUELVA UN ARRAY BIDIMENSIONAL CON LA DIAGONAL
		 * SUPERIOR RELLENA DE UNOS Y LA INFERIOR RELLENA DE CEROS. A LA FUNCION HABRA
		 * QUE PASARLE EL TAMAÑO DEL ARRAY QUE TENDRA EL MISMO NUMERO DE FILAS QUE DE
		 * COLUMNAS. PEDIR AL USUARIO EL TAMAÑO POR TECLADO. EL TAMAÑO QUE NO EXCEDA DE
		 * 75 Y QUE NO SEA 0 NI NEGATIVO. DIBUJAR EL ARRAY.
		 * 
		 * 
		 * Ej. tama�o 5 tama�o 3 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1 0 1 1 1 0 0 1 0 0 1 1 0 0
		 * 0 1 0 0 0 0
		 * 
		 * Crea una nueva funci�n que devuelva una array bidimensional pero rellenando
		 * de unos formando una piramide. Ej. tama�o 5 tama�o 7 0 0 1 0 0 0 0 0 1 0 0 0
		 * 0 1 1 1 0 0 0 1 1 1 0 0 1 1 1 1 1 0 1 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
		 * 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
		 */

		Scanner pepe = new Scanner(System.in);
		int size;
		do {
			System.out.print("Escribe el tamaño del array (1-75):");
			size = pepe.nextInt();
			if (size > 0 && size <= 75) {
				int[][] miArray = crearArray(size);
				escribirArray(miArray);
				System.out.println();
				int[][] miArray2 = crearArrayPiramide(size);
				escribirArray(miArray2);
			} else {
				if (size != 0) {
					System.out.println(
							"El numero introducido no esta en el rango permitido. Solo se permiten numeros entre 1 y 75.");
				}
			}
		} while (size != 0);
		System.out.println("Ejecucion del programa finalizado.");
	}

	public static int[][] crearArray(int longitud) {
		int[][] array = new int[longitud][longitud];
		int maxUnos = longitud;
		for (int fila = 0; fila < array.length; fila++) {
			for (int col = 0; col < maxUnos; col++) {
				array[fila][col] = 1;
			}
			maxUnos--;
		}

		return array;
	}

	public static int[][] crearArrayPiramide(int longitud) {
		int[][] array = new int[longitud][longitud];
		int maxUnos = 1;
		int pos = longitud / 2;
		System.out.println("Pos = " + pos);
		for (int fila = 0; fila < array.length; fila++) {
			for (int col = pos; col < pos + maxUnos; col++) {
				array[fila][col] = 1;
			}
			maxUnos = maxUnos + 2;
			pos--;
			if (pos < 0)
				pos = 0;
			if (maxUnos > array[fila].length)
				maxUnos = array[fila].length;
		}

		return array;
	}

	public static void escribirArray(int[][] array) {

		for (int fila = 0; fila < array.length; fila++) {
			for (int col = 0; col < array[fila].length; col++) {
				System.out.printf("%d ", array[fila][col]);
			}
			System.out.println();
		}
	}

}
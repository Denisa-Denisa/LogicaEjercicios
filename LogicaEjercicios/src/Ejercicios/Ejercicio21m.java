package Ejercicios;


import java.util.Scanner;

public class Ejercicio21m {

	public static void main(String[] args) {
		/*
		 * CREAR UNA MATRIZ BIDIMENSIONAL 10X10 COLOCAR DE FORMA ALEATORIA Y EN
		 * POSICIONES DISTINTAS 10 UNOS. ESCRIBIR EL ARRAY
		 * 
		 * EL USUARIO DEBE ADIVINAR DONDE ESTAN LOS UNOS DEBE ESCRIBIR LA FILA Y LA
		 * COLUMNA DONDE CREE QUE HAY UN UNO EL PROGRAMA DEBE INDICARLE SI HA ACERTADO Y
		 * VOLVER A ESCRIBIR LA TABLA SE DEBE INDICAR CUANTOS UNOS LE QUEDAN POR
		 * DESCUBIR Y EL NUMERO DE INTENTOS QUE LLEVA. NO SE CUENTA COMO INTENTO SI
		 * REPITE UNA POSICION.
		 * 
		 * !!El usuario no debe poder ver los unos cuando escribimos la tabla!!
		 */

		final int SIZE = 10;
		final int CANTIDAD_UNOS = 3;
		int[][] tabla;
		int fila, col, intentos = 0, unosQuedan = CANTIDAD_UNOS;

		tabla = crearTabla(SIZE, CANTIDAD_UNOS);
		escribirTabla(tabla);

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Fila: ");
			fila = pedirEnteroEnRango(sc, 1, SIZE);
			System.out.print("Columna: ");
			col = pedirEnteroEnRango(sc, 1, SIZE);
			if (tabla[fila - 1][col - 1] == 1) {
				tabla[fila - 1][col - 1] = 9;
				intentos++;
				unosQuedan--;
				System.out.println("Has descubierto un 1!!!");
			} else if (tabla[fila - 1][col - 1] == 0) {
				tabla[fila - 1][col - 1] = 3;
				intentos++;
			}

			escribirTablaUsuario(tabla);
			System.out.printf("Quedan %d unos por descubrir.\n", unosQuedan);
			System.out.printf("Llevas %d intentos\n", intentos);
		} while (unosQuedan > 0);
		System.out.println("Enhorabuenas encontrastes todos los unos!!!");
		System.out.println("Intentos: " + intentos);
	}

	public static int[][] crearTabla(int longitud, int unos) {
		int[][] array = new int[longitud][longitud];

		do {
			int fila = dameNumeroAleatorio(0, array.length - 1);
			int col = dameNumeroAleatorio(0, array[fila].length - 1);
			if (array[fila][col] != 1) {
				array[fila][col] = 1;
				unos--;
			}
		} while (unos > 0);

		return array;
	}

	public static void escribirTabla(int[][] array) {
		for (int fila = 0; fila < array.length; fila++) {
			for (int col = 0; col < array[fila].length; col++) {
				System.out.printf("%d ", array[fila][col]);
			}
			System.out.println();
		}
	}

	public static void escribirTablaUsuario(int[][] array) {
		for (int fila = 0; fila < array.length; fila++) {
			for (int col = 0; col < array[fila].length; col++) {
				if (array[fila][col] == 9) {
					System.out.print("1 ");
				}
				if (array[fila][col] == 3) {
					System.out.print("X ");
				}
				if (array[fila][col] == 0 || array[fila][col] == 1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static int dameNumeroAleatorio(int minimo, int maximo) {
		return (int) Math.floor(Math.random() * (maximo - minimo + 1)) + minimo;
	}

	public static int pedirEnteroEnRango(Scanner sc, int minimo, int maximo) {
		int n;
		do {
			n = pedirEntero(sc);
		} while (n < minimo || n > maximo);
		return n;
	}

	public static int pedirEntero(Scanner sc) {
		int n;
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Valor no valido.");
		}
		n = Integer.parseInt(sc.nextLine());
		return n;
	}
}

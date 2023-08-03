package Ejercicios;


import java.util.Scanner;

public class Ejercicio11m {

	public static void main(String[] args) {
		/*
		 * PEDIR UN NUMERO POR TECLADO ENTRE 1 Y 10 ESCRIBIR LA TABLA DE MULTIPLICAR DE
		 * ESE NUMERO
		 */

		int num = pedirNumero();
		escribirTablaMultiplicar(num);

	}

	public static int pedirNumero() {
		int num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Escribe un numero entre 1 y 10: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Numero no valido.");
			}

			num = Integer.parseInt(sc.nextLine());
		} while (num < 1 || num > 10);

		sc.close();

		return num;
	}

	public static void escribirTablaMultiplicar(int num) {
		System.out.println("");
		System.out.println("Tabla de multiplicar del " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + i * num);
		}
	}
}

package Ejercicios;


import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * PIDE UN NUMERO ENTERO ENTRE 1 Y 1000. ESCRIBE "FRIZZ" SI ES DIISIBLE POR 3.
		 * ESCRIBE "BUZZ" SI ES DIVISIBLE POR 5. ESCRIBE "FRIZZBUZZ" SI ES DIVISIBLE POR
		 * 3 Y POR 5. ESCRIBE EL "NUMERO" SI NO ES DIVISIBLE NI POR 3 NI POR 5 .
		 */

		int numero = pedirNumero();
		if (esNumeroValido(numero)) {
			fizzBuzz(numero);
		} else {
			System.out.println("Numero incorrecto. Debe estar entre 1 y 100.");
		}

	}

	public static boolean esNumeroValido(int numero) {
		return numero >= 1 && numero <= 100;
	}

	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero entre 1 y 100: ");
		int numero = sc.nextInt();
		sc.close();

		return numero;
	}

	public static void fizzBuzz(int numero) {
		if (esFizzBuzz(numero)) {
			System.out.println("FizzBuzz");
		} else if (esFizz(numero)) {
			System.out.println("Fizz");
		} else if (esBuzz(numero)) {
			System.out.println("Buzz");
		} else {
			System.out.println(numero);
		}
	}

	public static boolean esFizz(int numero) {
		return numero % 3 == 0;
	}

	public static boolean esBuzz(int numero) {
		return numero % 5 == 0;
	}

	public static boolean esFizzBuzz(int numero) {
		return esFizz(numero) && esBuzz(numero);
	}
}

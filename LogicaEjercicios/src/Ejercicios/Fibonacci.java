package Ejercicios;


import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * ESCRIBIR LOS "N" PRIMEROS NUMEROS DE LA SERIE DE FIBRONACCI A PARTIR DE UN
		 * NUMERO NATURAL "N" .
		 * 
		 * Nota: La serie de Fibonacci es 0,1,1,2,3,5,8,13,... de acuerdo con la ley
		 * siguiente: fibonacci(1) = 0 fibonacci(2) = 1 fibonacci(3) = 1 = fibonacci(2)
		 * + fibonacci(1) fibonacci(4) = 2 = fibonacci(3) + fibonacci(2) ...
		 * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		int n = sc.nextInt();

		escribirFibonacci(n);

		System.out.println(fibonacci(n));
	}

	public static void escribirFibonacci(int n) {
		if (n == 1) {
			System.out.println("0");
			return;
		}
		if (n == 2) {
			System.out.println("0, 1");
			return;
		}
		int a = 0;
		int b = 1;
		System.out.print("0, 1");
		for (int i = 3; i <= n; i++) {
			int aux = a + b;
			System.out.print(", " + aux);
			a = b;
			b = aux;
		}
		System.out.println();
	}

	public static int fibonacci(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

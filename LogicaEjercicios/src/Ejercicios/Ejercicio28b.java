package Ejercicios;


import java.util.Scanner;

public class Ejercicio28b {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que dados dos n�meros enteros mayores que 0, muestre su
		 * m�ximo com�n divisor. El m�ximo com�n divisor de dos n�meros es el mayor
		 * n�mero que divide a los dos. Ejemplo: Para los n�meros 24 y 18 La salida
		 * deber�a ser: El m�ximo com�n divisor de 24 y 18 es 6
		 */

		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un numero: ");
		n1 = sc.nextInt();
		System.out.print("Escribe otro numero: ");
		n2 = sc.nextInt();

		int peque = n1 > n2 ? n2 : n1;
		int i;

		i = peque;
		while (i > 0 && (n1 % i != 0 || n2 % i != 0)) {
			i--;
		}

		System.out.printf("El M.C.D. de %d y %d es : %d", n1, n2, i);
	}

}

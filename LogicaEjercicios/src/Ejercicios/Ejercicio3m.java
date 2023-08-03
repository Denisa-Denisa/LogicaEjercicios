package Ejercicios;


import java.util.Scanner;

public class Ejercicio3m {

	public static void main(String[] args) {
		/*
		 * PEDIR 3 NUMEROS ENTEROS POR TECLADO ESCRIBE EL MAYOR NUMERO ESCRIBE LOS
		 * NUMEROS ORDENADOS DE MENOR A MAYOR
		 */

		int n1, n2, n3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe numero 1: ");
		n1 = sc.nextInt();
		System.out.print("Escribe numero 2: ");
		n2 = sc.nextInt();
		System.out.print("Escribe numero 3: ");
		n3 = sc.nextInt();
		sc.close();

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 es el mayor: " + n1);
		} else if (n2 > n3) {
			System.out.println("n2 es el mayor: " + n2);
		} else {
			System.out.println("n3 es el mayor: " + n3);
		}

		String salida = "";
		if (n1 < n2 && n1 < n3) {
			salida = n1 + " ";
			if (n2 < n3) {
				salida = salida + n2 + " " + n3;
			} else {
				salida = salida + n3 + " " + n2;
			}
		} else if (n2 < n3) {
			salida = n2 + " ";
			if (n1 < n3) {
				salida = salida + n1 + " " + n3;
			} else {
				salida = salida + n3 + " " + n1;
			}
		} else {
			salida = n3 + " ";
			if (n1 < n2) {
				salida = salida + n1 + " " + n2;
			} else {
				salida = salida + n2 + " " + n1;
			}
		}
		System.out.println(salida);
	}

}

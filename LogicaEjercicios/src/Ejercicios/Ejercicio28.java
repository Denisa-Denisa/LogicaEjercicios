package Ejercicios;


import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// Realiza un programa que dados dos números enteros mayores que 0,
		// muestre su máximo común divisor. El máximo común divisor de dos
		// números es el mayor número que divide a los dos.
		// Ejemplo: Para los números 24 y 18
		// La salida debería ser: El máximo común divisor de 24 y 18 es 6

		
		
		
		int n1, n2; 
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Escribe un numero: ");
		n1 = sc. nextInt(); 
		System.out.print("Escribe otro numero: ");
		n2 = sc.nextInt(); 
		
		int peque = n1 > n2 ? n2 : n1; 
		int i; 
		for (i=peque; i>0 && (n1 % i !=0 ||  n2 % i != 0); i--);
		
		System.out.printf("El MCD de %d y %d es : %d" , n1,n2, i);
		
	}

}




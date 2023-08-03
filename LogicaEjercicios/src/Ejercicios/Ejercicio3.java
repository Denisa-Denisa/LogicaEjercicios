package Ejercicios;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Simula la lotería de La primitiva. Cada apuesta que hace un jugador tiene 6 números entre 1 y 49 que no se pueden repetir. Un boleto tiene 6 apuestas como máximo.
		 * El jugador introduce los números que quiere de cada apuesta por teclado.
		 * Una vez que ya tenéis las apuestas del jugador inicias el sorteo. Para ello generas 6 números aleatorios.
		 * Deberás informar al jugador cuantos aciertos tiene en cada apuesta y mostrar los números que han salido en el sorteo.
		 */

		int maximoNumero = 0;
		int minimoNumero = 0; 
		
		
		
		Scanner sc = new Scanner (System.in);
		int loteria [] = new int [6];
		int numero=0;
		
		// PEDIR QUE INTRODUZCCA LOS NUMEROSDE CADA APUESTA //
		
		 for (int i = 0; i < 6; i++) {
			 if (numero <1 && numero > 49) {
	            	System.out.println("Numero incorrecto");
			 	 
	            System.out.println("Introduce el numero de apuesta : "); 
	            numero = sc.nextInt(); 
	            
	            
	            }
	          }
	 
		 System.out.println("El sorteo va a iniciar: ");
		 
		 		 
		 		 
		 
		  }
 					
	}


	


package Ejercicios;


import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		//  El desarrollo de la serie de Maclaurin para el logaritmo neperiano es:
		//  ln(x) = ( x−1) − ( x−1)2
		//	2 + ( x−1)3
	    //	3 − ( x−1)4
		//  4 + ( x−1)5
        //	5 - ... , (0<x≤2)
     	//	Escribir un programa que evalúe y muestre por pantalla el valor de la
		//	serie con n términos, donde x y n se introducen por teclado.


		double x = 1.5;
		int n =5; 
		double result = 0; 
		
		
		
		
		for (int i =1; i<= n; i++) {
			if (i % 2 != 0 ) {
				result += Math.pow(x-1, i) / i; 
			} else {
				result += Math.pow(x-1, i) / i;
			}
			  
		}
		   
		System.out.printf("ln(%f) con %d terminos es: %f", x, n, result);
		
	}

}

package Ejercicios;


import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// En el supermercado “El 13" las ventas no van muy bien. Por ello, han
		// decidido lanzar una campaña de captación de clientes consistente en
		//aplicar un descuento de un 5% sobre el importe de la compra si este
		//supera los 60 euros y un 5% adicional si, además, dicho importe
		//(despreciando céntimos de euro) es divisible entre 13. Desarrollar un
		//programa que, dado el importe inicial de una compra, calcule y muestre
		// por pantalla el descuento aplicado y el importe final.
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Escribe el importe de la compra: ");
		float importe = sc.nextFloat(); 
		
		
		
		float total = importe;
		float descuento = 0; 
		if (importe > 60) {
			 descuento = importe * 0.05f; 
			
			if (importe % 13 == 0) {
				total -= descuento; 
				
			}
			total -= descuento; 
		}

		
		System.out.println("Descuento: " + descuento + " € ");       /// System.out.println("Descuento: %6.2f\n" ,descuento); 
		System.out.println("Total: " + total + " € ");               /// System.out.println("Descuento: %6.2f\n" ,total); 

		
	}
}

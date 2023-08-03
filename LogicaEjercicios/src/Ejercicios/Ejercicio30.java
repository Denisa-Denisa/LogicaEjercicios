package Ejercicios;


public class Ejercicio30 {

	public static void main(String[] args) {
		 //  Crea un programa que:
		 // a. Genere dos vectores con 10 números aleatorios entre 1 y 100.
		 // b. Escribe los dos vectores.
		 // c. Escribe la intersección
		 // d. Escribe la unión (No es necesario tener en cuenta los repetidos)
		
		
		
		int [] numeros1 = new int[10]; 
		int [] numeros2 = new int [10]; 
		for(int i=1; i<10; i++) {
			numeros1[i] = (int) Math.ceil(Math.random() *100);
			numeros2[i] = (int) Math.ceil(Math.random() *100);
				
		}
		
		System.out.print("Array 1: ");
		for(int i=1; i<10; i++) {
			System.out.print(numeros1[i] + " ");    // para que quede bonito :       System.out.printf("3%d ", numeros1[i]); 
		}
			
		System.out.println(); 
		System.out.print("Array 2: ");
		for(int i=1; i<10; i++) {
			System.out.print(numeros2[i] + " ");
		}
			
		System.out.println(); 
		
		System.out.print("interseccion: ");
		for(int i=0; i<numeros1.length; i++) {
			for(int j=0; j<numeros2.length; j++) {
				if (numeros1[i] == numeros2[j]) {
					System.out.print(numeros1[i] + " ");
			}
			 
			}
		}
	}
	
}

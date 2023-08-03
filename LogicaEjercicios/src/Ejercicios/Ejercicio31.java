package Ejercicios;


public class Ejercicio31 {

	public static void main(String[] args) {
		// Crea un programa que:
		// a. Crea un array de 100 números entre 1 y 100.
		// b. Calcula la media.
		// c. Calcula la media de los números mayores de 25 y menores de 75.
		
		
		
		
		// a) 
		int [] numeros = new int [100]; 
		
		for (int i=0; i<numeros.length;  i++) {
			numeros [i] = (int) Math.ceil(Math.random() * 100); 
			
			
		}
		
		// b) Calcular la media
		
		
		int suma = 0; 
		for(int i=0; i< numeros.length; i++) {
			suma += numeros [i];    // suma = suma + numeros[i]
			
		}
		
		float media = (float) suma / numeros.length; 
		System.out.println("La media es : " + media); 
		
		
		// c) Media numeros mayores de 25 y menores de 75
		
		
		int suma2= 0;
		int contador =0; 
		for (int i=0; i<numeros.length; i++) {
			if (numeros [i] < 25 && numeros [i] < 75) {
				suma2 += numeros [i];
				contador ++; 
		}
		}
		float media2 = (float) suma2 / contador; 
		System.out.println ("La media (25-75) es: " + media2); 
		System.out.printf ("La media (25-75) es: %2f", media2); 
	}

}

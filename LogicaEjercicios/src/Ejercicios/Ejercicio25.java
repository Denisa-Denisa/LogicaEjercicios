package Ejercicios;


public class Ejercicio25 {

	public static void main(String[] args) {
		// CREA UN ARRAY CON 10 NUMEROS ALEATORIOS. DESPUES CALCULA LA SUMA DE TODOS ELLOS Y ESCRIBE EL RESULTADO.  
		
		
		int [] numeros = new int [10];
		
		for (int i=0; i<10; i++) {
			numeros[i] = (byte) Math.ceil(Math.random() *100); 
			
		}
		 // sumamos todos los numeros del array
		int suma =0; 		
		for (int i=0; i<10; i++) {
			suma += numeros[i];   // suma = suma + numeros [1]
						
		}
		
		System.out.println("Suma total: " + suma);
			
		
	}

}

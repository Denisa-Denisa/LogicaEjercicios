package Ejercicios;


public class Ejercicio33 {

	public static void main(String[] args) {
		// Calcular y escribir la temperatura más alta y más baja de una serie de
		// 100 temperaturas generadas al azar entre -25º y 60º.

		float n = aleatorio (-25 , 60); 
		float menor = n; 
		float mayor = n; 
		for(int i=1; i <1000; i++) {
			
			n = aleatorio (-25 , 60); 
			if ( n > mayor) {
				mayor = n; 
			}
			if (n < menor) {
				menor = n; 
			}
			
			}
		 		
		System.out.printf("Temperatura mas baja: %6.1f\n ", menor); 
		System.out.printf("Temperatura mas alta: %5.1f\n ", mayor); 
    }
	
	
	public static float aleatorio (float minimo , float maximo) {
		float n;
		
		n =  (float)Math.random() * (maximo - minimo)  + minimo; 
		return  n; 
		
	}
        	
        	
        }
	



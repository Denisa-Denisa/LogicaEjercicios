package Ejercicios;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Pide cinco números por teclado (valores entre 100 y 450).
		 * Suma los dos primeros.
		 * Realiza el producto del tercero y el cuarto.
		 * Divide la suma de los resultados anteriores entre el quinto número.
		 * Escribe el resultado e indica si el resultado es par o impar.
		 * Se valorará la validación correcta de los números introducidos por teclado.
		 *  
		 */
        			
		 // PEDIR 5 NUMEROS POR TECLADO //
		
		 Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[5];
       
	        int numero;
	      
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Introduce un numero entre 100 y 450: "); 
	            numero = sc.nextInt(); 
	            
	    // VERIFICAR QUE EL NUMERO SE ENCUENTRA ENTRE 100 Y 450 //
	            
	        while (numero < 100 || numero > 450) {	        	
	        		System.out.println("Numero incorrecto.");
	        		numero = sc.nextInt();
	        
	        		while (!sc.hasNextInt()) {
	        			sc.nextLine();
	        			System.out.println("No se admiten letras");
	        		}		
	        	sc.close(); 
	        		          	        	 
	        }
	     	        
	       numeros [i] = numero; 
	          
	    }
            int suma = numeros[0] + numeros [1];
            System.out.println("La suma de los dos primeros numeros es: " + suma); 
            		
            		
            int producto = numeros[2] * numeros [3];
            System.out.println("La multiplicacion del tercero por el cuarto numero es: " + producto);
            
            float division = (suma + producto) /(float) numeros [4];
            System.out.println("La division de la suma de los dos primeros por el quinto es: " + division);
            
           
            float resultado = (suma + producto) / (float) numeros[4];
            
            if (resultado  % 2 == 0) {
              System.out.println("El resultado es par");
            } else {
              System.out.println("El resultado es impar");
            }
          }
       
                      
	    }
		
	

	   
	



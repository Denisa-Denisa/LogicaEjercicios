package Ejercicios;


import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		// Se proporcionan por teclado las calificaciones de un examen (entre 0 y
		//10). Diseñar un algoritmo que muestre por pantalla la media de la clase
	    //y el número de aprobados (calificaciones superiores o iguales a 5). La
	    //introducción de calificaciones terminará cuando se teclee el valor -1.

		
		
		float suma = 0;
        float totalNotas = 0;
        float aprobados = 0;
		float nota =0;  
		float media; 
		
		Scanner sc = new Scanner ( System.in);	
			
		
        do {
        	System.out.print("Introduce una nota: ");
        	nota = sc.nextFloat(); 
        	
            if (nota >= 0 && nota <= 10) {
                suma += nota;
                totalNotas++;
                if (nota >= 5) {
                    aprobados++;
                }
            } else if (nota !=-1) {
                System.out.println("Introduce una nota entre 0 y 10.");
            }

        } while (nota != -1  );
         sc.close(); 

        if (totalNotas > 0) {
            media =  suma / (float) totalNotas;
            System.out.println("La media  es: " + media);
            System.out.println("El número de aprobados es: " + aprobados);
        } else {
            System.out.println("No hay notas.");
        }
    }
              
        }	
	


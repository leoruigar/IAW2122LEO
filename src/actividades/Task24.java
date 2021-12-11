package actividades;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task24 {
			// Fill in a table of 10 numbers (random values from 1 to 20). Perform a function that returns the 
			//most repeated number.

			private static Scanner sc = new Scanner(System.in);
			private static int [] tablita;
			public static void main(String[] args) {
				int cantidad = 10;
				tablita = new int [cantidad];
				rellenar();
				mostrar();
				repetidos();
			}

			private static void repetidos() {
				int vecesrepe = 0;
			        for( int i = 0; i<tablita.length;i++){
			            for(int j = i+1;j<tablita.length ;j++){
			            	if(tablita[i]==tablita[j]){
			                    System.out.println("El numero: " + tablita[j] + " se ha repetido");
			                    vecesrepe++;
			                }
			            }
			        }  
			    System.out.println("Hay "+vecesrepe+ " Numeros que se han repetido ");
			   
			    }		
				
			
			private static void rellenar() {

				for (int i = 0; i < tablita.length; i++) {
					tablita[i] = new Random().nextInt(20) + 1 ;				
				}}	
			private static void mostrar() {
				System.out.println("Tabla: " + Arrays.toString(tablita));    
			}
	
				}
			

			   
		    
	

			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


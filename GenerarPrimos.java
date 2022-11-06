package org.ip.sesion04;

public class GenerarPrimos {
	 public static void main(String[] args) {
         int numero=0;
         int numerosPrimos=0;
         int linea=0;

         System.out.println("Los 50 primeros numeros primos son");
         System.out.println();

         while(numerosPrimos!=50) {

        	 if(esPrimo(numero)) {
     		    System.out.printf("     ");
        		    ++numerosPrimos;
        		    linea++;
        		    System.out.printf("%5d",numero);
        		    if(linea==10) {
        		        linea=0;
        		        System.out.println();
        		    }
             }
         numero++;
     }
	 }
	 
 public static boolean esPrimo(int n) {
         int divisor=3;

         if(n==2) {
             return true;
         }
         else if(n==0 || n==1) {
             return false;
         }
         else {
             while(divisor<n) {

                 if(n%2==0) {
                     return false;
                 }
                 else {
                     if(n%divisor==0) {
                         return false;
                     }
                 }
                 divisor+=2;
             }
         }return true;       
     }
	}



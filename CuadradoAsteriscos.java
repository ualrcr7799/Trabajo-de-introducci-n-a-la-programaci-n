package org.ip.sesion03;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.println("Cuadrado de asteriscos de lado "+ n);
		if(n>=2 && n<=30) {
			  for(int j=0; j<n; j++) {  
			      for(int i=0; i<n; i++) {  
			        System.out.print( "*" );  
			      }  
			      System.out.println();  
			    }  
			} else 	{	System.out.println("Cuadrado de asteriscos de lado "+ n);
	}
}
}

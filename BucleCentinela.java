package org.ip.sesion03;

import java.util.Scanner;

public class BucleCentinela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPositivos=0;
		int numNegativos=0;
		int sumPositivos=0;
		int sumNegativos=0;
		int numActual=0;
		int numtotal=0;
		double media=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce valores enteros; el proograma termina si la entrada termina en 0");
		numActual = entrada.nextInt();
		while(numActual!=0) {
			numtotal++;
			if (numActual > 0) {
				numPositivos++;
				sumPositivos += numActual;
			} else if (numActual <0) {
				numNegativos++;
				sumNegativos += numActual;
			} else // numActual == 0
				numtotal--;
			numActual = entrada.nextInt();
		}
		media = (double)(sumPositivos + sumNegativos) / numtotal;
		System.out.println("El numero de positivos es "+ numPositivos);
		System.out.println("El numero de negativos es "+ numNegativos);
		System.out.println("El numero total de valores leidos "+ numtotal);
		System.out.println("La suma de positivos es "+ sumPositivos);
		System.out.println("La suma de negativos es "+ sumNegativos);
		System.out.println("La media de los valores es"+ media);

	}

}

package org.ip.sesion04;

import java.util.Scanner;

public class MaximoComunDivisor {
	
	static Scanner entrada = new Scanner(System.in);

	public static int mcdRecursivo(int m, int n) {
		
		if (m<n) 
			return mcdRecursivo(n,m);
		else if (n==0)
			return m;
		else
			return mcdRecursivo(n, m%n);
	}
	public static void main(String[] args) {
		int m, n;
		System.out.println("Introduce el primer valor " );
		m= entrada.nextInt();
		System.out.println("Introduce el segundo valor " );
		n= entrada.nextInt();
		System.out.println("El maximo comun divisor de "+m+" y "+n+" es "+mcdRecursivo(m,n) );
	}
}

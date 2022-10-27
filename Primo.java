package org.ip.sesion03;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y=0;
		
		Scanner entrada = new Scanner(System.in);
		x= entrada.nextInt();
		System.out.println("Introduceun un numero (>1) para saber si es primo: "+ x);
		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				++y;
		}
		} if(y==2) {
			System.out.println("Es primo");
	} else {	
		System.out.println("No es primo");

	}
	}

}

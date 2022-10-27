package org.ip.sesion03;

import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner input =new Scanner(System.in);
		System.out.println("Introduce un primer valor positivo");
		x= input.nextInt();
		int y;
		System.out.println("Introduce un segundo valor positivo");
		y= input.nextInt();
		int d=x/y;
		int r=x-(y*d);
		while ( r != 0) {
			x=d; y=r;
			if (r==0){
			}
			System.out.println("El MCD de "+ x +" y de "+ y +" es "+d);
			System.out.println();
			break;

		}
		System.out.println("El MCD de "+ x +" y de "+ y +" es "+d);
	}			
}

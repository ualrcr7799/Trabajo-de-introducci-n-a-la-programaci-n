package org.ip.sesion03;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		do {
			System.out.println("Tabla del 5");
			Scanner input =new Scanner(System.in);
			x= input.nextInt();
			y = x * 5;
		}while (x<=0);
		System.out.println("Introduzca un numero (de 1 al 10): "+ x);
		System.out.println("5 * "+ x + " = "+ y);


	}

}

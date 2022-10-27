package org.ip.sesion02;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 2;
		double res, x1, x2, y;
		y=(b*b-4*a*c);
		res = a + b + c;
		x2= -(-b+Math.pow(y,0.5))/(2*a);  
		x1= -(-b-Math.pow(y,0.5))/(2*a);
		if (a<=0) {
			System.out.println("No es una ecuacion de segundo grado");
			System.out.println();
		} else if (res == 0) {
			System.out.println("No tiene solucion real");
			System.out.println();
		} else if (res != 0) {
			System.out.println("Dos raices de valores"+x1+ "y" +x2+ ".");
		
		}

	}

}

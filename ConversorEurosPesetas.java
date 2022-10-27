package org.ip.sesion01;

public class ConversorEurosPesetas {

	public static void main(String[] args) {
		double euro, peseta;
		int N = 10000;
		double r = Math.random();
		int n = (int) (r * N);
		euro = ((int) (r * N)) / 166.386;
		peseta = 166.486 * ((int) (r * N));

		System.out.printf("euro = "+ euro);
		System.out.println();
		System.out.printf("peseta = "+ peseta);
		System.out.println();
		System.out.println("Su entero aleatorio es" + n);
		System.out.println();

	}

}

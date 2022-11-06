package org.ip.sesion04;

import java.util.Scanner;

public class Cilindro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca radio ");
		double radio = entrada.nextDouble();
		
		System.out.print("Introduzca altura ");
		double altura= entrada.nextDouble();
		
		System.out.println("Que desea calcular: 1 (area) / 2 (volumen) ");
		double x= entrada.nextInt();
		
		if (x==1) {
	 areaCilindro(radio, altura);
		}else if (x==2) {
	     volumenCilindro(radio,altura);
			}  else { 		
				System.out.println("Opción el calculo errónea");
			}
	    }
		public static void areaCilindro(double radio, double altura) {
				double y= 2 * Math.PI * radio * (altura+radio);
							System.out.print("El área del cilindro es " + y);
			}
		
		
	public static void volumenCilindro(double radio, double altura) {
			double z= Math.PI  * Math.pow(radio,  2.0) * altura;
			System.out.print("El volumen del cilindro es " + z);

			
		
	}
}
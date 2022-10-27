package org.ip.sesion01;

public class Circunferencia {

	public static void main(String[] args) {

		double radio = 4.57;
		
		double diametro, area, longitud;
		longitud = 2 * Math.PI * radio;
		diametro = 2 * radio;
		area = Math.PI * Math.pow(radio,  2.0);

		System.out.println("radio = " + radio);
		System.out.println();
		System.out.printf("Longitud de la circunferencia = %.2f", longitud);
		System.out.println();
		System.out.printf("Area de la circunferencia = %.3f", area);
		System.out.println();
		System.out.printf("Diametro de la circunferencia = %.3f", diametro);
		System.out.println();
	}

}

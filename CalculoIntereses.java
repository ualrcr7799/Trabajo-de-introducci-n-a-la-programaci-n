package org.ip.sesion01;

public class CalculoIntereses {

	public static void main(String[] args) {
		int dinero = 2500;
		double interes = 1.75;
		double retrendra = 0.21;
		double intereses, retencion, cobrados;
		intereses = (dinero * (interes/100) ) / 2;
		retencion= (dinero * (interes/100) * (retrendra)) / 2;
		cobrados = intereses - retencion;

		System.out.printf("Dinero ingresado: "+ dinero);
		System.out.println();
		System.out.printf("Interes anual: "+ interes);
		System.out.println();
		System.out.printf("Interes a los 6 meses: %.2f", intereses );
		System.out.println();
		System.out.printf("Retencion realizada: %.2f", retencion );
		System.out.println();
		System.out.printf("Intereses cobrados: %.2f", cobrados );
		System.out.println();






	}

}

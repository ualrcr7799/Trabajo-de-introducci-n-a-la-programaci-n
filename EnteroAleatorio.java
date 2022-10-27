package org.ip.sesion01;

public class EnteroAleatorio {

	public static void main(String[] args) {
		double aleatorio = Math.random()*(15-(-15)+1)-15;
		aleatorio= (int) aleatorio;

		System.out.println("El entero generado aleatoriamente es "+ aleatorio);


	}

}

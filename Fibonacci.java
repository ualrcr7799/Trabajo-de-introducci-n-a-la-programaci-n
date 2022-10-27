package org.ip.sesion03;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long suma, cnum, ant1, ant2, cont;
		ant1=0;
		ant2=1;
		cnum=15;
		System.out.println("Hasta que termino de la serie de Fibonacci quieres mostrar?  ");
		System.out.println(cnum);
		for(cont = 1; cont <= cnum; cont = cont + 1) {
			suma=ant1 + ant2;
			ant1 = ant2;
			ant2= suma;
			System.out.println(ant1 + "");

					
		}

	}

}

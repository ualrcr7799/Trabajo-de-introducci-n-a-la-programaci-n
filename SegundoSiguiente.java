package org.ip.sesion02;

public class SegundoSiguiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora=2, min=59, s=59;
		System.out.printf("Instante de tiempo real:  %02d:%02d:%02d", hora, min, s);
		System.out.println();
		s++;
		if(s==60) {
			s=0; min++;
			if(min==60) {
				min=0; hora++;
				if(hora==24) {
					hora=0;
				}
			}
				} System.out.printf("Instante de tiempo un segundo después:  %02d:%02d:%02d", hora, min, s);
	}
}

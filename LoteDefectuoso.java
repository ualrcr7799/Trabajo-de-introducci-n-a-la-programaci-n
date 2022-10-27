package org.ip.sesion02;

public class LoteDefectuoso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lote = 25000; 
		if ((lote >= 5300 && lote <= 5399) || 
		(lote >= 33001 && lote <=39999) ||
		(lote >= 178000 && lote <= 191499))
			System.out.println("El codigo" + lote+ " corresponde a un lote DEFECTUOSO." );
		else
			System.out.println("El codigo " + lote+ " corresponde a un lote NO DEFECTUOSO.");

	}

}

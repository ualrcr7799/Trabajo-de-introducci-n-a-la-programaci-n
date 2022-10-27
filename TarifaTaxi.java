package org.ip.sesion02;

public class TarifaTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km = 101;
		if ( km >= 30 && km <= 100 )
			System.out.println("El importe total a pagar es ");
		km =  (int)((km - 30) * 0.85)+ 18;
		if ( km >= 100 )
			System.out.println("El importe total a pagar es ");
		km =  (int)((km - 30)* 0.85 + (km - 100) * 0.65)+ 18 ;
	}

}

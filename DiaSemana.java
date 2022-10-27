package org.ip.sesion02;

public class DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 3;
		int m = 3;
		int y = 2006;
		int yO, x, mO,dO;
		yO = y-(14-m)/12;
		x = yO+yO/4-yO/100+yO/400;
		mO = m+12*((14-m)/12)-2;
		dO = (d+x+(31*mO)/12)%7;
		System.out.println("El dia de la semana corresponiente al " + d + "/"+ m +"/"+ y +" es: ");
		switch (dO){ 
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		}

	}

}

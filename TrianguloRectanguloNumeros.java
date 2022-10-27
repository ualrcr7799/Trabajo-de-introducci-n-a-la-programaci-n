package org.ip.sesion03;

public class TrianguloRectanguloNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 10;
		int i = 0, j = 0;
		for (i = 0; i < s ; i++) {
			for (j = 0; j < s-i ; j++) {
				System.out.print(" ");
			}
			for (j = 9; j >= 0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

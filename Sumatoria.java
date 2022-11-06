package org.ip.sesion04;


public class Sumatoria {

	public static void main(String[] args) {
		int x=5;
		System.out.println("Introduce el numero de terminos que desea sumar " + x);
		System.out.println();
		System.out.println();
		System.out.println("La suma usando el metodo iterativo de los 5 primeros numeros "+ sumaIterativa(x));
		System.out.println("La suma usando el metodo directo de los 5 primeros numeros es "+ sumaDirecta(x));
		System.out.println("La suma usando el metodo recursivo de los 5 primeros numeros es "+ sumaRecursiva(x));
		System.out.println();
		System.out.println("Funcionamiento correcto");
		}
	public static int sumaIterativa(int x) {
		int y=0;
		for (int i=0;i <= x; i++){
		y=y+i;	
		}
		return y;
				
	}
	public static int sumaDirecta(int x) {
		int z=x*(x+1)/2;
		return z;
	}
	public static int sumaRecursiva(int x) {
		
		if(x == 1)  
			return 1;
		else
			return x + sumaRecursiva(x-1);
	}
}
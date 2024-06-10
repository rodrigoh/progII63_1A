package aulaSeis.vetores;

import java.util.Random;

public class GerandoNumerosAleatorios {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int n = aleatorio.nextInt();
		System.out.println(n);
		n = aleatorio.nextInt(10);
		System.out.println(n);
		n = aleatorio.nextInt(20,50);
		System.out.println(n);
		float num = aleatorio.nextFloat();
		System.out.println(num);
		boolean flag = aleatorio.nextBoolean();
		System.out.println(flag);
		int[] numeros = new int[10];
		for(int i=0;i<numeros.length;i++){
			numeros[i] = aleatorio.nextInt(1,100);
		}
	}
}

package aulaDois.exemplos;

import java.util.Scanner;
public class ExemploUm {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.print("Número inteiro: ");
		numero = ler.nextInt();
		System.out.println("O número "+numero);
		System.out.print("Número real: ");
		float numeroReal = ler.nextFloat();
		System.out.println("Número real: "+numeroReal);
		System.out.printf("Número real: %.2f\n",numeroReal);

		float valorPI = (float) Math.PI;
		float base = 5;
		int expoente = 6;
		double resultado = Math.pow(base,expoente);
		System.out.printf("5^6 = %.2f\n",resultado);

	}
}

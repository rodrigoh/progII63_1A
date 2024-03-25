package aulaSeis.vetores;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Vetor de números inteiros de 10 posições
		// com índices de 0 a 9
		int[] lista = new int[5];
//		lista[0] = 10;
//		lista[5] = 2;
		System.out.println("O tamanho da lista é "+lista.length);
		for(int i=0; i<lista.length; i++){
			System.out.print("Informe um valor para lista["+i+"]: ");
			lista[i] = ler.nextInt();
		}
		System.out.println("Dados no vetor");
		for(int i=0; i<lista.length; i++){
			System.out.print(lista[i]+" ");
		}
	}
}

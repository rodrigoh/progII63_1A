package aulaSeis.vetores;

import java.util.Scanner;

public class ExemploQuatro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = ler.next();
		char[] nomeVetor = nome.toCharArray();
		for(char letra: nomeVetor){
			System.out.print(letra+" ");
		}
	}
}

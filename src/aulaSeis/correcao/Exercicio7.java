package aulaSeis.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
que é 12345, o algoritmo deve ler novamente, até que seja a senha correta.
O algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
incorreta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
informação na tela.
 */
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String senhaPadrao = "12345";
		String senha;
		int cont = 0;
		do{
			System.out.print("Digite sua senha: ");
			senha = ler.next();
			if(!senha.equals(senhaPadrao)) {
				cont++;
				System.out.println("Senha incorreta!");
			}
		}
		while(!senha.equals(senhaPadrao));
		System.out.println("Bem vindo, errou a senha "+cont+" vezes");
	}
}

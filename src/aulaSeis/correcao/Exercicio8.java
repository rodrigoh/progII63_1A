package aulaSeis.correcao;
/*
Escreva um algoritmo para pedir que o usuário digite números positivos, ou seja,
 ele pode digitar quantos números positivos ele quiser. Para parar de digitar
 números, ele deve digitar -1. Após o usuário digitar -1, o programa deve
 escrever na tela quantos números o usuário digitou (a quantidade de números
 lidos) e a soma total dos números que ele digitou.
 */

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contNumeros = 0;
		int soma = 0;
		int num;
		do{
			System.out.print("Digite um número -1 para encerrar: ");
			num = ler.nextInt();
			if(num>=0){
				contNumeros++;
				soma+=num;
			}
		}
		while (num>=0);
		System.out.println("Foram digitados "+contNumeros+" números que somados valem "+soma);
	}
}

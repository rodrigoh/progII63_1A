package aulaSete.correcao;

import java.util.Scanner;

/*
Declarar um vetor de até 100 números inteiros positivos,
pedir para o usuário digitar elementos para o vetor, até que
 ele digite um 0 ou que o vetor esteja cheio, que encerra a
 leitura. Mostrar o vetor lido.

 */
public class Exercicio2 {
	public static void main(String[] args) {
		int[] vetor = new int[100];
		int cont = 0;
		int num;
		do{
			System.out.print("Digite um número positivo ou 0 para encerrar ");
			num = new Scanner(System.in).nextInt();
			if(num>0){
				vetor[cont++] = num;
			}
		}
		while(num>0);
		System.out.println("Dados no vetor...");
		for(int i=0;i<cont;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}

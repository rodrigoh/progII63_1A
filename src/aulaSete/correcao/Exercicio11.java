package aulaSete.correcao;

import java.util.Random;
import java.util.Scanner;

/*
Ler um vetor de 10 elementos inteiros. Após isto, imprimir na tela os 10
valores lidos e o usuário poderá escolher um destes valores para ser excluído
do vetor. Ler o valor escolhido e eliminá-lo do vetor. No momento da exclusão
todos os valores posteriores ao valor escolhido deverão ser reorganizados
(movidos uma posição para esquerda) a fim de que o vetor resultante não fique
com um espaço em branco. Imprimir o novo vetor.
 */
public class Exercicio11 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		System.out.println("Números no vetor...");
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1, 100);
			System.out.print(vetor[i]+" ");
		}
		//Ler o número para remover
		System.out.print("\nDos números acima qual deseja remover: ");
		int num = ler.nextInt();
		//Buscando o número no vetor
		int posicao = -1;
		int tamanho = vetor.length;
		for(int i=0;i<tamanho;i++){
			if(vetor[i]==num){
				posicao = i;
			}
		}
		//Remover o número
		if(posicao!=-1){
			for(int i=posicao;i<tamanho-1;i++){
				vetor[i] = vetor[i+1];
			}
			//Como removi um elemento o tamanho da lista diminui
			tamanho--;
			System.out.println("Dados na lista: ");
			for(int i=0;i<tamanho;i++){
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println(num+" não está na lista");
		}
	}
}

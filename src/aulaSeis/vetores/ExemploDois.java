package aulaSeis.vetores;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[20];
		System.out.print("Em qual posição deseja salvar o número: ");
		int p = ler.nextInt();
		if(p>=0 && p<vetor.length){
			System.out.print("Qual número salvar devo nesta posição: ");
			vetor[p] = ler.nextInt();
			for(int i=0;i< vetor.length;i++){
				System.out.printf("%d ",vetor[i]);
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println("Posição inválida");

		}
	}
}

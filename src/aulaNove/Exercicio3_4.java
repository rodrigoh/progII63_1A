package aulaNove;

import java.util.Random;

public class Exercicio3_4 {
	public static int dado(){
		Random aleatorio = new Random();
		return aleatorio.nextInt(0, 6);
	}
	public static void main(String[] args) {
		int[] lancamentos = new int[6];
		float maximo = 1000000;
		for(int i=0;i<maximo;i++){
			int face = dado();
			lancamentos[face]++;
		}
		for(int i=0;i<6;i++){
			float percentual = lancamentos[i]/maximo*100;
			System.out.println("O lado "+(i+1)+" do dado foi sorteado "+lancamentos[i]+" vezes");
			System.out.println("O que representa "+String.format("%.2f ",
							percentual)+"% das vezes");
		}
	}
}

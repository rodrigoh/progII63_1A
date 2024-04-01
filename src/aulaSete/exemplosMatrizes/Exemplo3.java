package aulaSete.exemplosMatrizes;

import javax.crypto.spec.PSource;

public class Exemplo3 {
	public static void main(String[] args) {
		int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		System.out.println("Dados na matriz...");
		for(int l=0;l<3;l++){
			for(int c=0;c<4;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("O número de linhas da matriz é "+matriz.length);
		System.out.println("O número de colunas da matriz é "+matriz[0].length);

		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[0].length;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		//For simplificado
		System.out.println("\nFor simplificado");
		for(int[] linha : matriz){
			for(int coluna : linha){
				System.out.printf("%02d ",coluna);
			}
			System.out.println();
		}
	}


}

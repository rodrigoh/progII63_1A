package aulaSete.exemplosMatrizes;

import java.util.Random;

public class Exemplo2 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		System.out.println("Dados na matriz:");
		for(int l=0;l<5;l++){
			for(int c=0;c<5;c++){
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nDiagonal principal");
		for(int l=0;l<5;l++) {
			for (int c = 0; c < 5; c++) {
				if (l == c)
					System.out.print(matriz[l][c]+" ");
			}
		}
		System.out.println("\nDiagonal principal opc 2");
		for(int i=0;i<5;i++){
			System.out.print(matriz[i][i]+" ");
		}
		System.out.println("\nDiagonal secundária: ");
		for(int l=0;l<5;l++) {
			for (int c = 0; c < 5; c++) {
				//4 = tamanho da matriz -1
				if(l+c==4){
					System.out.print(matriz[l][c]+" ");
				}
			}
		}
	}
}

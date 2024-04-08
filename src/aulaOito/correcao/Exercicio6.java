package aulaOito.correcao;

import java.util.Random;
import java.util.Scanner;

/*
 Ler uma matriz 4x4 de números inteiros, multiplicar os
 elementos da diagonal principal por um número inteiro
 também lido e escrever a matriz resultante.

 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];
        for(int l=0;l<4;l++){
            for(int c=0;c<4;c++){
                matriz[l][c] = aleatorio.nextInt(1,30);
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.printf("\n");
        }
        System.out.printf("Digite um número: ");
        int valorX = ler.nextInt();
        for(int l=0;l<4;l++) {
            for (int c = 0; c < 4; c++) {
                if(l==c)
                    matriz[l][c]*=valorX;
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.printf("\n");
        }
    }
}

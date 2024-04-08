package aulaOito.correcao;

import java.util.Random;

/*
Carregar uma matriz SOMA 4x4, calcular e escrever as
seguintes somas:
a) da linha 3 (índice 2)
b) da coluna 2 (índice 1)
c) de todos os elementos da matriz

 */
public class Exercicio3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];
        int somaLinha = 0;
        int somaColuna = 0;
        int somaTotal = 0;
        for(int l=0;l<4;l++){
            for(int c=0;c<4;c++){
                matriz[l][c] = aleatorio.nextInt(1,30);
                System.out.printf("%02d ",matriz[l][c]);
                if(l==2)
                    somaLinha+=matriz[l][c];
                if(c==1)
                    somaColuna+=matriz[l][c];
                somaTotal+=matriz[l][c];
            }
            System.out.printf("\n");
        }
        System.out.printf("A soma dos elementos da linha 3 vale %d\n",somaLinha);
        System.out.printf("A soma dos elementos da coluna 2 vale %d\n",somaColuna);
        System.out.printf("A soma dos os elementos da matriz vale %d\n",somaTotal);
    }
}

package aulaOito.correcao;

import java.util.Random;

/*
 Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão
 na diagonal principal.

9 - Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão
acima da diagonal principal.
Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão
abaixo da diagonal principal.

 */
public class Exercicio8_9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[5][5];
        int somaD = 0;
        int somaAcima = 0;
        int somaAbaixo = 0;
        for(int l=0;l<5;l++){
            for(int c=0;c<5;c++){
                matriz[l][c] = aleatorio.nextInt(1,50);
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.printf("\n");
        }
        for(int l=0;l<5;l++){
            for(int c=0;c<5;c++){
                if(l==c)
                    somaD+=matriz[l][c];
                else if(l<c)
                    somaAcima+=matriz[l][c];
                else
                    somaAbaixo+=matriz[l][c];

//                if(l==c)
//                    somaD+=matriz[l][c];
//                if(l<c)
//                    somaAcima+=matriz[l][c];
//                if(l>c)
//                    somaAbaixo+=matriz[l][c];

            }
        }
        System.out.printf("A soma dos elementos na diagonal vale %d\n",somaD);
        System.out.printf("A soma dos elementos acima da diagonal vale %d\n",somaAcima);
        System.out.printf("A soma dos elementos abaixo da diagonal vale %d\n",
                somaAbaixo);
    }
}

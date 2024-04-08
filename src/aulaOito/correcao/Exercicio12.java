package aulaOito.correcao;

import java.util.Random;

/*
Faça um programa para gerar automaticamente números entre 1 e 99 de
uma cartela de bingo. Sabendo que cada cartela deverá conter 5 linhas
de 5 números, gere estes dados de modo a não ter números repetidos dentro
das cartelas. O programa deve exibir na tela a cartela gerada.
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] cartela = new int[5][5];
        int[] vetor = new int[25];
        int iv = 0;
        for(int l=0;l<5;l++){
            for(int c=0;c<5;){
                int num = aleatorio.nextInt(1,100);
                boolean novoNumero = true;
                for(int i=0;i<iv && novoNumero;i++){
                    if(num==vetor[i]) {
                        novoNumero = false;
                    }
                }
                if(novoNumero){
                    cartela[l][c] = num;
                    vetor[iv] = num;
                    iv++;
                    System.out.printf("%02d ",cartela[l][c]);
                    c++;
                }
            }
            System.out.printf("\n");
        }
    }
}

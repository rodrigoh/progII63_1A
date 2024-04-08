package aulaOito.correcao;

import java.util.Scanner;

/*
Ler 6 números inteiros para preencher uma matriz D 2x3, ou
seja, com 2 linhas e 3 colunas (considere que não serão
informados valores duplicados). A seguir, ler um número
inteiro X e escrever uma mensagem indicando se o valor
de X existe ou não na matriz D.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int[] linha : matriz) {
            for (int c : linha) {
                System.out.printf("%02d ", c);
            }
            System.out.println("");
        }
        System.out.print("Qual número devo procurar na matriz: ");
        int valor = ler.nextInt();
        boolean achei = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor)
                    achei = true;

            }
        }
        if (achei) {
            System.out.printf("%d está na matriz\n", valor);
        } else {
            System.out.printf("%d não está na matriz\n", valor);
        }
    }
}

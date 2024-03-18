package aulaCinco.exemploDoWhile;

import java.util.Scanner;

public class ExemploTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//        int numero=0;
//        while(numero<=10){
//            System.out.printf("Digite um número: ");
////          numero = ler.nextInt();
//        }
        int numero;
        do{
            System.out.printf("Digite um número: ");
            numero = ler.nextInt();
        }
        while (numero<=10);
    }
}

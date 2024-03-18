package aulaCinco.correcao;

import java.util.Scanner;

/*
Receba três valores fornecidos pelo usuário que representarão os lados de um triângulo.
Classifique esse triângulo como:
a) Equilátero: três lados iguais.
b) Isósceles: dois lados iguais.
c) Escaleno: três lados diferentes.
Lembre-se de que, para formar um
triângulo, nenhum dos lados pode ser
igual a zero, um lado não pode ser
maior do que a soma dos outros dois.

 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite a medida de um dos lados: ");
        int a = ler.nextInt();
        System.out.printf("Digite a medida do segundo lado: ");
        int b = ler.nextInt();
        System.out.printf("Digite a medida do terceiro lado: ");
        int c = ler.nextInt();
        if(a>0 && b>0 && c>0 && a<b+c && b<a+c && c<a+b){
            System.out.printf("Forma triângulo ");
            if(a==b && b==c){
                System.out.printf("equilátero\n");
            }
            else if(a==b || a==c || b==c){
                System.out.printf("isósceles");
            }
            else{
                System.out.printf("escaleno");
            }
        }
        else{
            System.out.printf("Não forma triângulo");
        }

    }
}

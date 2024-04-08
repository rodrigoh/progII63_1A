package aulaOito.exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static int soma(int v1, int v2){
        int resposta = v1+v2;
        return resposta;
    }
    public static int soma(int v1, int v2, int v3){
        return v1+v2+v3;
    }
    public static String soma(String s1, String s2){
        return s1+" "+s2;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int n1 = ler.nextInt();
        System.out.printf("Digite outro número: ");
        int n2 = ler.nextInt();
        int soma = soma(n1,n2);
        System.out.printf("Qual seu nome: ");
        String nome = ler.next();
        System.out.printf("Qual seu sobrenome: ");
        String sobrenome = ler.next();
        System.out.printf("Seu nome completo é %s\n",soma(nome, sobrenome));
        System.out.printf("%d + %d = %d\n",n1,n2,soma);
    }
}

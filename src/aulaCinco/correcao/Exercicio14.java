package aulaCinco.correcao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Quantas horas foram trabalhadas: ");
        float horas = ler.nextFloat();
        System.out.printf("Qual o valor da hora: ");
        float valorHora = ler.nextFloat();
        float salarioBase = 160 * valorHora;
        if(horas>160){
            float salarioExtra = (horas-160)*(valorHora*(float)1.5);
            System.out.printf("Seu salário base é R$%.2f\n",salarioBase);
            System.out.printf("Suas horas extras valem R$%.2f\n",salarioExtra);
            System.out.printf("Totalizando R$%.2f\n",salarioExtra+salarioBase);
        }
        else{
            System.out.printf("Seu salário base é R$%.2f\n",salarioBase);
        }
    }
}

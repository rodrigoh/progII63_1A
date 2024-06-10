package aula19.exemploConta;

import java.util.Scanner;
import java.util.Random;


public class Banco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual o nome do titular: ");
		String nome = ler.next();
		System.out.print("Qual o deposito inicial: ");
		float valor = ler.nextFloat();
		String identificador = "a"+new Random().nextInt(100000);
		Conta c1 = new Conta(nome, identificador, valor);
		Conta c2 = new Conta("Ana","a845654");
//		c1.titular = nome;
//		c1.identificador = identificador;
//		c1.depositar(valor);
		System.out.println("Acessando a conta "+c1.identificador);
		System.out.println(c1.verificaSaldo());
		if(c1.sacar(200)){
			System.out.println("Saque realizado");
		}
		else{
			System.out.println("Saldo insuficiente");
		}
	}
}

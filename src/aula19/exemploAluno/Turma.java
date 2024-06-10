package aula19.exemploAluno;

import java.util.Random;
import java.util.Scanner;

public class Turma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno a1 = new Aluno();
		System.out.print("Qual o nome do aluno: ");
		a1.nome = ler.next();
		System.out.print("Qual o sobrenome: ");
		a1.sobrenome = ler.next();
		System.out.print("Qual o e-mail do "+a1.nome+": ");
		a1.eMail = ler.next();
		a1.codigo = new Random().nextInt(1000,10000);
		System.out.println("Informe as notas do "+a1.nome);
		System.out.print("Nota um: ");
		a1.notaUm = ler.nextFloat();
		System.out.print("Nota dois: ");
		a1.notaDois = ler.nextFloat();
		System.out.println(a1.nome+" cadastrado, obteve o código "+a1.codigo);
		System.out.println("O aluno "+a1.nome+" "+a1.sobrenome);
		System.out.println("Tem média "+a1.obterMedia()+" e está "+a1.verificaStatus());
	}
}

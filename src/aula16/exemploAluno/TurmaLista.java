package aula16.exemploAluno;

import java.util.Random;
import java.util.Scanner;

public class TurmaLista {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno[] lista = new Aluno[20];
		int contAluno =0;
		String resp;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("c - cadastrar um aluno");
			System.out.println("l - lista um aluno");
			System.out.println("p - pesquisar um aluno");
			System.out.println("s - sair");
			System.out.print(": ");
			resp = ler.next();
			if(resp.equals("c")){
				lista[contAluno] = new Aluno();
				System.out.print("Qual o nome do aluno: ");
				lista[contAluno].nome = ler.next();
				System.out.print("Qual o sobrenome: ");
				lista[contAluno].sobrenome = ler.next();
				System.out.print("Qual o e-mail do "+lista[contAluno].nome+": ");
				lista[contAluno].eMail = ler.next();
				lista[contAluno].codigo = new Random().nextInt(1000,10000);
				System.out.println("Informe as notas do "+lista[contAluno].nome);
				System.out.print("Nota um: ");
				lista[contAluno].notaUm = ler.nextFloat();
				System.out.print("Nota dois: ");
				lista[contAluno].notaDois = ler.nextFloat();
				System.out.println(lista[contAluno].nome+" cadastrado, obteve o código "+lista[contAluno].codigo);
				contAluno++;
			}
			else if(resp.equals("l")){
				for(int i=0;i<contAluno;i++){
					System.out.println("Nome: "+lista[i].nome);
					System.out.println("Sobrenome: "+lista[i].sobrenome);
					System.out.println("Média: "+lista[i].obterMedia());
					System.out.println("Status: "+lista[i].verificaStatus());
				}
			}
			else if(resp.equals("p")){
				System.out.print("Qual código do aluno: ");
				int codigo = ler.nextInt();
				//...
			}
		}
		while(!resp.equals("s"));
	}
}

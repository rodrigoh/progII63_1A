package aula19.exemploAluno;

import java.util.Random;
import java.util.Scanner;

public class TurmaLista {

	public static Aluno cadastraAluno(){
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
		return a1;
	}

	public static void mostraAluno(Aluno a1){
		System.out.println("Nome: "+a1.nome);
		System.out.println("Sobrenome: "+a1.sobrenome);
		System.out.println("Média: "+a1.obterMedia());
		System.out.println("Status: "+a1.verificaStatus());
	}
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
				lista[contAluno] = cadastraAluno();
				System.out.println(lista[contAluno].nome+" cadastrado, obteve o código "+lista[contAluno].codigo);
				contAluno++;
			}
			else if(resp.equals("l")){
				for(int i=0;i<contAluno;i++){
					mostraAluno(lista[i]);
				}
			}
			else if(resp.equals("p")){
				System.out.print("Qual código do aluno: ");
				int codigo = ler.nextInt();
				int posicao = -1;
				for(int i=0;i<contAluno;i++){
					if(codigo==lista[i].codigo){
						posicao = i;
					}
				}
				if(posicao>=0){
					mostraAluno(lista[posicao]);
				}
				else{
					System.out.println("Aluno de código "+codigo+" não existe");
				}
			}
		}
		while(!resp.equals("s"));
	}
}

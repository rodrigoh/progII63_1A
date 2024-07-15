package aula23.exemploArquivos;

import java.io.*;
import java.util.Scanner;

public class Banco {

	static File caminho = new File("./data");
	static File arquivoCC = new File(caminho,"contaCorrente.db");
	static File arquivoCP = new File(caminho,"contaPoupanca.db");

	public static void gravaContaCorrente(ContaCorrente[] lista){
		try{
			if(!caminho.exists())
				caminho.mkdirs();
			System.out.print("Tentando gravar a lista de contas corrente ");
			ObjectOutputStream objGravar =
							new ObjectOutputStream(new FileOutputStream(arquivoCC.getAbsolutePath()));
			objGravar.writeObject(lista);
			objGravar.close();
			System.out.println("[ok]");
		}
		catch (IOException e){
			System.out.println("erro ao gravar o arquivo [Fail]");
		}
	}

	public static void gravaContaPoupanca(ContaPoupanca[] lista){
		try{
			if(!caminho.exists())
				caminho.mkdirs();
			System.out.print("Tentando gravar as contas poupança no arquivo");
			ObjectOutputStream objGravar =
							new ObjectOutputStream(new FileOutputStream(arquivoCP.getAbsolutePath()));
			objGravar.writeObject(lista);
			objGravar.close();
			System.out.println("[ok]");
		}
		catch (IOException e){
			System.out.println("erro ao escrever no arquivo [Fail]");
		}
	}

	public static ContaPoupanca[] leContaPoupanca(){
		System.out.println("Tentando ler a lista de conta poupança");
		ContaPoupanca[] lista = new ContaPoupanca[200];
		try{
			ObjectInputStream objLeitura =
							new ObjectInputStream(new FileInputStream(arquivoCP.getAbsolutePath()));
			lista = (ContaPoupanca[]) objLeitura.readObject();
			System.out.println("[Ok]");
			objLeitura.close();
		}
		catch (IOException e){
			System.out.println("erro ao ler o arquivo [Fail]");
		}
		catch (ClassNotFoundException e){
			System.out.println("a classe não foi encontrada [Fail]");
		}
		return lista;
	}

	public static ContaCorrente[] leContaCorrente(){
		ContaCorrente[] lista = new ContaCorrente[200];
		try{
			System.out.print("Tentando ler o arquivo de contas ");
			ObjectInputStream objLeitura =
							new ObjectInputStream(new FileInputStream(arquivoCC.getAbsolutePath()));
			lista = (ContaCorrente[]) objLeitura.readObject();
			objLeitura.close();
			System.out.println("[ok]");
		}
		catch (IOException e){
			System.out.println("erro ao ler arquivo [Fail]");
		}
		catch (ClassNotFoundException e){
			System.out.println("classe não encontrada [Fail");
		}
		return lista;
	}

	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem);
		return ler.nextLine();
	}

	public static float leFloat(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem);
		return ler.nextFloat();
	}

	public static ContaCorrente cadastraContaCorrente(){
		String titular = leString("Nome do titular: ");
		String senha = leString("Qual a senha: ");
		float limite = leFloat("Qual o limite inicial: ");
		ContaCorrente c1 = new ContaCorrente(titular,senha,limite);
		System.out.println("Conta cadastrada com o identificador "+c1.getIdentificador());
		return c1;
	}

	public static ContaPoupanca cadastraContaPoupanca(){
		String titular = leString("Nome do titular: ");
		String senha = leString("Qual a senha: ");
		float deposito = leFloat("Qual o deposito inicial: ");
		ContaPoupanca c1 = new ContaPoupanca(titular,senha,deposito);
		System.out.println("Conta cadastrada com o identificador "+c1.getIdentificador());
		return c1;
	}

	public static ContaCorrente acessaContaCorrente(ContaCorrente c1){

		System.out.println("Acessando a conta "+c1.getIdentificador());
		String opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("d - depositar");
			System.out.println("s - sacar");
			System.out.println("v - verificar saldo");
			System.out.println("e - sair");
			opc = leString(":");
			switch (opc){
				case "d"->{
					float valor = leFloat("Qual valor depositar: ");
					c1.depositar(valor);
				}
				case "s"->{
					float valor = leFloat("Qual valor sacar: ");
					if(c1.sacar(valor)){
						System.out.println("Saque realizado");
					}
					else{
						System.out.println("Saldo insuficiente");
					}
				}
				case "v"-> System.out.println(c1.verificaSaldo());
			}
		}
		while(!opc.equals("e"));
		return c1;
	}

	public static ContaPoupanca acessaContaPoupanca(ContaPoupanca c1){
		System.out.println("Acessando a conta "+c1.getIdentificador());
		String opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("d - depositar");
			System.out.println("s - sacar");
			System.out.println("v - verificar saldo");
			System.out.println("e - sair");
			opc = leString(":");
			switch (opc){
				case "d"->{
					float valor = leFloat("Qual valor depositar: ");
					c1.depositar(valor);
				}
				case "s"->{
					float valor = leFloat("Qual valor sacar: ");
					if(c1.sacar(valor)){
						System.out.println("Saque realizado");
					}
					else{
						System.out.println("Saldo insuficiente");
					}
				}
				case "v"-> System.out.println(c1.verificaSaldo());
			}
		}
		while(!opc.equals("e"));
		return c1;
	}

	public static void main(String[] args) {
		ContaCorrente[] listaCc = leContaCorrente();
		ContaPoupanca[] listaCp = leContaPoupanca();
		int contCc = 0;
		//Contando a quantidade de contas no arquivo
		ContaCorrente c1;
		do{
			c1 = listaCc[contCc];
			if(c1!=null)
				contCc++;
		}
		while(c1!=null);
		//Contando as contas...
		int contCp = 0;
		ContaPoupanca c2;
		do{
			c2 = listaCp[contCp];
			if(c2!=null)
				contCp++;
		}
		while(c2!=null);
		String opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("cc - cadastrar uma conta corrente");
			System.out.println("cp - cadastrar uma conta poupança");
			System.out.println("ac - acessar uma conta corrente");
			System.out.println("ap - acessar uma conta poupança");
			System.out.println("e - sair");
			opc = leString(": ").toLowerCase();
			switch (opc){
				case "cc"->{
					if(contCc<listaCc.length) {
						listaCc[contCc] = cadastraContaCorrente();
						contCc++;
					}
					else{
						System.out.println("O banco está lotado");
					}
				}
				case "cp"->{
					if(contCp< listaCp.length) {
						listaCp[contCp] = cadastraContaPoupanca();
						contCp++;
					}
					else{
						System.out.println("Banco lotado");
					}
				}
				case "ac"->{
					String id = leString("Qual o identificador: ");
					String senha = leString("Qual a senha de acesso: ");
					int posicao = -1;
					for(int i=0;i<contCc;i++)
						if(listaCc[i].validaAcesso(id,senha))
							posicao = i;
					if(posicao>=0){
						listaCc[posicao] = acessaContaCorrente(listaCc[posicao]);
					}
					else{
						System.out.println("Conta ou senha incorretos");
					}
				}
				case "ap"->{
					String id = leString("Qual o identificador: ");
					String senha = leString("Qual a senha de acesso: ");
					int posicao = -1;
					for(int i=0;i<contCp;i++)
						if(listaCp[i].validaAcesso(id,senha))
							posicao = i;
					if(posicao>=0){
						listaCp[posicao] = acessaContaPoupanca(listaCp[posicao]);
					}
					else{
						System.out.println("Conta ou senha incorretos");
					}
				}
				case "e"->{
					System.out.println("Gravando dados...");
					gravaContaCorrente(listaCc);
					gravaContaPoupanca(listaCp);
				}
			}
		}
		while (!opc.equals("e"));
	}
}

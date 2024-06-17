package aula20.exemploAcesso;

import aula20.exemploConta.ContaBancaria;

public class Banco {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		//Como o atributo titular é public na classe ContaBancaria, ele pode ser
		// acessado aqui na classe Banco, lembrando que a relação entre as duas
		// classes é de "mundo". No entando os demais atributos e métodos que
		// estão sem modificador não podem ser acessados.
		c1.titular = "Pessoa";
		//O atributo saldo não pode ser acessado.
		//c1.saldo = 10;
	}


}

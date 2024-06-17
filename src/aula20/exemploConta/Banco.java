package aula20.exemploConta;


public class Banco {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		c1.nomeBanco = "Banco cimol";
		System.out.println(c1.nomeBanco);
		System.out.println(c2.nomeBanco);
		c2.nomeBanco = "Teste";
		System.out.println(c1.nomeBanco);
		System.out.println(c2.nomeBanco);
		ContaBancaria.nomeBanco = "Novo banco";

	}
}

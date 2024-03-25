package aulaSeis.vetores;

public class ExemploTres {
	public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 4, 5, 6, 7};
		String[] nomes = {"Jonas", "Ana", "Pedro", "Lucas"};

		System.out.println("Dados no vetor: ");
		for(int valor:vetor){
			System.out.print(valor+" ");
		}
		System.out.println("\nOs nomes são: ");
		for(String nome:nomes){
			System.out.print(nome+" ");
		}
	}
}

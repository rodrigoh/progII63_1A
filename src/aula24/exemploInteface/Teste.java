package aula24.exemploInteface;

public class Teste {
	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		v1.adiciona("A");
		v1.adiciona("B");
		v1.adiciona("C");
		System.out.println(v1);
		v1.remove();
		System.out.println(v1);
		System.out.println("O tamanho de v1 é "+v1.obterTamanho());
		Fila f1 = new Fila();
		f1.adiciona("A");
		f1.adiciona("B");
		f1.adiciona("C");
		f1.adiciona("D");
		System.out.println(f1);
		f1.remove();
		System.out.println(f1);
		//Para criar uma instância de uma interface, eu preciso usar o construtor
		// de uma classe que a implemente
		Lista l1 = new Vetor();
		//Na instância ficam disponíveis as ações comuns a interface e a classe
		// que a implemente. Sendo o comportamento da classe.
		l1.adiciona("Teste");
		l1.remove();
		//Este método só existe em Vetor, então não está disponível
		//l1.obterTamanho();
	}
}

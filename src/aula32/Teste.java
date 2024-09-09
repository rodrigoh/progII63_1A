package aula32;

public class Teste {
	public static void main(String[] args) {
		Lista<String> l1 = new Lista<>();
		l1.adiciona("A");
		l1.adiciona("B");
		l1.adiciona("C");
		l1.adiciona("D");
		System.out.println(l1);
		System.out.println("Obtendo o elemento da posição 2: "+l1.obterElemento(2));
		//System.out.println("Obtendo o elemento da posição -1: "+l1
		// .obterElemento(-1));
		System.out.println("Pesquisando pelo elemento 'D' na lista "+l1.posicaoDe("D"));
		System.out.println("Pesquisando pelo elemento 'd' na lista "+l1.posicaoDe("d"));
		l1.adiciona("F");
		l1.adiciona("G");
		System.out.println(l1);
		l1.adiciona(4,"E");
		System.out.println(l1);
		l1.adiciona("H");
		l1.adiciona("I");
		l1.adiciona("J");
		l1.adiciona("K");
		l1.adiciona("L");
		l1.adiciona("M");
		l1.adiciona("N");
		l1.adiciona("O");
		System.out.println(l1);
		System.out.println("Apagando o elemento da posição 2 "+l1.remove(2));
		System.out.println(l1);
	}
}

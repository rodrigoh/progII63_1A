package aula33.exemploHashSet;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<String> listaCompras = new HashSet<>();
		System.out.println(listaCompras.add("Feijão"));
		System.out.println(listaCompras.add("Arroz"));
		System.out.println(listaCompras.add("Maçã"));
		System.out.println(listaCompras.add("Farinha"));
		System.out.println(listaCompras.add("Leite"));
		System.out.println(listaCompras.add("Sal"));
		System.out.println(listaCompras.add("Arroz"));
		System.out.println(listaCompras);
	}
}

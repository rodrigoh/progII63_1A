package aula32;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		//ArrayList<Objeto> nome = new ArrayList<>(capacidade_inicial);
		ArrayList<String> l1 = new ArrayList<>(5);
		//Adicionando um elemento no final da lista
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		System.out.println(l1);
		l1.add("F");
		System.out.println(l1);
		//Adicionando um elemento a qualquer posição da lista
		l1.add(4,"E");
		System.out.println(l1);
		//Pesquisando um elemento na lista
		System.out.println("Buscando o elemento 'C' na lista "+l1.indexOf("C"));
		System.out.println("Buscando o elemento 'k' na lista "+l1.indexOf("k"));
		//Remover um elemento de uma lista pela posição
		System.out.println("Apagando o elemento da posição 2 "+l1.remove(2));
		//Remover o elemento pelo elemento (não temos)
		System.out.println("Apagando o elemento 'E' da lista "+l1.remove("E"));
		System.out.println("Apagando o elemento 'k' da lista "+l1.remove("k"));
		//Adicionando novos elementos para teste
		l1.add("C");
		l1.add("D");
		//Obtém a última posição de um elemento na lista (se não houverem
		//elementos duplicados, tem o mesmo resultado do indexOf) (não temos)
		System.out.println("A última ocorrência de 'D' na lista é "+l1.lastIndexOf("D"));
		System.out.println("A primeira ocorrência de 'D' na lista "+l1.indexOf("D"));
		//Verifica se um elemento existe
		System.out.println("O elemento 't' existe na lista? "+l1.contains("t"));
		System.out.println("O elemento 'd' existe na lista? "+l1.contains("D"));
		//Obter o tamanho da lista (não temos)
		System.out.println("A lista tem atualmente "+l1.size()+" elementos");
		//Apaga todos os elementos da lista (não temos)
		l1.clear();
		System.out.println(l1);


	}
}

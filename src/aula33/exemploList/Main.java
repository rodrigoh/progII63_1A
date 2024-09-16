package aula33.exemploList;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<>();

		listaPessoa.add(new Pessoa("Jonas","Silva",1.8f));
		listaPessoa.add(new Pessoa("Ana","Souza",1.8f));
		listaPessoa.add(new Pessoa("João","Freitas",1.7f));
		listaPessoa.add(new Pessoa("Betina","Silva",1.65f));
		System.out.println(listaPessoa);
		System.out.println("Removendo a pessoa 1 da lista "+listaPessoa.remove(1));
		Pessoa aux = new Pessoa("Jonas","Silva",1.8f);
		System.out.println("Lista contém o Jonas? "+listaPessoa.contains(aux));
		System.out.println(listaPessoa);

		ArrayList<String> lista = new ArrayList<>();
		lista.add("Jonas");
		lista.add("João");
		lista.add("Ana");
		System.out.println(lista);
		lista.sort(null);
		System.out.println(lista);
	}
}

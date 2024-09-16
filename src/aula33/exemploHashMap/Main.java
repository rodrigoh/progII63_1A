package aula33.exemploHashMap;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String,String> capitais = new HashMap<>();
		capitais.put("RS","Porto Alegre");
		capitais.put("SC","Florianopolis");
		capitais.put("DF","Brasilia");
		System.out.println(capitais);
		capitais.put("RS","Taquara");
		System.out.println(capitais);
		for(String uf:capitais.keySet())
			System.out.print(uf+" ");
		System.out.println("\nCidades:");
		for(String cidades:capitais.values())
			System.out.print(cidades+" ");

		System.out.println("\nA chave 'RS' existe no mapa "+capitais.containsKey(
						"RS"));
	}
}

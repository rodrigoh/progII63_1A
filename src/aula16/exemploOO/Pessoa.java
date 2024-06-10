package aula16.exemploOO;

class Pessoa {
	String nome;
	String sobrenome;
	int altura;

	void andar(){
		System.out.println(nome+" andando...");
	}

	void correr(){
		System.out.println(nome+ " correndo...");
	}

	void parar(){
		System.out.println(nome+" parado...");
	}

	String obterDados(){
		return "nome: "+nome+" "+sobrenome+" mede: "+altura+"cm";
	}
}

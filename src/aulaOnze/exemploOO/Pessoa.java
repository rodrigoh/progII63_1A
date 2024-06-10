package aulaOnze.exemploOO;

public class Pessoa {
	String nome;
	String sobrenome;
	int altura;
	String dataNascimento;
	int idade;

	void andar(){
		System.out.println(nome+" está andando...");
	}

	void comer(){
		System.out.println(nome+" está comendo...");
	}

	void falar(){
		System.out.println(nome+" está falando...");
	}

	void correr(float velocidade){
		System.out.println(nome+" está correndo a "+velocidade+"km/h");
	}



	String obterNome(){
		return nome+" "+sobrenome;
	}
}

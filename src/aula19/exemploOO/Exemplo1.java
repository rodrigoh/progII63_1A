package aula19.exemploOO;

public class Exemplo1 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Jonas";
		pessoa1.sobrenome = "Silva";
		pessoa1.altura = 180;
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Ana";
		pessoa2.sobrenome = "Santos";
		pessoa2.altura = 180;
		pessoa1.andar();
		pessoa2.correr();
		System.out.println(pessoa1.obterDados());
		System.out.println(pessoa2.obterDados());
		pessoa1.parar();
		pessoa2.parar();

	}
}

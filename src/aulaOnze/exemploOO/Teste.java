package aulaOnze.exemploOO;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoaUm = new Pessoa();
		Pessoa pessoaDois = new Pessoa();

		pessoaUm.nome = "Ana";
		pessoaUm.sobrenome = "Silva";
		pessoaUm.altura = 170;
		pessoaUm.dataNascimento = "20/04/2000";
		pessoaUm.idade = 24;

		pessoaDois.nome = "João";
		pessoaDois.sobrenome = "Souza";
		pessoaDois.altura = 170;
		pessoaDois.dataNascimento = "2/06/2000";
		pessoaDois.idade = 23;

		pessoaUm.andar();
		pessoaUm.correr(9);
		pessoaDois.comer();
		pessoaDois.falar();
		System.out.println(pessoaDois.obterNome());

	}
}

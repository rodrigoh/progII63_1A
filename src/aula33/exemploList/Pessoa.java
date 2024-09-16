package aula33.exemploList;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private float altura;

	public Pessoa(String nome, String sobrenome, float altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Pessoa pessoa = (Pessoa) o;
		return Float.compare(altura, pessoa.altura) == 0 && Objects.equals(nome, pessoa.nome) && Objects.equals(sobrenome, pessoa.sobrenome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sobrenome, altura);
	}

	@Override
	public String toString() {
		String resultado = "Nome: "+nome+" "+sobrenome+" mede "+altura+"m";
		return resultado;
	}
}

package aula33.exemploLocalDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;

	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	//docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	public  String getDataNascimentoFormatada(){
		DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/L/yyyy",
						new Locale("pt", "BR"));
		return formatoBr.format(dataNascimento);
	}

	public int idade(){
		Period diferenca = Period.between(dataNascimento,LocalDate.now());
		return diferenca.getYears();
	}

	@Override
	public String toString() {
		return "Nome: "+nome+" nascido em "+getDataNascimentoFormatada()+" tem "+idade()+" anos";
	}
}

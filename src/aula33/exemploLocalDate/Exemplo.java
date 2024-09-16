package aula33.exemploLocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo {
	public static LocalDate leData(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy",
						new Locale("pt", "BR"));
		LocalDate retorno = LocalDate.now();
		boolean okValida;
		do {
			try {
				System.out.println("Informe uma data (dd/mm/aaaa): ");
				String dataStr = new Scanner(System.in).next();
				retorno = LocalDate.parse(dataStr, formato);
				okValida = true;

			} catch (DateTimeParseException e) {
				System.out.println("Data inválida!");
				okValida = false;
			}
		}
		while (!okValida);

		return retorno;
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ana", LocalDate.of(2000,5,10));
		System.out.print("Qual o nome da pessoa: ");
		String nome = new Scanner(System.in).next();
		LocalDate data = leData();
		Pessoa p2 = new Pessoa(nome,data);
		System.out.println(p1);
		System.out.println(p2);

	}
}

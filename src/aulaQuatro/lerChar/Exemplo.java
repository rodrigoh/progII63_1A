package aulaQuatro.lerChar;

import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		char letra = ler.next().charAt(0);
		//Converte tudo para minúsculo
		String mes = ler.next().toLowerCase();
		//Converte tudo para maiúsculo
		mes = mes.toUpperCase();
		//Retorna o tamanho de uma String
		int tamanho = mes.length();
	}
}

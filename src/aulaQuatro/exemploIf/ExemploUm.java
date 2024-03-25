package aulaQuatro.exemploIf;

import java.util.Scanner;
public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma nota: ");
		int nota = ler.nextInt();
		//
		if(nota>=0 && nota<=10){
			System.out.println("Nota válida");
		}
		else{
			System.out.println("Nota inválida");
		}
	}
}

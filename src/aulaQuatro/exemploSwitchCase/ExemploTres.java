package aulaQuatro.exemploSwitchCase;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu perfil de usuário: ");
		String perfil = ler.next();
		switch (perfil){
			case "admin"-> System.out.println("Perfil de administrador");
			case "usuario"-> System.out.println("Perfil de usuário");
			//Opcional
			default -> System.out.println("Perfil de visitante");
		}
	}
}

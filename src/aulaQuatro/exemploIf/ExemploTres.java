package aulaQuatro.exemploIf;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu perfil de usuário: ");
		String perfil = ler.next();
		if(perfil.equals("admin")){
			System.out.println("Perfil de administrador");
		}
		else if(perfil.equals("usuario")){
			System.out.println("Perfil de usuário do sistema");
		}
		else{
			System.out.println("Perfil de visitante");
		}
	}
}

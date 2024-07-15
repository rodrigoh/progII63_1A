package aula24.exemploJavaDoc;

public class Teste {
	public static void main(String[] args){
		Operacoes op = new Operacoes();
		try {
			System.out.println(op.divide(5, 0));
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
	}
}

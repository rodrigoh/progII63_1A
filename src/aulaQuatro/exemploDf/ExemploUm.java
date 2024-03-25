package aulaQuatro.exemploDf;


import java.text.DecimalFormat;

public class ExemploUm {
	public static void main(String[] args) {
		double numero = 3243243.5678;
		double numeroDois = 45.23;
		//# -> representa um número opcional.
		//, -> representa o separador de milhar.
		//0 -> representa um número obrigatório.
		//. -> representa o separador decimal.
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println(df.format(numero));
		System.out.println(df.format(numeroDois));
		String valorFormatado = String.format("R$ %.2f", numero);
		System.out.println("O valor formatado é "+valorFormatado);
		System.out.println("O valor formatado é "+String.format("R$ %.2f",numero));
	}
}

package aulaNove;

import java.util.Scanner;

/*
Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes
de uma equação do segundo grau e retorne o valor do delta, que é dado por
'b² - 4ac' função que verifica se existem raízes reais.
Criar outra função calculaX, para calcular os resultados da equação
Usando as 2 funções acima, crie um aplicativo que calcula as raízes de
uma equação do 2o grau: ax² + bx + c=0
Para ela existir, o coeficiente 'a' deve ser diferente de zero.
Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o
delta seja negativo, as reais serão complexas, apenas informe que não
existem raízes racionais

Math.sqrt(25);
 */
public class Exercicio1 {
	static float calculaDelta(float a, float b, float c){
		float resultado = b*b-4*a*c;
		return resultado;
	}

	static float calculaX(float a, float b, float d, char op){
		float x;
		if(op=='+'){
			x = (-b+(float)Math.sqrt(d))/(2*a);
		}
		else{
			x = (-b-(float)Math.sqrt(d))/(2*a);
		}
		return x;
	}

	static float[] calculaX(float a, float b, float d){
		float[] x = new float[2];
		x[0] = (-b+(float)Math.sqrt(d))/(2*a);
		x[1] = (-b-(float)Math.sqrt(d))/(2*a);
		return x;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Dada a equação ax² + bx + c = 0, informe:");
		System.out.print("a: ");
		float a = ler.nextFloat();
		System.out.print("b: ");
		float b = ler.nextFloat();
		System.out.print("c: ");
		float c = ler.nextFloat();
		float d = calculaDelta(a,b,c);
		if(d>=0){
//			float x1 = calculaX(a,b,d,'+');
//			float x2 = calculaX(a,b,d,'-');
			float[] retorno = calculaX(a,b,d);
			System.out.println("As raízes da equação são: ");
			System.out.printf("x' = %.2f ",retorno[0]);
			System.out.printf("x'' = %.2f ",retorno[1]);
		}
		else{
			System.out.println("A equação não possui raízes no conjunto dos reais");
		}
	}
}

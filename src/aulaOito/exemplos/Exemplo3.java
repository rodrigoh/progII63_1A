package aulaOito.exemplos;

public class Exemplo3 {
	static int soma(int[] vetor){
		int soma = 0;
		for(int i=0;i<vetor.length;i++){
			soma+=vetor[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		int[] vetor = {1,3,8,7,9,10,-1};
		int s = soma(vetor);
		System.out.printf("A soma dos elementos do vetor vale %d",s);

	}
}

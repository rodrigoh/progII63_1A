package aulaOito.exemplos;

import java.util.Random;

public class Exemplo4 {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		geraVetor(vetor);
		for(int i=0;i<10;i++){
			System.out.printf("%d ", vetor[i]);
		}
	}

	public static void geraVetor(int[] lista){
		Random aleatorio = new Random();
		for(int i=0;i< lista.length;i++){
			lista[i] = aleatorio.nextInt(100);
		}
	}
}

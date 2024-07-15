package aula24.exemploInteface;

public class Vetor implements Lista{
	private String[] elementos;
	private int tamanho;

	public Vetor(){
		tamanho = 0;
		elementos = new String[10];
	}

	@Override
	public void adiciona(String elemento) {
		elementos[tamanho] = elemento;
		tamanho++;

	}

	@Override
	public void remove() {
		if(tamanho>0)
			tamanho--;
	}

	public int obterTamanho(){
		return tamanho;
	}
	//[a, b, c, d]
	@Override
	public String toString(){
		String retorno = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++){
				retorno+=elementos[i]+", ";
			}
			retorno+=elementos[tamanho-1];
		}
		retorno+="]";
		return retorno;
	}
}

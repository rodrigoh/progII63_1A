package aula32;


public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	/**
	 * Inicializa uma lista com capacidade elementos
	 * @param capacidade capacidade inicial
	 */
	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	/**
	 * Inicializa uma lista com capacidade de 10 elementos
	 */
	public Lista(){
		elementos = (T[]) new Object[10];
		tamanho = 0;
	}

	private void aumentaCapacidade(){
		if(tamanho==elementos.length){
			T[] aux = (T[]) new Object[tamanho*2];
			for(int i=0;i<tamanho;i++)
				aux[i] = elementos[i];
			elementos = aux;
		}
	}

	/**
	 * Adiciona um elemento no final da lista
	 * @param elemento elemento que será adicionado
	 */
	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho++] = elemento;
	}

	/**
	 * Permite adicionar um novo elemento em qualquer posição da lista
	 * @param posicao posição onde será adicionado o elemento
	 * @param elemento elemento que será adicionado
	 * @throws IllegalArgumentException caso a posição seja inválida
	 */
	public void adiciona(int posicao, T elemento){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("Posição inválida");
		aumentaCapacidade();
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	/**
	 * Obtém um elemento de determinada posição da lista
	 * @param posicao posição desejada
	 * @return o elemento presente na posição
	 * @throws IllegalArgumentException caso a posição seja inválida
	 */
	public T obterElemento(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("Posição inválida");
		return elementos[posicao];
	}

	/**
	 * Obtém a posição de um elemento na lista
	 * @param elemento que está buscando
	 * @return a posição do elemento na lista ou -1 caso não encontre
	 */
	public int posicaoDe(T elemento){
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				return i;
		return -1;
	}

	/**
	 * Remove um elemento pela posição na lista
	 * @param posicao do elemento que deseja remover
	 * @return o elemento removido
	 * @throws IllegalArgumentException caso a posição seja inválida
	 */
	public T remove(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("Posição inválida");
		T copia = elementos[posicao];
		for(int i=posicao;i<tamanho-1;i++)
			elementos[i] = elementos[i+1];
		tamanho--;
		return copia;
	}

	/**
	 * Monta uma String com o conteúdo da lista
	 * @return um conjunto vazio [], caso o tamanho seja 0 ou um conjunto com
	 * os 'n' elementos da lista em caso de tamanho > 0
	 */
	@Override
	public String toString(){
		String resultado = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++){
				resultado+=elementos[i]+", ";
			}
			resultado+=elementos[tamanho-1];
		}
		resultado+="]";
		return resultado;
	}
}

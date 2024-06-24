package aula21.exemploFinal;

public class Operacoes {
	//Atributo final, ele precisa ter um valor até o final do construtor e não
	// poderá ser alterado
	public final double pi;
	//Constante PI, ela é estática e pública, além de final e precisa ser
	// inicializada no momento da declaração
	public static final double PI = 3.141592653589793;
	//A variável final precisa ser inicializada até o final do construtor
	public Operacoes(){
		pi = 3.141592653589793;
	}
}

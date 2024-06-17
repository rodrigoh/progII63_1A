package aula20.exemploStatic;

public class Operacoes {
	static float soma(int n1, int n2){
		return n1+n2;
	}

	static float pot(float base, float exp){
		int pot = 1;
		for(int i=0;i<=exp;i++){
			pot*=base;
		}
		return pot;
	}
}

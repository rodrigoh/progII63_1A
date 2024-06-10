package aulaOnze.exemploLampada;

public class Lampada {
	String modelo;
	String marca;
	String cor;
	String local;
	boolean estaLigada;

	void ligar(){
		estaLigada = true;
	}

	void desligar(){
		estaLigada = false;
	}

//	boolean estaLigada(){
//		return estaLigada;
//	}

	String estaLigada(){
		return estaLigada?"sim":"não";
	}

	String obterDados(){
		return "Modelo: "+modelo+"\nMarca: "+marca+"\nLocalização: "+local+"\nEst" +
						"á ligada? "+estaLigada();
	}
}

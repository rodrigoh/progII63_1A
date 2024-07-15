package aula23.exemploAbstrata;

public abstract class Figura {
	private String nomeFingura;

	public String getNomeFingura() {
		return nomeFingura;
	}

	public void setNomeFingura(String nomeFingura) {
		this.nomeFingura = nomeFingura;
	}

	public abstract double calculaArea();
	public abstract double calculaPerimetro();

}

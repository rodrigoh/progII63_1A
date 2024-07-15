package aula24.exemploAbstrata;

public abstract class Figura {

	private String nomeFigura;

	public abstract double calculaArea();

	public abstract double calculaPerimetro();

	public String getNomeFigura() {
		return nomeFigura;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
}

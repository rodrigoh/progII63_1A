package aula19.exemploConta;

public class Conta {
	String titular;
	String identificador;
	float saldo;

	public Conta(){

	}
	
	public Conta(String titular, String identificador, float deposito){
		this.titular = titular;
		this.identificador = identificador;
		this.saldo = deposito;

	}

	Conta(String titular, String identificador){
		this.titular = titular;
		this.identificador = identificador;
	}

	void depositar(float saldo){
		this.saldo+=saldo;
	}

	boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		return String.format("Seu saldo é de R$%.2f",saldo);
	}
}

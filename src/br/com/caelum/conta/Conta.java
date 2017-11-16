package br.com.caelum.conta;

public class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double deposita(double valor) {
		return this.saldo += valor;
	}
	
	public double saca(double valor) {
		return this.saldo -= valor;
	}
	
	public double atualiza(double taxa) {
		return this.saldo += this.saldo * taxa;
	}
}

package br.com.caelum.conta;

public class ContaPoupanca extends Conta{

	public double atualiza(double taxa) {
		return saldo += saldo * (taxa * 3);
	}
	
	public double deposita(double valor) {
		return saldo += valor - 0.1;
	}
}

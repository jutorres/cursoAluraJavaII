package br.com.caelum.conta;

public class ContaCorrente extends Conta{
	
	public double atualiza(double taxa) {
		return saldo += saldo * (taxa * 2);
	}

}

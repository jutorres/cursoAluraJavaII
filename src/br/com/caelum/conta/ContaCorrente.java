package br.com.caelum.conta;

public class ContaCorrente extends Conta{
	
	@Override
	public double atualiza(double taxa) {
		return super.atualiza(taxa * 2);
	}

}

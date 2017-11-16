package br.com.caelum.conta;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		conta.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(conta);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
	}
	
}

package br.com.caelum.conta;

public class Main {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000.567);

		System.out.printf("O saldo é: %.2f", cc.getSaldo());
	}

}

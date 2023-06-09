package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
	
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22,33);
		guardador.adiciona(cc);
		
		Conta c1 = new ContaCorrente(22,33);
		guardador.adiciona(c1);
		
		
		int tamanho = guardador.getQantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		
		System.out.println(ref.getNumero());
	}
}

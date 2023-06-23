package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
		
		
		Conta[] contas2 = new Conta[5];
		Object[] contas3 = new Object[5];
		
		System.out.println(contas3.length);
		
		ContaCorrente c1 = new ContaCorrente(22, 33);
		ContaCorrente c2 = new ContaCorrente(44, 55);
		ContaPoupanca c3 = new ContaPoupanca(66, 77);
		
		contas2[0] = c1;
		contas2[1] = c2;
		contas2[2] = c3;
		contas3[0] = c1;
		
		
		/**
		 * compilador olha para o tipo do objeto contas2,
		 * ve que ele é do tipo Conta, ou seja, pode ser
		 * conta corrente ou conta poupança, por isso é preciso 
		 * usar o Cast: tranforma uma referência do tipo mais
		 * generico para o tipo mais específico
		 */
		ContaPoupanca ref = (ContaPoupanca)contas2[2]; //type cast
		Object referenciaGenerica = contas3[0];
//		ContaCorrente ref2 = (ContaCorrente)contas2[2]; //apontando para outro tipo
//		
//		System.out.println(ref2.getNumero());
		
		System.out.println(((ContaCorrente) referenciaGenerica).getNumero()); //funcionará apenas caso haja o cast na referencia
		
		System.out.println(ref.getNumero());
		System.out.println(contas2[0]);
		System.out.println(contas2[1]);
	}
}

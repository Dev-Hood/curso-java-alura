package br.com.bytebank.banco.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
//		Conta cc = new ContaCorrente(22,33);
//		Conta c2 = new ContaCorrente(22,33);
//		
//		System.out.println(cc.eIgual(c2));
		
		//== compara as referencias
		
		
		//generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(22,33);
		
		lista.add(cc);
		
		Conta c1 = new ContaCorrente(22,44);
		lista.add(c1);
		
		Conta c2 = new ContaCorrente(22,44);
		System.out.println(lista.contains(c2));
		
		for(Conta o : lista) {
			System.out.println(o);
		}
		
		
		
	}

}

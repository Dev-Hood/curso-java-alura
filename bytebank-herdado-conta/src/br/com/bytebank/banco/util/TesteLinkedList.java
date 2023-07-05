package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

public static void main(String[] args) {
		

		List<Conta> lista = new LinkedList<Conta>();
		
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

package br.com.bytebank.banco.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteUtil {

	public static void main(String[] args) {
		
		//generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22,33);
		
		lista.add(cc);
		
		Conta c1 = new ContaCorrente(22,44);
		lista.add(c1);
		Conta c2 = new ContaCorrente(22,55);
		lista.add(c2);
		
		Conta c3 = new ContaCorrente(22,66);
		lista.add(c3);
		
		//System.out.println((Conta)lista.remove(0));
		System.out.println(lista.subList(0, 2));
		
		
		System.out.println(lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("------------------------------");
		
		for(Conta o : lista) {
			System.out.println(o);
		}
	}

}

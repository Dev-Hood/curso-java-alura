package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] idades = new int[10];
		String[] nomes = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29); //cria uma referencia(obejeto) com o valor da referencia
		System.out.println(idadeRef.intValue());// pega o valor que está dentro da referencia
		System.out.println(idadeRef);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);            
	}

}

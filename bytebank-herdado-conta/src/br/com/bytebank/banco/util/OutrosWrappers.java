package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class OutrosWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(59);
		System.out.println(idadeRef.intValue());
		
		
		Double dref = Double.valueOf(3.2);
		System.out.println(dref.doubleValue());
		
		//Lista que guarda todo tipo de número:
		List<Number> lista = new ArrayList<>();
		lista.add(4);
		System.out.println(lista);
	}

}

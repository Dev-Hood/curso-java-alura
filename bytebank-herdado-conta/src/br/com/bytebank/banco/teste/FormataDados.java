package br.com.bytebank.banco.teste;

public class FormataDados {

	public static void main(String[] args) {
		
		
		System.out.println(formataDados("333.222.111-82"));
		
		
	}
	
	/**
	 * esse método usa um regex que representa tudo que não é número, ou seja,
	 * o método irá sustituir tudo que não é número por nada.
	 * @param dado
	 * @return
	 */
	public static String formataDados(String dado){
		 return dado.replaceAll("[^0-9]+", "");
	}

}

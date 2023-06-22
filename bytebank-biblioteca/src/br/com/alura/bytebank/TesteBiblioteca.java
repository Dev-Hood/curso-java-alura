package br.com.alura.bytebank;
import br.com.bytebank.banco.modelo.*;

public class TesteBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta cc = new ContaCorrente(123, 321);
		
		cc.deposita(200);
		
		System.out.println(cc.getSaldo());
	}

}

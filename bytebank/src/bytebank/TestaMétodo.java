package bytebank;

public class TestaMétodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		
		System.out.println(conta.saldo);
	}
	
	

}

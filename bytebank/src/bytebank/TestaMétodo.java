package bytebank;

public class TestaMétodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		conta.saca(20);
		System.out.println(conta.saldo);
		
		
		
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.deposita(1000);
		if(contaDaMarcela.transfere(3000, conta)) {
			System.out.println("transferencia com suceso");
			System.out.println(contaDaMarcela.saldo);
		}else {
			System.out.println("falta dim dim");
		}
		
	}
	
	
	

}

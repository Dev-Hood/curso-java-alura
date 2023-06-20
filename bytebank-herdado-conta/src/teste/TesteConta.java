package teste;
public class TesteConta {

	public static void main(String[] args)throws modelo.SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
		modelo.ContaCorrente outra = null;
		outra.deposita(200);
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 111);
		cc.deposita(100.00);
		
		modelo.ContaPoupanca cp  =  new modelo.ContaPoupanca(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.00, cp);
		
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP> "+ cp.getSaldo());
	}

}

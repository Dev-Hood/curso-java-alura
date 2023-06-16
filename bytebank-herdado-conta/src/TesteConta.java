
public class TesteConta {

	public static void main(String[] args)throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
		ContaCorrente outra = null;
		outra.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.00);
		
		ContaPoupanca cp  =  new ContaPoupanca(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.00, cp);
		
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP> "+ cp.getSaldo());
	}

}

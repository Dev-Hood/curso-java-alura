package byte_bank_composto;

public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.getSaldo());
	}
}

package byte_bank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silva";
		paulo.profissao = "Programador";
		paulo.cpf = "222222222";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
	}
}

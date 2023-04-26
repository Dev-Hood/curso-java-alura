package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 300;
		
		System.out.println(primeiraconta.saldo);
		
		Conta segundaConta = primeiraconta;
		// não passa o valor
		// passa somente o ponteiro para o mesmo lugar de onde primeiraconta está apontando
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo+=100;
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraconta.saldo);
		
		if (primeiraconta == segundaConta) {
			System.out.println("São a mesmissima coisa");
		}
		
		
		
	}
	
	
}

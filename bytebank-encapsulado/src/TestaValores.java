
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);

		conta.setAgencia(-12);
		conta.setNumero(-2);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337,2400);
		Conta conta3 = new Conta(1337,2400);
		
		System.out.println(Conta.getTotal());
		
	}
}

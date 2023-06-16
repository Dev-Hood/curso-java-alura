
public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel g2 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Tallys");
		g1.setCpf("1111");
		g1.setSalario(10000);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		boolean autenticou = g1.autentica(2222);

		System.out.println(autenticou);

		g1.setSenha(2222);
		autenticou = g1.autentica(2222);

		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao()); 
	}
}


public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente funcionario = new Gerente();
		funcionario.setNome("Tallys");
		funcionario.setSalario(1000);
		funcionario.setCpf("111111");
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
}

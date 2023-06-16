

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {	
		System.out.println("Método do gerente");
		return (super.getSalario()); // super faz referencia à classe pai
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	
	
	
}

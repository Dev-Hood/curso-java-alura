
public class Administrados extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Administrados() {
		this.autenticador = new AutenticacaoUtil();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
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


public class AutenticacaoUtil {
	
	private int senha;

	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		else
			return false;
	}

	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	

}

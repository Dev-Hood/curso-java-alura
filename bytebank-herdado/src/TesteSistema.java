
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrados ad = new Administrados();
		ad.setSenha(333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(222);
		
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(ad);
		si.autentica(cliente);
	}
}

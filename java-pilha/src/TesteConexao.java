
public class TesteConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//-------------------------------------------------------
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
			
		}catch(IllegalStateException ex) {
			System.out.println("Errooo");
		}finally {
			con.fecha();
		}
	}

}

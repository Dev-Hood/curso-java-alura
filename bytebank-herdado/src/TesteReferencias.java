
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario g1 = new Gerente();
		g1.setNome("Taulo");
		g1.setSalario(5000);
		System.out.println(g1.getBonificacao());
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Designer d = new Designer();
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());
				
	}

}

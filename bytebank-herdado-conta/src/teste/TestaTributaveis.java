package teste;
public class TestaTributaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modelo.ContaCorrente cc = new modelo.ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		modelo.SeguroDeVida seguro = new modelo.SeguroDeVida();
		
		modelo.CalculadorImposto calc = new modelo.CalculadorImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	}

}

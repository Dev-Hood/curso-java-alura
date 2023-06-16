package byte_bank_composto;

public class Conta {
	private double saldo;
	//atributos privados só podem ser lidos e manipulados pelas classes de origem
	int agencia;
	int numero;
	Cliente titular;
	
	void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	} 
	
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
}
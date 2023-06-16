

public class Conta {
	private double saldo;
	//atributos privados só podem ser lidos e manipulados pelas classes de origem
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static significa que o total é da classe 
	// ou seja, sem static cada atributo pertence ao objeto, com static o atributo é global, pertence à classe
	// é global, podendo até fazer Conta.total = 3, pois o total é da classe
	
	
	public Conta(int agencia, int numero) {
		total ++;
		System.out.println("total de contas é: "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta");
	}
	
	{
		System.out.println("contrutor sem nome");
		// esse tipo de construtor é executado primeiro que o contrutor com nome da classe
	}
	
	
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
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero<=0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia<=0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}


}



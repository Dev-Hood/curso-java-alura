package br.com.bytebank.banco.modelo;




/**
 * Classe representa a moldura de uma conta
 * 
 * @author tallys.cordeiro
 *
 */

public abstract class Conta {
	protected double saldo;
	//atributos privados só podem ser lidos e manipulados pelas classes de origem
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static significa que o total é da classe 
	// ou seja, sem static cada atributo pertence ao objeto, com static o atributo é global, pertence à classe
	// é global, podendo até fazer Conta.total = 3, pois o total é da classe
	
	
/**
 * Contrutor para inicializar conta, precisa de agencia e numero	
 * @param agencia
 * @param numero
 */
	public Conta(int agencia, int numero) {
		total ++;
		//System.out.println("total de contas é: "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta");
	}
	
	public abstract void deposita (double valor);
	
	public void saca (double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+ this.saldo +", Valor: "+valor);
		}
		this.saldo -= valor;	
	} 
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
			this.saca(valor);
			destino.deposita(valor);
			
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero:" + this.numero; 
	}

}



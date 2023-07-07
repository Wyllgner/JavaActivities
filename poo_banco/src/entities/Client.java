package entities;

public class Client {
	private int conta;
	private String nome;
	private double saldo;
	
	public Client(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public Client(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor){
		saldo += valor;
	}
	

	public void saque(double valor){
		saldo -=  valor + 5.00;
	}
	
	public String toString() {
		return "Conta: "
				+ conta 
				+ ", Nome: " 
				+ nome
				+", Saldo: "
				+String.format("%.2f", saldo); 
	}
	
}


package mz.co.devtec.cpoo.entidade.aula04.exercicio;

public class Conta {
	
	private int numeroDaConta;
	private String titular;
	private double saldo;
	
	public void deposita(Double valorPorDepositar) {
		
		saldo +=valorPorDepositar;
	}
	
	public void levantar(double valorDesejado) {
		saldo =  saldo - (valorDesejado + 7.00);
	}
	
	
	public Conta(int numreDaConta, String titular) {
		this.numeroDaConta = numreDaConta;
		this.titular = titular;
	}

	public Conta(int numreDaConta, String titular, double depositoDeAbertura) {
		this.numeroDaConta = numreDaConta;
		this.titular = titular;
		deposita(depositoDeAbertura);
	}
	
	@Override
	public String toString() {
		return "A conta com numero " + numeroDaConta + ", pertencente a " + titular + ", dispoe de " + saldo + " MYN de saldo no momento";
	}

	public int getNumreDaConta() {
		return numeroDaConta;
	}

	public void setNumreDaConta(int numreDaConta) {
		this.numeroDaConta = numreDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	

}

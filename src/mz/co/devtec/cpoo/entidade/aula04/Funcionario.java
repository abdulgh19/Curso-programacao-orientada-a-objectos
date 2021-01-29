package mz.co.devtec.cpoo.entidade.aula04;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	@Override
	public String toString() {
		return "Funcionario [nome= " + nome + ", salario= " + salario + "]";
	}
	
	private void pedirFerias() {
		System.out.println("Estoupedir ferias!");
	}
	
	public void qualquerUmmPodePedirFerias() {
		pedirFerias();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}

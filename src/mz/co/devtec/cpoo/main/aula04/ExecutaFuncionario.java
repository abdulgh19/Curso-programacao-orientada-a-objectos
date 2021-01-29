package mz.co.devtec.cpoo.main.aula04;

import mz.co.devtec.cpoo.entidade.aula04.Funcionario;

public class ExecutaFuncionario {

	public static void main(String[] args) {


		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("fulano");
		
		funcionario.setSalario(545.76);
		
		//funcionario.salario = 4500.00;
		
		//System.out.println(funcionario);
		
		System.out.println(funcionario.getNome());
		
	
		
		//funcionario.qualquerUmmPodePedirFerias();
	}

}

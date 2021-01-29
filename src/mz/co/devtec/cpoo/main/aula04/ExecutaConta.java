package mz.co.devtec.cpoo.main.aula04;

import java.util.Scanner;

import mz.co.devtec.cpoo.entidade.aula04.exercicio.Conta;

public class ExecutaConta {

	public static void main(String[] args) {
		
		Scanner entradaPOrTeclado = new Scanner(System.in);
		
		Conta conta;
			
		System.out.println("Informe o numero de conta: ");
		int numCon = entradaPOrTeclado.nextInt();
		
		entradaPOrTeclado.nextLine();
		
		System.out.println("Informe o titular da conta: ");
		String tit = entradaPOrTeclado.nextLine();
		
		System.out.println("Pretende fazer um deposito inicial agora (S/N)? ");
		char decisao = entradaPOrTeclado.next().charAt(0);
		
		if (decisao == 'S' || decisao == 's') {
			
			System.out.println("Informe o valor inicial para a conta: ");
			
			double valorDep = entradaPOrTeclado.nextDouble();
			
			conta = new Conta(numCon, tit, valorDep);
			
			
		} else {
			
			conta = new Conta(numCon, tit);
		}
		
		System.out.println();		
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println("Informe o valor que pretende depositar: ");
		
		double valorDep = entradaPOrTeclado.nextDouble();
		
		conta.deposita(valorDep);
		
		System.out.println();		
		System.out.println("Situação actual da conta: ");
		System.out.println(conta);
		
		System.out.println("Informe o valor que pretende levantar:");
		double valLev = entradaPOrTeclado.nextDouble();
		
		conta.levantar(valLev);
		
		System.out.println();		
		System.out.println("Situação actual da conta: ");
		System.out.println(conta);		
		
		entradaPOrTeclado.close();

	}

}

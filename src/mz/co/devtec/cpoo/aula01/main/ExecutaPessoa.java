package mz.co.devtec.cpoo.aula01.main;

import java.util.Scanner;

import mz.co.devtec.cpoo.aula01.entidade.Pessoa;

public class ExecutaPessoa {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);

		Pessoa p = new Pessoa();
		
		Pessoa p2 = new Pessoa();
		
		p.nome = entradaPorTeclado.nextLine();
		
		p.altura = entradaPorTeclado.nextDouble();
		
	
		p2.indade = entradaPorTeclado.nextInt();
		
		System.out.println("Nome da Albertina" + p.nome);
		
		
		System.out.println("Digite o nome");
		
		
		
		
		
		
		
		
		
		
		entradaPorTeclado.close();
		
		

	}

}

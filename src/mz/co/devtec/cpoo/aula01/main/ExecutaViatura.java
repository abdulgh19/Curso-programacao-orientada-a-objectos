package mz.co.devtec.cpoo.aula01.main;

import java.util.Scanner;

import mz.co.devtec.cpoo.aula01.entidade.Viatura;

public class ExecutaViatura {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		Viatura v1 = new Viatura();
		Viatura v2 = new Viatura();

// Dados da Viatura 1
		System.out.println("Digite a marca da viatura!");
		v1.marca = entradaPorTeclado.nextLine();
		
		System.out.println("Digite o modelo da viatura!");
		v1.modelo = entradaPorTeclado.nextLine();
		
		System.out.println("Digite o ano de fabrico da viatura!");
		v1.anoFabrico = entradaPorTeclado.nextInt();
		
		System.out.println("Digite o total de assentos!");
		v1.numeroDeAssentos = entradaPorTeclado.nextInt();
		
		System.out.println("Digite a kilometragem percorrida pela viatura");
		v1.kilometrosPercorridos = entradaPorTeclado.nextDouble();
		
// Dados da Viatura 2
		entradaPorTeclado.nextLine();	//Para consumir a quebra de linha
		System.out.println("Digite a marca da viatura!");
		v2.marca = entradaPorTeclado.nextLine();
		
		System.out.println("Digite o modelo da viatura!");
		v2.modelo = entradaPorTeclado.nextLine();
		
		System.out.println("Digite o ano de fabrico da viatura!");
		v2.anoFabrico = entradaPorTeclado.nextInt();
		
		System.out.println("Digite o total de assentos!");
		v2.numeroDeAssentos = entradaPorTeclado.nextInt();
		
		System.out.println("Digite a kilometragem percorrida pela viatura");
		v2.kilometrosPercorridos = entradaPorTeclado.nextDouble();
		
// Saida da viatura 1		
		System.out.println();
		System.out.println("----- Dados da Viatura -----");
		System.out.println("Marca: " +v1.marca);
		System.out.println("Modelo: " +v1.modelo);
		System.out.println("Ano de fabrico: " +v1.anoFabrico);
		System.out.println("Numero de assentos: " +v1.numeroDeAssentos);
		System.out.println("Distancia percorrida: " +v1.kilometrosPercorridos);
		
// Saida da viatura 2
		System.out.println();
		System.out.println("----- Dados da Viatura -----");
		System.out.println("Marca: " +v2.marca);
		System.out.println("Modelo: " +v2.modelo);
		System.out.println("Ano de fabrico: " +v2.anoFabrico);
		System.out.println("Numero de assentos: " +v2.numeroDeAssentos);
		System.out.println("Distancia percorrida: " +v2.kilometrosPercorridos);
				
		entradaPorTeclado.close();
		

	}

}

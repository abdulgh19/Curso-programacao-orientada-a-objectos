package mz.co.devtec.cpoo.aula02.main;

import java.util.Scanner;

import mz.co.devtec.cpoo.aula02.entidade.Produto;
public class ExecutaProduto {
	public static void main(String[] args) {		
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		Produto p = new Produto();	
		
		double quantidadeAdicionada;
		
		mostraCabecalho();			
		
		System.out.println("Informe o codigo do produto:");
		p.codigo = entradaPorTeclado.nextLine();	
		
		System.out.println("Informe a designacao do produto:");
		p.designacao = entradaPorTeclado.nextLine();	
		
		System.out.println("Informe a quantidade inicial do produto em Stock:");
		p.quantidadeEmStock = entradaPorTeclado.nextDouble();
		
		System.out.println("Informe o preco pelo qual o produto foi comprado:");
		p.precoDeCompra = entradaPorTeclado.nextDouble();	
		
		System.out.println("Por quanto o produto vai ser vendido?");
		p.precoVenda = entradaPorTeclado.nextDouble();				
		
		System.out.println("# ---------- Supermercado Devtec ---------- #");
		System.out.println();
		System.out.println("Relatorio de produto");
		System.out.println();
		System.out.println(p.codigo +", " + p.designacao +", " +p.precoDeCompra +", " +p.quantidadeEmStock + ", " +p.precoVenda);
		System.out.println();	
		
		System.out.println("Quantos produtos deseja adicionar ao Stock?");	
		quantidadeAdicionada = entradaPorTeclado.nextDouble();	
		
		p.adicionarProdutos(quantidadeAdicionada);		
		System.out.println("Temos " +p.quantidadeEmStock +" " +p.designacao +" no stock cuja a venda equivale a "+ +p.totalEquivalenteNoStock() + " MZN");		
		
		mostraRodape();	
		
		entradaPorTeclado.close();
	}
	
	static void mostraCabecalho() {
		
		System.out.println("# ---------- Supermercado Devtec ---------- #");
		System.out.println("-- Tela de Registo de Produtos Devtec -------");
		System.out.println();
		
	}
	
	static void mostraRodape() {
		
		System.out.println();
		System.out.println("# ---------- devtec.co.mz ---------- #");
		System.out.println("# ---------- 2020 - 2021 ---------- #");

	}
	
}

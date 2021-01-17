package mz.co.devtec.cpoo.aula02.main.exercicio;

import java.util.Scanner;

import mz.co.devtec.cpoo.aula02.entidade.exercicio.Rectangulo;

public class ExecutaRectangulo {
	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);

		Rectangulo rectangulo = new Rectangulo();

		Rectangulo rectangulo2 = new Rectangulo();

		Rectangulo.tipoFigura = "Milenium BIM";

		Rectangulo.tipoFigura = "Geometrica";

		System.out.println("o valor da base:");
		rectangulo.base = entradaPorTeclado.nextDouble();

		System.out.println("o valor da altura");
		rectangulo.altura = entradaPorTeclado.nextDouble();

		System.out.println();

		System.out.println("o valor da base:");
		rectangulo2.base = entradaPorTeclado.nextDouble();

		System.out.println("o valor da altura");
		rectangulo2.altura = entradaPorTeclado.nextDouble();

		/*
		 * System.out.println("informe o novo tipo de figura geometrica"); String novo =
		 * entradaPorTeclado.nextLine(); Rectangulo.novoTipoFigura(novo);
		 */
		System.out.println(rectangulo);
		System.out.println("BAnco" + rectangulo.tipoFigura);

		System.out.println(rectangulo2);
		System.out.println("Banco" + rectangulo2.tipoFigura);

		entradaPorTeclado.close();
	}

}

import java.util.Scanner;

public class VariasViaturas {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);

		String marca1, marca2, modelo1, modelo2;
		int anoFabrico1, anoFabrico2, numeroDeAssentos1, numeroDeAssentos2;
		double kilometrosPercorridos1, kilometrosPercorridos2;

// Dados da Viatura 1
		System.out.println();
		System.out.println("Digite a marca da viatura 1!");
		marca1 = entradaPorTeclado.nextLine();

		System.out.println("Digite o modelo da viatura 1!");
		modelo1 = entradaPorTeclado.nextLine();

		System.out.println("Digite o ano de fabrico da viatura 1!");
		anoFabrico1 = entradaPorTeclado.nextInt();

		System.out.println("Digite o total de assentos da viatura 1!");
		numeroDeAssentos1 = entradaPorTeclado.nextInt();

		System.out.println("Digite a kilometragem percorrida pela viatura 1");
		kilometrosPercorridos1 = entradaPorTeclado.nextDouble();

// Dados da Viatura 2
		entradaPorTeclado.nextLine();	//Para consumir a quebra de linha
		System.out.println("Digite a marca da viatura 2!");
		marca2 = entradaPorTeclado.nextLine();

		System.out.println("Digite o modelo da viatura 2!");
		modelo2 = entradaPorTeclado.nextLine();

		System.out.println("Digite o ano de fabrico da viatura 2!");
		anoFabrico2 = entradaPorTeclado.nextInt();

		System.out.println("Digite o total de assentos da viatura 2!");
		numeroDeAssentos2 = entradaPorTeclado.nextInt();

		System.out.println("Digite a kilometragem percorrida pela viatura 2");
		kilometrosPercorridos2 = entradaPorTeclado.nextDouble();

// Saida da viatura 1
		System.out.println("----- Dados da Viatura 1 -----");
		System.out.println("Marca: " + marca1);
		System.out.println("Modelo: " + modelo1);
		System.out.println("Ano de fabrico: " + anoFabrico1);
		System.out.println("Numero de assentos: " + numeroDeAssentos1);
		System.out.println("Distancia percorrida: " + kilometrosPercorridos1);		

// Saida da viatura 2
		System.out.println("----- Dados da Viatura 2 -----");
		System.out.println("Marca: " + marca2);
		System.out.println("Modelo: " + modelo2);
		System.out.println("Ano de fabrico: " + anoFabrico2);
		System.out.println("Numero de assentos: " + numeroDeAssentos2);
		System.out.println("Distancia percorrida: " + kilometrosPercorridos2);				
		
		entradaPorTeclado.close();
	}
}

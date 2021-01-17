import java.util.Scanner;

public class Viatura {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		String marca, modelo;
		int anoFabrico, numeroDeAssentos;
		double kilometrosPercorridos;
		
		System.out.println("Digite a marca da viatura!");
		marca = entradaPorTeclado.nextLine();
		
		System.out.println("Digite o modelo da viatura!");
		modelo = entradaPorTeclado.nextLine();
		
		System.out.println("Digite o ano de fabrico da viatura!");
		anoFabrico = entradaPorTeclado.nextInt();
		
		System.out.println("Digite o total de assentos!");
		numeroDeAssentos = entradaPorTeclado.nextInt();
		
		System.out.println("Digite a kilometragem percorrida pela viatura");
		kilometrosPercorridos = entradaPorTeclado.nextDouble();
		
		System.out.println();
		System.out.println("----- Dados da Viatura -----");
		System.out.println("Marca: " +marca);
		System.out.println("Modelo: " +modelo);
		System.out.println("Ano de fabrico: " +anoFabrico);
		System.out.println("Numero de assentos: " +numeroDeAssentos);
		System.out.println("Distancia percorrida: " +kilometrosPercorridos);
				
		entradaPorTeclado.close();
	}
}



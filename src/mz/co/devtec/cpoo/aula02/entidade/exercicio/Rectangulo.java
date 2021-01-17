package mz.co.devtec.cpoo.aula02.entidade.exercicio;

public class Rectangulo {

	public double base, altura;
	public static String tipoFigura;

	public double calculaPerimetro(double base, double altura) {
		return 2*(base + altura);
	}
	
	public void mostraAlgumacoisa() {
		
	}
	
	
	public double calculaArea(double base, double altura) {
		return base*altura;
	}
	
	public String toString() {
		return "base: " +base +" e altura " + altura;		
	}
	
	
	public static String novoTipoFigura(String novoTipo) {
		
		return Rectangulo.tipoFigura = novoTipo;
	}
		


}



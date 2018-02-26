import java.util.Scanner;
public class CalculadoraMassa{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o peso em libras: ");
		double pesoLibras = input.nextDouble();
		System.out.println("Insira a altura em polegadas: ");
		double alturaPolegadas = input.nextDouble();

		double pesoQuilo = pesoLibras*0.453592;
		double alturaMetros = alturaPolegadas*0.0254;

		double imc = pesoQuilo/(alturaMetros*alturaMetros);

		System.out.printf("Seu IMC é %f\n",imc);
	}
}
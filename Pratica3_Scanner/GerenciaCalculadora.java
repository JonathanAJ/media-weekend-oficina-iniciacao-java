/**
 * Faça a classe “Calculadora”. Nela implemente um método público que recebe 3 inteiros:
 * num1, num2 e tipo. Onde num1 e num2 serão os números do cálculo e tipo o número do tipo do cálculo
 * (soma, subtração, multiplicação e divisão). Os números devem vir do usuário em outra classe com o main.
 */
import java.util.Scanner;

public class GerenciaCalculadora{
	public static void main(String[] args){

		Calculadora cc = new Calculadora();
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Digite o 1º número:");
			int num1 = sc.nextInt();

			System.out.println("Digite o 2º número:");
			int num2 = sc.nextInt();

			String info = "Digite:\n" +
						  " 1 - para somar\n" +
						  " 2 - para subtrair\n" +
						  " 3 - para multiplicar\n" +
						  " 4 - para dividir";
			System.out.println(info);
			int tipo = sc.nextInt();

			cc.calculaNumeros(num1, num2, tipo);
		
		}catch(Exception e){
			System.out.println("Número inválido.");

		}
	}
}
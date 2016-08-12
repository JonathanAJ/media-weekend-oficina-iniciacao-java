public class Calculadora{
	
	public void calculaNumeros(int num1, int num2, int tipo){

		switch(tipo){
			case 1 :
				System.out.println("O resultado da soma é " + (num1 + num2));
				break;
			case 2 :
				System.out.println("O resultado da subtração é " + (num1 - num2));
				break;
			case 3 :
				System.out.println("O resultado da multiplicação é " + (num1 * num2));
				break;
			case 4 :
				System.out.println("O resultado da divisão é " + (num1 / num2));
				break;
			default :
				System.out.println("Opção desconhecida!");
				break;
		}
	}
}
/**
 * Faça o exemplo do “OlaMundo”. Após isso, usando um for ou while, printe-o 10 vezes.
 * Se for par printe com Fortaleza, se for impar printe com Sobral.
 */

public class OlaMundo{
	public static void main(String[] args){

		for(int i = 1; i <=10; i++){
			if(i%2 == 0){
				System.out.println("Olá MediaWeekend Fortaleza!");
			
			}else{
				System.out.println("Olá MediaWeekend Sobral!");
			
			}
		}
	}
}
/*
 * Faça um mini sistema de banco de dados com arquivos de texto.
 * Use a classe Pessoa já criada anteriormente e receba do usuário
 * com a classe Scanner os valores necessários para completar todos os atributos.
 * Escreva os atributos em um txt seguindo a regra “Nome: Valor”, no final do
 * arquivo também diga se a pessoa é maior de idade. O nome do arquivo deve ser nome_da_pessoa.txt
 *
*/
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Banco{
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Scanner leia = new Scanner(System.in);
		boolean maioridade = false;

		try{
			System.out.println("Nome:");
			pessoa.setNome(leia.nextLine());

			System.out.println("Cidade:");
			pessoa.setCidade(leia.nextLine());

			System.out.println("Idade: ");
			pessoa.setIdade(leia.nextInt());

			if(pessoa.getIdade() >= 18){
				maioridade = true;
			}else{
				maioridade = false;
			}

			String caminho = "/home/jonathan/" + pessoa.getNome() + ".txt";

			try{
				FileWriter arquivo = new FileWriter(caminho);
				PrintWriter escreva = new PrintWriter(arquivo);

				escreva.println("Nome: " + pessoa.getNome());
				escreva.println("Cidade: " + pessoa.getCidade());
				escreva.println("Idade: " + pessoa.getIdade());
				if(maioridade)
					escreva.println("É maior de idade.");
				else
					escreva.println("É menor de idade.");
				arquivo.close();

				System.out.println("Pessoa salva com sucesso!");

			}catch(IOException e){
				System.out.println("Houve algo errado na persistência do arquivo.");
			}
		
		}catch(Exception e){
			System.out.println("Idade inválida");
		}
	}
}
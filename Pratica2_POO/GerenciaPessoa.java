/**
 * Faça a classe “Pessoa”. Coloque os seguintes atributos: nome, cidade, idade.
 * Gerencie com outra classe tendo o método main , usando gets e sets.
 * Printe na tela os valores cadastrados.
 */

public class GerenciaPessoa{
	public static void main(String[] args){

		Pessoa p = new Pessoa();

		p.setNome("Jonathan Alves");
		p.setCidade("Fortaleza");
		p.setIdade(21);

		String dados  = "\nNome: " + p.getNome() + "\n" +
						"Cidade: " + p.getCidade() + "\n" +
						"Idade: " + p.getIdade() + "\n";

		System.out.println(dados);
	}
}
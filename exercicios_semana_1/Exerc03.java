import java.util.Scanner;

/*
 * Você pode utilizar o código do exercício anterior para este exercício.
 *  Crie um programa em Java que, utilizando a classe Scanner, 
 *  pergunte ao usuário seu sobrenome, depois seu nome, 
 *  e então escreva na tela o nome completo do usuário, seguido por suas iniciais.
 *  Por exemplo: “Olá Fulano Silva, suas iniciais são F.S.”
 * 
 * 
 */
public class Exerc03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = leitor.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		leitor.close();
		char inicialNome = nome.charAt(0);
		char inicialSobrenome = sobrenome.charAt(0);
		
		System.out.print("Olá "+ nome +" "+ sobrenome + ", suas iniciais são "+ inicialNome + "." + inicialSobrenome + ".");

	}

}

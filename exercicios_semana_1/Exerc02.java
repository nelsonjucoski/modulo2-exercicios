import java.util.Scanner;

/*
 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome,
 * depois seu nome, e então escreva na tela, em uma única “string”, o nome completo do usuário.
 *   Informe também ao usuário quantas letras tem no nome dele. Por exemplo: “Olá Fulano Silva,
 *  seu nome possui 11 letras.”.
 */
public class Exerc02 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite sue sobrenome: ");
		String sobrenome = leitor.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		leitor.close();

		int letras = nome.length() + sobrenome.length();
		System.out.print("Olá " + nome + " " + sobrenome + ", seu nome possui " + letras + " letras.");

	}
}

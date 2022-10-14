import java.util.Scanner;

/*
 * Crie um programa em Java que pergunte ao usuário seu último sobrenome
 *  e em seguida exiba na tela o texto “Olá, X.
 *   Seu sobrenome contém y letras”, onde X é o sobrenome em letras maiúsculas, e y é a 
 *   quantidade de letras desse sobrenome.
 */
public class Exerc04 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite seu último sobrenome: ");
		String sobrenome = leitor.nextLine();
		leitor.close();
		System.out.println("Olá, " + sobrenome + ".");
		System.out.print("Seu sobrenome contém " + sobrenome.length() + " letras, onde " + sobrenome.toUpperCase()
				+ " é o sobrenome em letras maiúsculas.");

	}

}

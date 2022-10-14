import java.util.Scanner;

/*
 * Escreva um código que receba um número X 
 * (informado pelo usuário) de pares de 
 * Nomes e Sobrenomes.
 *  Após o usuário informar todos os nomes e sobrenomes,
 * exiba um par “<nome>: <quantos caracteres tem a soma do nome>”

 */
public class Exerc03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos nomes e sobrenomes quer Escrever?");
		int num = leitor.nextInt();

		String[] nomes = new String[num];
		String[] sobrenomes = new String[num];

		for (int i = 0; i < num; i++) {

			System.out.print("Digite nome :");
			String nome = leitor.next();
			System.out.print("Digite sobrenome :");
			String sobrenome = leitor.next();
			nomes[i] = nome.toUpperCase();
			sobrenomes[i] = sobrenome.toUpperCase();
		}
		leitor.close();
		for (int i = 0; i < num; i++) {
			System.out.println(nomes[i] + " " + sobrenomes[i] + " tem " + (nomes[i] + sobrenomes[i]).length()
					+ " letras e " + ((nomes[i] + sobrenomes[i]).length() + 1 + " caracteres contando o espaço."));
		}

	}

}
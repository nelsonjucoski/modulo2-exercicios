import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai Digitar? ");
		int qtdPessoas = leitor.nextInt();
		String[] nomes = new String[qtdPessoas];
		int[] idades = new int[qtdPessoas];

		for (int i = 0; (qtdPessoas - 1) >= i; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");

			System.out.printf("Nome: ");
			String nomeDigitado = leitor.next();
			System.out.printf("Idade: ");
			nomes[i] = nomeDigitado;
			int idadeDigitada = leitor.nextInt();
			idades[i] = idadeDigitada;
			System.out.println("---------------------");

		}

		int maiorIdade = 0;// variavel maior idade
		int inome = 0; // index nome da pessoa mais velha
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				inome = i;
			}
		}

		System.out.println("Pessoa mais velha: " + nomes[inome]);

		leitor.close();
	}

}

import java.util.Random;
import java.util.Scanner;
/*
 * Escreva um código que gera um número aleatório entre 0 e 10,
 * e peça para um usuário tentar acertar o número até que ele acerte.
 */

public class Exerc02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		int num_sorteado = random.nextInt(11);
		
		int num_escolhido;
		System.out.println("Vamos tentar acertar um número inteiro de 0 até 10 tente adivinhar: ");
		System.out.println("_______________________________");
		do {
			System.out.println("Digite número: ");
			num_escolhido = leitor.nextInt();			
		} while (num_sorteado != num_escolhido);
		System.out.println("acertou....");
		leitor.close();
	}

}

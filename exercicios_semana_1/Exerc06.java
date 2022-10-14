import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.printf("Digite o ano de seu nascimento: ");
		int nasc = leitor.nextInt();
		System.out.printf("Digite o ano Corrente: ");
		int corrent = leitor.nextInt();
		leitor.close();
		int idade = corrent - nasc;
		System.out.println("_________________________________");
		System.out.printf("Sua idade é " + idade + " anos ou " + (idade - 1) + " anos se ainda não aniversariou.");

	}

}
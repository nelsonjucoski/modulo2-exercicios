import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		System.out.print("Quantos número pretende digitar? ");
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		int numDigitados[] = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Digite " + (i + 1) + "º número: ");
			numDigitados[i] = leitor.nextInt();
		}

		System.out.println("Números Negativos:");
		for (int listNumeros : numDigitados) {
			if (listNumeros < 0) {
				System.out.println("Número: " + listNumeros);
			} else {
				System.out.println("Nenhum número negativo digitado....");
				break;
			}
		}
		leitor.close();
	}

}
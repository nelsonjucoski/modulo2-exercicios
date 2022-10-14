import java.util.Scanner;
import java.text.DecimalFormat;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Quantos números que digitar?");
		int num = leitor.nextInt();
		int[] listNum = new int[num];

		for (int i = 0; num >= (i + 1); i++) {
			System.out.print("Digite " + (i + 1) + "º número: ");
			int numDigitado = leitor.nextInt();
			listNum[i] = numDigitado;
		}

		int soma = 0;
		int numDivisor = 0;

		for (int i = 0; (listNum.length - 1) >= i; i++) {

			if ((listNum[i] % 2) == 0) {
				soma += listNum[i];
				numDivisor += 1;
			}
		}
		System.out.println("_______________________");
		if (soma > 0) {
			System.out.println("Média dos Pares = " + formatador.format(soma / numDivisor));

		} else {
			System.out.println("Nenhum número para digitado.");
		}
		leitor.close();
	}

}

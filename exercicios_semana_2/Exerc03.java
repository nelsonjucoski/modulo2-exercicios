import java.util.Scanner;

/*
 * Crie um algoritmo que leia um valor referente à temperatura e
 *  exiba uma mensagem informando o tipo do clima de maneira mais detalhada,
 *   considerando as seguintes condições:

Se a temperatura estiver até 18 graus, o clima é frio; 
Se a temperatura estiver entre 19 e 23 graus, o clima é agradável;
Se a temperatura estiver entre 24 e 35 graus, o clima é quente;
Se a temperatura estiver acima de 35 graus, o clima é muito quente;

 */
public class Exerc03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite temperatura em graus centigrados: ");
		// Pega temperaturas com decimais
		double temp = leitor.nextDouble();
		leitor.close();

		if (temp < 19) {
			System.out.printf("01 Clima é frio ");
		} else if (temp >= 19 && temp < 24) {
			System.out.printf("02 Clima é agradável");
		} else if (temp > 24 && temp <= 35) {
			System.out.printf("03 Clima é quente");
		} else {
			System.out.printf("04 Clima é muito quente");
		}

	}

}

import java.util.Scanner;

/*
 * Crie um algoritmo que leia um valor inteiro representando a 
 * temperatura e informe se o clima está quente ou frio.
 *  Considere que o clima está quente se a temperatura for superior a 30.
 *  Caso contrário, informe que o clima está frio. Imprima em tela de maneira clara 
 * e de fácil entendimento ao usuário.
 */
public class Exerc02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite temperatura: ");
		leitor.close();
		int temp = leitor.nextInt();
		if(temp > 30) {
			System.out.println("Temperatura " + temp + "°C Clima quente");
		}else {
			System.out.println("Temperatura " + temp + "°C Clima frio");
		}
	}
}

import java.util.Scanner;

/*
 * Crie um programa em Java que pergunte ao usuário: nome,
 *  idade e se gosta de praticar algum esporte. 
 *  Crie 3 variáveis para guardar as respostas do usuário:
 *   uma deve receber um valor textual (string), outra deve receber um valor numérico (int),
 *    e outra um valor de verdadeiro ou falso (boolean). 
 *    Faça com que esses 3 valores sejam exibidos de volta para o usuário.

 */
public class Exerc05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Gosta de praticar algum esporte? Resposta: Sim ou Não.");
		String esportes = leitor.next();
		leitor.close();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Olá " + nome + ", agora já sei seu nome e sua idade " + idade + " anos.");
		// System.out.println("Sua resposta: "+esportes + " para prática de esportes.");
		
		
		if (esportes.equalsIgnoreCase("sim")) {
			System.out.println("E você gosta de práticar esportes.");
		} else if (esportes.equalsIgnoreCase("não") || esportes.equalsIgnoreCase("nao")) {
			System.out.println("E você não gosta de práticar esportes.");
		} else {
			System.out.println("Resposta para prática de esportes incorreta....");			
		}

	}

}

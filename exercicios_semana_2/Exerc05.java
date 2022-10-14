import java.util.Scanner;

/*
 * Usando a estrutura condicional Switch Case para fazer 
 * um menu para que o usuário escolha se deseja somar,
 * subtrair, multiplicar, dividir ou ver o resto de uma divisão.
 * Peça para o usuário informar dois números (duas variáveis inteiras) e depois escolha a através de um menu qual a operação que ele deseja realizar. Imprima todas as instruções e resultados no terminal de maneira clara.
 */
public class Exerc05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Vamos fazer contas???");
		System.out.println("Digite 1º número inteiro: ");
		int num1 = leitor.nextInt();
		System.out.println("Digite 2º número inteiro: ");
		int num2 = leitor.nextInt();
		System.out.println("Digite opção: \n" + "(1) + Adição\n" + "(2) - Subtração\n" + "(3) x Multiplicação\n"
				+ "(4) ÷ Divisão\n" + "(5) ÷ Restos da Divisão");
		int operacao = leitor.nextInt();
		leitor.close();

		switch (operacao) {
		case 1:
			System.out.println("Resposta: " + num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println("Resposta: " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println("Resposta: " + num1 + " x " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.println("Resposta: " + num1 + " ÷ " + num2 + " = " + (num1 / num2));
			break;
		case 5:
			System.out.println("Resposta: " + num1 + " ÷ " + num2 + " = Resto " + (num1 % num2));
			break;
		default:
			System.out.println("Opção Inválida......");

		}
	}
}
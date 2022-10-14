import java.util.Scanner;
/*
 * Escreva um código que pergunta ao professor quantas notas
 *um curso tem e quantos alunos possuem na turma.
 * Após isso, leia todas as avaliações e imprima 
 * o nome de todos os alunos aprovados.
 *  Considere um aluno aprovado aquele que possui uma 
 *  média maior ou igual a 7.
 */
public class Exerc04 {
	public static void main(String[] args) {
		int qtdNotas = 0;
		int qtdAlunos = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Olá professor");
		System.out.println("Quantas notas tem esse curso?");
		qtdNotas = leitor.nextInt();

		System.out.println("Quantos aluno tem a turma");
		qtdAlunos = leitor.nextInt();

		String[] nomeAluno = new String[qtdAlunos];
		double[] mediaAluno = new double[qtdAlunos];
		

		for (int i = 0; i < qtdAlunos; i++) {
			double soma = 0;
			System.out.print("Digite nome do Aluno: ");
			nomeAluno[i] = leitor.next();

			for (int y = 0; y < qtdNotas; y++) {
				System.out.print("Digite " + (y + 1) + "ª nota do aluno " + nomeAluno[i] + ": ");
				double notas = leitor.nextDouble();
				soma += notas;
			}
			mediaAluno[i] = soma / qtdNotas;
			System.out.println("——————————————————————————————");//divisor de partes
		}

		for (int i = 0; i < qtdAlunos; i++) {
			if (mediaAluno[i] >= 7) {
				System.out.println("Aluno: "+ nomeAluno[i]+" Média "+ mediaAluno[i]+" Situação APROVADO");
			}

		}
		leitor.close();
	}
}
/*
 * Escreva um código que conte todos os números que
 *  são múltiplos de 3 entre 0 e 300.
 *   Exiba quantos números foram contados ao final 
 *   do programa.

 */
public class Exerc01 {

	public static void main(String[] args) {
		int num = 3;
		
		int i = 0;
		for (; i <= 300; i++) {
			System.out.println(num * i);
		}
		System.out.println("Foram contados " +i + " números.");


	}

}

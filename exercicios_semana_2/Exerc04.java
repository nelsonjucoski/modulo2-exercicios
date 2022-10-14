/*
 * Faça um código em Java para determinar o resultado da expressão:
 *  " !(a + b == c) || ((c != 0) && (b - c >= 19) )" 
 *  onde para .
 *   Apresente de maneira clara e sequencial ao usuário o
 *    passo a passo até o resultado.
 */
public class Exerc04 {

	public static void main(String[] args) {
		
		int a = 34;
		int b = 12;
		int c = 8;
		boolean p1 = !(9 + 12 == 8);
		boolean p2 = (c != 0);
		boolean p3 = (b - c >= 19);
		boolean p4 = (c != 0) && (b - c >= 19);
		boolean p5 = !(a + b == c) || ((c != 0) && (b - c >= 19));
		
		System.out.println("Apresentamos a expressão: !(a + b == c) || ((c != 0) && (b - c >= 19))");
		System.out.println("Onde: a = 34, b = 12 e c = 8");
		System.out.println("Subtituimos os valores na fórmula !(9 + 12 == 8) || ((8 != 0) && (12 - 8 >= 19) )\"");
		System.out.println("1ª parte: "+ p1 +" || ((c != 0) && (b - c >= 19)).");
		System.out.println("2ª parte: "+ p1 +" || ("+ p2 +" && (b - c >= 19)).");
		System.out.println("3ª parte: "+ p1 +" || ("+ p2 +" && "+ p3+").");
		System.out.println("4ª parte: "+ p1 +" || "+p4+".");
		System.out.println("5ª parte: "+ p5+".");
		
	}

}

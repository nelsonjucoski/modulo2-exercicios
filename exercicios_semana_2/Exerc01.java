/*
 * Faça código em Java para a expressão: " !((i > 4) || (j <= 5)) " 
 * onde para i = 10 e j = 3. Apresente os resultados ao usuário (no terminal)
 *  de maneira clara e sequencial (passo a passo da execução).
 */
public class Exerc01 {

	public static void main(String[] args) {
		
		System.out.println("Apresentamos a expressão: !((i>4) || (j<=5))");
		System.out.println("Onde i=10 e j=3");		
		int i = 10;
		int j = 3;
		System.out.println("Substituindo: !(("+i+">4) || ("+j+"<=5))");
		boolean parte01 = (i > 4);
		boolean parte02 = (j <= 5);
		boolean resultado = !((parte01) || ( parte02));
		System.out.println("1ª parte: !(("+parte01+") || ("+j+"<=5))");
		System.out.println("2ª parte: !(("+parte01+") || ("+parte02+"))");
		System.out.println("3ª parte: !("+(parte01 || parte02)+")");		
		System.out.print("Resultado: "+resultado);	

	}

}
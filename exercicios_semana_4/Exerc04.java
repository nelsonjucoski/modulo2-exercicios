import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int qtdNum = leitor.nextInt();
		double[] listNumeros = new double[qtdNum];
		
		for (int i = 0; i < qtdNum; i++) {
			System.out.print("digite "+ (i+1)+"º número:");
			double numDigitado = leitor.nextDouble();
			listNumeros[i] = numDigitado;
		}
		
		double numMaior = 0;
		int indexmunMaior = 0;
		for (int i = 0; i < listNumeros.length; i++) {			
			
			if(listNumeros[i] >= numMaior ) {
				numMaior = listNumeros[i];
				indexmunMaior = i;
			}
		}
		System.out.println("____________________________");
		System.out.println("Maior valor: "+listNumeros[indexmunMaior]);
		System.out.println("Posição do maior valor: "+indexmunMaior);
		leitor.close();
	}

}

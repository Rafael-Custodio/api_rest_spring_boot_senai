import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {

		/*
		 * 15 - Leia 5 números e imprima a média aritmética deles;
		 */

		System.out.println("====================");
		System.out.println("====================");
		System.out.println("Leia 5 números e imprima a média aritmética deles.");
		System.out.println("====================");
		System.out.println("====================");
		System.out.println(" ");

		Scanner teclado = new Scanner(System.in);

		Double[] numeros = new Double[5];
		Double media = 0.;

		for (int c = 0; c <= 4; c = c + 1) {
			System.err.println("Escreva o " + (c + 1) + "º número:");
			numeros[c] = teclado.nextDouble();
		}

		System.out.println(" ");
		System.out.print("Os números digitados foram: " + numeros[0] + ", ");
		System.out.print(numeros[1] + ", ");
		System.out.print(numeros[2] + ", ");
		System.out.print(numeros[3] + ", ");
		System.out.println(numeros[4]);

		media = (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]) / 5;
		System.out.println(" ");
		System.out.println("A média aritmética dos números digitados é: " + media);
		
//					
//			int totalizador = 0;
//			int[] numeros = new int[5]; 
//			for (int w = 0  ; w <= numeros.length; w = w + 1  ) {
//				System.out.println("Digite o numero");
//				totalizador = totalizador + numeros[w];
//			}
//			
//			
//			float media = totalizador / 5;
//			System.out.println(media);
//			
			

	}

}

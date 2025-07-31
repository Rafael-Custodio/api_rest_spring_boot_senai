import java.util.Scanner;


public class Exercicio_8 {

	public static void main(String[] args) {

	    /*
	    8 - Estrutura de Decisão IF/ELSE
			Crie um programa que pegue a idade do usuário e informe se ele é maior ou menor de idade;
	    */
		
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println("Crie um programa que pegue a idade do usuário e informe se ele é maior ou menor de idade.");
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println(" ");
	    
	    Scanner teclado = new Scanner(System.in);

	    System.out.println("Digite a idade do usuário: ");
	    int idade = teclado.nextInt();

	    if (idade >= 18) {
		    System.out.println(" ");
	    	System.out.println("O usuário é maior de idade!");			
		} else {
		    System.out.println(" ");
			System.out.println("O usuário é menor de idade!");
		}
  		
	}

}

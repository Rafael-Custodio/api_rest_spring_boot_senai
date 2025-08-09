import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		
	    /*
		10 - Verificar se um número está dentro de um intervalo (por exemplo, entre 10 e 20).
	    */
		
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println("Verificar se um número está dentro de um intervalo (por exemplo, entre 10 e 20).");
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println(" ");
	    
	    Scanner teclado = new Scanner(System.in);

	    System.out.println("Digite um número qualquer: ");
	    int numero = teclado.nextInt();

	    if (numero >= 10 && numero <= 20 ) {
		    System.out.println(" ");
	    	System.out.println("O número está contido entre 10 e 20!");			
		} else {
		    System.out.println(" ");
	    	System.out.println("O número NÃO está contido entre 10 e 20!");			
		}
	}

}

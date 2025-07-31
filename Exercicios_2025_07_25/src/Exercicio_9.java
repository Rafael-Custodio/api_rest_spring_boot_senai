import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {

	    /*
	    9 - Checar se uma senha digitada pelo usuário é correta (exemplo: "1234").
	    */
		
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println("Checar se uma senha digitada pelo usuário é correta (exemplo: \"1234\").");
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println(" ");
	    
	    Scanner teclado = new Scanner(System.in);

	    System.out.println("Digite a senha: ");
	    int senha = teclado.nextInt();

	    if (senha == 1234) {
	    	System.out.println("A senha está correta!");	
		} else {
			System.out.println("A senha está incorreta!");
		}
	    

	    System.out.println(" ");
	    System.out.println(" ");    
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println("Checar se uma senha digitada pelo usuário é correta (exemplo: \"senha\").");
	    System.out.println("====================");
	    System.out.println("====================");
	    System.out.println(" ");
	    
	    System.out.println("Digite a senha: ");
	    String senha2 = teclado.next();

	    if (senha2.equals("senha")) {
	    	System.out.println("A senha está correta!");				
		} else {
			System.out.println("A senha está incorreta!");
		}
	}
}

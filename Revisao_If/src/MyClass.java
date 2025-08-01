
public class MyClass {

	public static void main(String[] args) {

		System.out.println("===================");
		System.out.println("===================");
		System.out.println("If Exclusivo");		
		System.out.println("===================");
		System.out.println("===================");
		System.out.println(" ");

		// If Exclusivo
		int idade = 18;
		if (idade >= 16) {
			System.out.println("Pode votar!");
		}

		System.out.println("===================");
		System.out.println("===================");
		System.out.println("If Completo");		
		System.out.println("===================");
		System.out.println("===================");
		System.out.println(" ");

		// If Completo
		int numero = 78;
		if (numero >= 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!");
		}

		System.out.println("===================");
		System.out.println("===================");
		System.out.println("Operador Ternário");		
		System.out.println("===================");
		System.out.println("===================");
		System.out.println(" ");

		// Operador Ternário
		String resp = (numero >= 0 ? "Positivo!" : "Negativo");
		System.out.println(resp);

		System.out.println("===================");
		System.out.println("===================");
		System.out.println("If Aninhado");		
		System.out.println("===================");
		System.out.println("===================");
		System.out.println(" ");

		// If Aninhado
		if (idade >= 16) {
			if (idade < 18) {
				System.out.println("Voto opcional!");
			} else {
				System.out.println("Voto obrigatório!");
			}
		} else {
			System.out.println("Não pode votar!");
		}
		
		// Switch = Escolha ou Caso
		int opcaoSala = 2;
		switch (opcaoSala) {
		case 1: System.out.println("Sala 01");
		break;
		case 2: System.out.println("Sala 02");
		break;
		case 3: System.out.println("Sala 03");
		break;
		case 4: System.out.println("Sala 04");
		break;
		default: System.out.println("Sala Inexistente!");
		}
	}
}

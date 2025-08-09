
public class Testador {

	public static void main(String[] args) {
		
		// Objeto
		//Tipo nome = valor
		Aluno aluno1 = new Aluno("Reinaldo", "465.456.789-09", 123456);

		// Objeto
		//Tipo nome = valor
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Felipe");
		aluno2.setCpf("123.123.123-10");
		aluno2.setNrMatricula(456456);

		aluno1.estudar();
		System.out.println();
		aluno2.estudar();

	}

}


public class Aluno {

	// Construtor
	public Aluno() {
		System.out.println("Xaxa");

	}

	// Construtor
	public Aluno(String n, String c, long nrM) {
		nome = n;
		cpf = c;
		nrMatricula = nrM;
	}
	

	// Atributos
	private String nome;
	private String cpf;
	private long nrMatricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		nome = n;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(long nrMatricula) {
		this.nrMatricula = nrMatricula;
	}

	public void estudar() {
		System.out.println(nome + " Estudando...");
	}

}

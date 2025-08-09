import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String cpf;
	private LocalDate dtNascimento;

	public int idade() {
		int anoAtual = LocalDate.now().getYear();
		int anoNac = dtNascimento.getYear();
		return anoAtual - anoNac;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade() + " anos.";
	}

}

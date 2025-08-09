public class Lancha extends Veiculo {

	public boolean equals(Lancha obj) {
		System.out.println("EQUALS DA LANCHA");
		return this.chassi.equals(obj.chassi);
	}
	
}


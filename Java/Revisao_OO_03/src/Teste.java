
public class Teste {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println( obj1.toString() );
		Object obj2 = new Object();
		System.out.println( obj2.toString() );
		Object obj3 = obj1;
		System.out.println( obj3.toString() );
		
		boolean resp1 = (obj1.equals(obj2) );
		boolean resp2 = (obj1.equals(obj3) );
		System.out.println(resp1);
		System.out.println(resp2);
		
		
		Veiculo v1 = new Veiculo();
		v1.nome = "Fusca";
		v1.marca = "VW";
		v1.chassi = "123456789";
		System.err.println( v1.toString() );
		
		Veiculo v2 = new Veiculo();
		v2.nome = "Opala";
		v2.marca = "GM";
		v2.chassi = "123456789";
		System.err.println( v2.toString() );
		
		boolean resp3 = (v1.equals(v2));
		System.out.println( resp3 );
		
		Lancha l1 = new Lancha();
		l1.marca = "XPTO Nautics";
		l1.nome = "Merlinda";
		l1.chassi = "456789000";
		
		Lancha l2 = new Lancha();
		l2.marca = "XPTO Nautics";
		l2.nome = "Priscila";
		l2.chassi = "456789000";		
		
		Helicoptero h1 = new Helicoptero();
		h1.marca = "Falcon X";
		h1.nome = "Esquilo";
		h1.chassi = "789798789";
		
		System.err.println(l1.equals(l2));
		
		

	}

}

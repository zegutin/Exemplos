package aula;

public class ExemploArrayString02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] carros = {"Ford","Chevrolet","Volkswagem","Reanult"};
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
	
		carros[0]="BMW";
		carros[3]="Subaru";
		
		System.out.println();
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		
		System.out.println();
	System.out.println(carros.length);
	}

}

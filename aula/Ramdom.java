package aula;



public class Ramdom {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			int random=(int)(Math.random()*10000);
			System.out.println("O número randomico gerado é :"+random);	
		}
	}

}
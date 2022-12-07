package aula;

import java.util.Scanner;

public class LacoRepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite em segundos");
		int tempo=sc.nextInt();
		
for (int contador = 0; contador==tempo; contador++) {
	
	System.out.println(contador);
}
		sc.close();
	}

}

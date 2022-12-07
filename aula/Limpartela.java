package aula;

import java.util.Scanner;

public class Limpartela {

	public static void main(String[] args) {
		
		//public static void input() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero que deseja saber a taboada");
		int numero=sc.nextInt();
		
		int acumuladora=1;
		while (acumuladora<11) {
			int resultado=numero*acumuladora;
			System.out.println(numero+" X "+acumuladora+ " = "+resultado);
			acumuladora++;
		}
			System.out.println("Deseja continuar\n(N/S)");
			char repita=sc.next().charAt(0);
			
			AnsiConsole.systemInstall();
			
			if (repita=='S') {
				//System.out.println("\u000C");
				System.out.println(ansi.eraeScreen());
			}
			else {
				System.out.println("\u000C");
				System.out.println("Parabéns braço curto");
			}
			
		sc.close();
	}
	}
//}

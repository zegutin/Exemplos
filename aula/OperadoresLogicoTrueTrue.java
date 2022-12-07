package aula;

import java.util.Scanner;

public class OperadoresLogicoTrueTrue {

public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um valor: ");
			int valor1=sc.nextInt();
			System.out.println("Digite um valor: ");
			int valor2=sc.nextInt();
			
			System.out.println(valor1>valor2 && valor2<valor1);
			
			sc.close();
		}
}

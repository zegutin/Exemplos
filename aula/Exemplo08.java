package aula;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Operadores Matem�ticos
		//Adi��o
System.out.println("Digite um valor:");
int valor1=sc.nextInt();
System.out.println("Digite um valor:");
int valor2=sc.nextInt();
int soma= valor1+valor2;
System.out.println("A soma dos dois valores corresponde a : "+soma);
		//Subtra��o
System.out.println("Digite um valor:");
int valor3=sc.nextInt();
System.out.println("Digite um valor:");
int valor4=sc.nextInt();
int subtracao= valor3-valor4;
System.out.println("A subtra��o dos dois valores corresponde a : "+subtracao);
		
		//Multiplica��o
System.out.println("Digite um valor:");
int valor5=sc.nextInt();
System.out.println("Digite um valor:");
int valor6=sc.nextInt();
int multiplicacao= valor5*valor6;
System.out.println("A multiplica��o dos dois valores corresponde a : "+multiplicacao);
		
		//Divis�o
System.out.println("Digite um valor:");
float valor7=sc.nextFloat();
System.out.println("Digite um valor:");
float valor8=sc.nextFloat();
float divisao= valor7/valor8;
System.out.println("A divisao dos dois valores corresponde a : "+divisao);

//Resto da divis�o
System.out.println("Digite um valor:");
int valor9=sc.nextInt();
System.out.println("Digite um valor:");
int valor10=sc.nextInt();
int restoD= valor9%valor10;
System.out.println("O resto da divis�o de dois valores corresponde a : "+restoD);
sc.close();
	}
}
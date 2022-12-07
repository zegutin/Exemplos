package aula;

import java.util.Scanner;

public class TemporizadorControlado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Bem-Vindo ao Timer na Flamingo");

System.out.println("Digite quantas horas seu time ira começar:");
int hora=sc.nextInt();

System.out.println("Digite quantas minutos seu time ira começar:");
int minutos=sc.nextInt();

System.out.println("Digite quantas segundos seu time ira começar:");
int segundos=sc.nextInt();
		


for (int i = hora; i >=0; i--) {
	for (int j = minutos; j >=0; j--) {	
		for (int K = segundos; K >=0; K--) {
		
				System.out.println(i+":" +j+ ":"+K);
				
			segundos=59;
            minutos=59;
		}
	}
}

sc.close();		
	}

}

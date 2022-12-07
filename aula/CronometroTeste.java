package aula;


import java.util.Scanner;

public class CronometroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite em horas");
		int horas=sc.nextInt();
		
		//System.out.println("digite em minutos");
		//int minutos=sc.nextInt();
		
		//System.out.println("digite em segundos");
		//int segundos=sc.nextInt();
		
for (int K = 0; K==horas; K++) {
	
	for (int J = 0; J<60; J++) {
		
	
	
for (int i = 0; i<60; i++) {
	
	System.out.println(K+":"+J+":"+i);
}
}
}
	sc.close();	
	}

}

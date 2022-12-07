package aula;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int valor=10;
valor+=3;

System.out.println(" Resultado "+valor);
		
int valor2=10;
int valor3=5;
valor3+=valor2;
System.out.println("O novo Valor é : "+valor3);
valor3-=valor2;
System.out.println("O novo valor é : "+valor3);
		

int valor4=10;
int valor5=2;
valor5*=valor4;
System.out.println("O novo valor é: "+valor5);
valor5%=valor4;
System.out.println("O novo Valor é: " +valor5);
	}

}

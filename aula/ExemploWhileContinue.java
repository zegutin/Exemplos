package aula;

public class ExemploWhileContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int contadora=0;
while (contadora<40) {
	
	if (contadora==20) {
		contadora++;
		continue;
	}
System.out.println(contadora);
contadora++;
}

	}

}

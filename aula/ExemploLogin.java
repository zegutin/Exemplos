package aula;

import java.util.Scanner;

public class ExemploLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.println("Digite o seu Login");
String loginUsuario= sc.nextLine();

System.out.println("Digite a sua Senha");
String PasswordUsuario= sc.nextLine();

String loginBancoDados="Daniel";
String PasswordBancoDados="Braço Curto";

System.out.println(loginBancoDados.equals(loginUsuario) && PasswordBancoDados.equals(PasswordUsuario));

sc.close();
	}

}

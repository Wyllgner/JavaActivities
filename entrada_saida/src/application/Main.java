package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;		
		nome = sc.next();
		
		int idade;
		idade = sc.nextInt();
		
		System.out.println(nome + " tem " + idade + " anos ");
		
		sc.close();
		
	}

}

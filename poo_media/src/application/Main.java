package application;

import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno x = new Aluno(); 
		
		System.out.print("Entre com o nome: ");
		x.nome= sc.nextLine();
		System.out.print("Entre com a nota 1: ");
		x.n1 = sc.nextDouble();
		System.out.print("Entre com a nota 2: ");
		x.n2 = sc.nextDouble();
		System.out.print("Entre com a nota 3: ");
		x.n3 = sc.nextDouble();

		System.out.println();
		System.out.printf("NOTA FINAL: %.2f%n",x.soma());
		
		if (x.soma() >= 60.00) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n",x.falta());
		}
		sc.close();
	}

}

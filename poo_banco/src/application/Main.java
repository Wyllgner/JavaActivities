package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client;
		
		System.out.print("Entre com o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Entre com o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja fazer um deposito (s/n)? ");
		char resp = sc.nextLine().charAt(0);
			
		if(resp == 's') {
			System.out.print("Entre com o valor a ser depositado: ");
			double depositoInicial = sc.nextDouble();
			client = new Client(conta, nome,depositoInicial);
		}else {
			client = new Client(conta,nome);
		}
		
		System.out.println();
		System.out.println("Dados do cliente: ");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Entre com o valor a ser depositado: ");
		double deposito = sc.nextDouble();
		client.deposito(deposito);
		System.out.println(client);
		
		System.out.println();
		System.out.print("Entre com o valor a ser sacado: ");
		double valorsaque = sc.nextDouble();
		client.saque(valorsaque);
		System.out.println(client);
		 
		sc.close();

	}
}

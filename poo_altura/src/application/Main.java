package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,cont=0;
		double media= 0.0;
		
		System.out.print("Num de pessoas: ");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[n];
		
		for (i=0; i<vet.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vet[i] = new Pessoa(nome, idade, altura);
		}
		
		for (i=0; i<vet.length; i++) {
			media += vet[i].getAltura();
			if(vet[i].getIdade() < 16) {
				cont++;
			}

		}
		
		double mediaTotal = media / n;
		System.out.printf("Altura Media: %.2f %n", mediaTotal);
		
		double menor = ((double) cont / n) * 100;
		System.out.printf("Menos de 16: %.2f %n", menor);
		
		for (i=0; i<vet.length; i++) {
			if(vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();
	}

}

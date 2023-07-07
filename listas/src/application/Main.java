package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//se for int tem que integer
		List<String> list = new ArrayList<>();
		
		//add na sequencia
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // add na posicao "2"
		
		System.out.println(list.size());// exibe o tamanho do vetor
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');//remove todos com letra M
		for (String x : list) {
			System.out.println(x);
		}
		// retorna a pociçao do elemento
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		//cria uma outra lista com a letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());  
		for (String x : result) {
			System.out.println(x);
		}
		
		//procura o primeiro elemento com a letra A
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
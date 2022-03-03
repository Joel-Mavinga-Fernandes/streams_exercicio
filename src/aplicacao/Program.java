package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entidade.Produto;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Quantos produtos deseja registrar?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			produtos.add(new Produto(nome, email, preco));
		}
		
		double media = produtos.stream()
				.map(x -> x.getPreco())
				.reduce(0.0,(x,y) -> x+y)/produtos.size();
		
		System.out.println("A média dos preço é " + media);
		
		System.out.print("Digite o salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Email dos colaboradores com salario maior que " + salario);
		
		Comparator<String> comp = (x,y)-> x.toUpperCase().compareTo(y.toUpperCase());
		
		List<String> emails = produtos.stream()
				.filter(x -> x.getPreco()> salario)
				.map(x-> x.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
		
		emails.forEach(System.out::println);
		
	
		double somaM = produtos.stream()
				.filter(x -> x.getNome().charAt(0)=='M')
				.map(x -> x.getPreco())
				.reduce(0.0, (x,y) -> x+y);
		
		System.out.println("A soma dos valores cujo o nome começa com a letra M é: " +somaM);
		

		sc.close();

	}

}

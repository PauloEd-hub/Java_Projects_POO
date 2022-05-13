package main;

import java.util.Locale;
import java.util.Scanner;

import entitie.Product;

public class Program {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.println("Estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		sc.close();

	}

}

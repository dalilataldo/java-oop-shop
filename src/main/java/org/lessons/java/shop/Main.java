package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creo un nuovo oggetto
		
		/*Scanner input = new Scanner (System.in);
		
		System.out.println("Digita il nome del prodotto");
		String productName = input.nextLine();
		System.out.println("Digita la descrizione del prodotto");
		String productDescription = input.nextLine();
		System.out.println("Digita il prezzo del prodotto");
		double productPrice = input.nextDouble();
		System.out.println("Digita l'iva del prodotto");
		int productIva = input.nextInt();
		
		Prodotto prodottoA = new Prodotto (productName, productDescription, productPrice, productIva);*/
		
		Prodotto prodottoA = new Prodotto ("Chair", "Una sedia a 4 gambe", 150, 22);
		
		//provo i metodi get
		System.out.println("Il codice è: " + prodottoA.getProductCode());
		System.out.println("Il nome è: " + prodottoA.getProductName());
		System.out.println("Il prodotto è: " + prodottoA.getProductDescription());
		System.out.println("Il prezzo è €: " + prodottoA.getProductPrice());
		System.out.println("L'Iva è: " + prodottoA.getProductIva());
		
		//provo i metodi set
		System.out.println("Il codice è: " + prodottoA.getProductCode());
		prodottoA.setProductName("Table");
		System.out.println("Il nome è: " + prodottoA.getProductName());
		prodottoA.setProductDescription("Un tavolo a 3 gambe");
		System.out.println("Il prodotto è: " + prodottoA.getProductDescription());
		prodottoA.setProductPrice(300);
		System.out.println("Il prezzo è €: " + prodottoA.getProductPrice());
		prodottoA.setProductIva(20);
		System.out.println("L'Iva è: " + prodottoA.getProductIva());
		
        //provo i metodi della classe
		System.out.println("Il prezzo comprensivo di Iva è €: " + prodottoA.getPriceAndIva());
		System.out.println("Il nome completo del prodotto è: " + prodottoA.getNameExtended());
		System.out.println("Il codice con padding è: " + prodottoA.getPaddingCode());
		
	}

}

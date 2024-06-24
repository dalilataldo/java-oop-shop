package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creo un nuovo oggetto
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
		
	}

}

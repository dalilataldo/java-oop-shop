package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	// variabili di istanza
	private int productCode;
	private String productName;
	private String productDescription;
	private double productPrice;
	private int productIva;
	
	//costruttore
	public Prodotto (String productName, String productDescription, double productPrice, int productIva){

	Random random = new Random ();
		
	this.productCode = random.nextInt(9999);
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	this.productIva = productIva; 
	}
	
	//getter e setter (productCode solo in lettura)
	public int getProductCode() {
		return productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	public int getProductIva() {
		return productIva;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void setProductIva(int productIva) {
		this.productIva = productIva;
	}
	
	//metodi della classe
	public double getPriceAndIva () {
		double priceIva = productPrice + ((productPrice * productIva)/100);
		return priceIva;
	}
	
	public String getNameExtended () {
		String fullName = productCode + "-" + productName;
		return fullName;
	}
	
	//come funziona con static?
	public String getPaddingCode () {
		
		String paddingCode = String.format("%1$" + 8 + "s", productCode).replace(' ', '0');
		return paddingCode;
	}
	
}

package com;

public class Main {

	public static void main(String[] args) {
		Shelf shelf = new Shelf();
		shelf.addProduct(new Book());
		shelf.addProduct(new DVD());
		shelf.addProduct(new Magazine());

	}

}

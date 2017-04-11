package com.bookstore.dev;


import java.util.HashMap;
import java.util.Map;

class InventoryMaster {
	
	private Map<String, BookInfo> books;	

	InventoryMaster(){
		books = new HashMap<>();
	}

	void addBook(String title, String authorsFirstName, String authorsLastName,
			String authorsCity) {

		addItem(new Book(title, authorsFirstName,authorsLastName, authorsCity));
		
	}
	
	void addMagazine(String title, String authorsFirstName, String authorsLastName,
			String authorsCity, String publishersName, String publishersAddress) {
		
		addItem(new Magazine(title, authorsFirstName, authorsLastName, authorsCity, publishersName, publishersAddress));
		
	}
	
	void addElectronicBook(String title, String authorsFirstName, String authorsLastName,
			String authorsCity, String dateSent) {

		addItem(new ElectronicBook(title, authorsFirstName, authorsLastName, authorsCity, dateSent));
		
	}

	private void addItem(BookInfo item){
		
		books.put(item.getTitle(), item);
		
	}

	
	String listInventory() {
		
		StringBuilder sb = new StringBuilder();
		
		for (BookInfo item : books.values()) {
			sb.append(String.format("%s", item));
			sb.append("\n");
		}

		return sb.toString();
	}

	
	double inventoryPrice() {
		
		double totalPrice = 0.00;
		
		for (BookInfo item : books.values()) {
			totalPrice += item.calculatePrice();
		}
		return totalPrice;
	}

	

	
	
}

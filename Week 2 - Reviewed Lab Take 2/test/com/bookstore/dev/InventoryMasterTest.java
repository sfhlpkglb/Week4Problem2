package com.bookstore.dev;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InventoryMasterTest {

	InventoryMaster inventoryMaster;
	
	@Before
	public void setup(){
		inventoryMaster = new InventoryMaster();
	}
	
	@Test
	public void testAddBook() {		
		inventoryMaster.addBook("Book Title","Firstname","Lastname","Author city");
		
		StringBuilder expected = new StringBuilder();
		expected.append("title: Book Title price: 17.00\n");
		expected.append("authors name: Firstname Lastname\n");
		expected.append("authors city: Author city\n\n");
		
		String actual = inventoryMaster.listInventory();		
		assertEquals(expected.toString(), actual);
	}
	
	@Test
	public void testBookInventoryPrice(){		
		inventoryMaster.addBook("Any Title","Fourth","Sixth","Any city");
		double expected = 11.00;
		double actual = inventoryMaster.inventoryPrice();
		assertEquals(expected, actual, .001);
	}

	@Test
	public void testAddMagazine() {		
		inventoryMaster.addMagazine("Book Title","Firstname","Lastname","Author city", "Publishers Name", "Publishers Address");
		
		StringBuilder expected = new StringBuilder();
		expected.append("title: Book Title price: 204.00\n");
		expected.append("authors name: Firstname Lastname\n");
		expected.append("authors city: Author city\n");	
		expected.append("publishers name: Publishers Name publishers address: Publishers Address\n\n");
		
		String actual = inventoryMaster.listInventory();		
		assertEquals(expected.toString(), actual);
	}
	
	@Test
	public void testMagazineInventoryPrice(){		
		inventoryMaster.addMagazine("Any Title","Fourth","Sixth","Any city", "My name", "My address");
		double expected = 132.00;
		double actual = inventoryMaster.inventoryPrice();
		assertEquals(expected, actual, .001);
	}
	@Test

	public void testAddElectronicBook() {		
		inventoryMaster.addElectronicBook("Book Title","Firstname","Lastname","Author city","12/28/2014");
		
		StringBuilder expected = new StringBuilder();
		expected.append("title: Book Title price: 1.00\n");
		expected.append("authors name: Firstname Lastname\n");
		expected.append("authors city: Author city\n");
		expected.append("date sent: 12/28/2014\n\n");
		
		String actual = inventoryMaster.listInventory();		
		assertEquals(expected.toString(), actual);
	}
	
	@Test
	public void testElectronicBookInventoryPrice(){		
		inventoryMaster.addElectronicBook("Any Title","Fourth","Sixth","Any city",null);
		double expected = 1.00;
		double actual = inventoryMaster.inventoryPrice();
		assertEquals(expected, actual, .001);
	}
	
}

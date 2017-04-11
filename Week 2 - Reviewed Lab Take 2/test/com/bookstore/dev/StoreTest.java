package com.bookstore.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoreTest {

	@Test
	public void test() {
		
		InventoryMaster inventoryMaster = new InventoryMaster();
		
		inventoryMaster.addMagazine("Rider", "Harley", "Davidson", "Milwaukee", "Motorcycle", "Main Street");
		inventoryMaster.addElectronicBook("Spys Like Us", "Ian", "Fleming", "London", "09/01/1960");
		inventoryMaster.addBook("Red Car", "James", "North", "Chicago");
		inventoryMaster.addMagazine("Photography", "Lost", "Images", "Woodbury", "Modern Images", "Tripod Alley");
		inventoryMaster.addElectronicBook("Does Not Compute", "Lost", "Byte", "Washington", null);
		inventoryMaster.addBook("Trafic", "Chevy", "Chase", "Northern");
		
		System.out.println(inventoryMaster.listInventory());
		
		System.out.println("Total Inventory Price: " + inventoryMaster.inventoryPrice());
		
	}

}

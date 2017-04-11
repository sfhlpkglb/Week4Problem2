package com.bookstore.dev;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MagazineTest {

	Magazine magazine;
	
	@Before
	public void setup(){
		magazine = new Magazine("Life","Charlie","Rae","Gilbert, AZ","Time Life", "Time Square");
	}

	@Test
	public void testGetTitle() {
		String expected = "Life";
		String actual = magazine.getTitle();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetAuthorsFirstName() {
		String expected = "Charlie";
		String actual = magazine.getAuthorsFirstName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetAuthorsLastName() {
		String expected = "Rae";
		String actual = magazine.getAuthorsLastName();
		assertEquals(expected, actual);		
	}
		
	@Test
	public void testGetAuthorsCity() {
		String expected = "Gilbert, AZ";
		String actual = magazine.getAuthorsCity();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetPublishersName() {
		String expected = "Time Life";
		String actual = magazine.getPublishersName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetPublishersAddress() {
		String expected = "Time Square";
		String actual = magazine.getPublishersAddress();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testCalculatePrice(){
		double expected = 120.00;
		double actual = magazine.calculatePrice();
		assertEquals(expected, actual, .001);		
	}

	@Test
	public void testToString(){
		StringBuilder expected = new StringBuilder();
		expected.append("title: Life price: 120.00\n");
		expected.append("authors name: Charlie Rae\n");
		expected.append("authors city: Gilbert, AZ\n");
		expected.append("publishers name: Time Life publishers address: Time Square\n");
		String actual = String.format("%s", magazine);
		assertEquals(expected.toString(), actual);
	}


}

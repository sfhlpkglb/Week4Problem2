package com.bookstore.dev;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ElectronicBookTest {

	ElectronicBook electronicBook;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setup(){	
		electronicBook = new ElectronicBook("White Death","Harold", "Shook", "Hartford, CT","10/12/2015");
		
	}
	
	@Test
	public void testGetTitle() {
		String expected = "White Death";
		String actual = electronicBook.getTitle();
		assertEquals(expected, actual);		
	}
		
	@Test
	public void testGetAuthorsFirstName() {
		String expected = "Harold";
		String actual = electronicBook.getAuthorsFirstName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetAuthorsLastName() {
		String expected = "Shook";
		String actual = electronicBook.getAuthorsLastName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetAuthorsCity() {
		String expected = "Hartford, CT";
		String actual = electronicBook.getAuthorsCity();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetDateSent(){
		String expected = "10/12/2015";
		String actual = electronicBook.getDateSent();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatePrice(){
		double expected = 1.00;
		double actual = electronicBook.calculatePrice();
		assertEquals(expected, actual, .001);		
	}

	@Test
	public void testToString(){
		StringBuilder expected = new StringBuilder();
		expected.append("title: White Death price: 1.00\n");
		expected.append("authors name: Harold Shook\n");
		expected.append("authors city: Hartford, CT\n");
		expected.append("date sent: 10/12/2015\n");
		String actual = String.format("%s", electronicBook);
		assertEquals(expected.toString(), actual);
	}
	
	@Test
	public void testToStringNullDate(){
		ElectronicBook electronicBook2 = new ElectronicBook("Twisted", "Bent", "Screw", "Phoenix, AZ", null);
		String today = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		StringBuilder expected = new StringBuilder();
		expected.append("title: Twisted price: 1.00\n");
		expected.append("authors name: Bent Screw\n");
		expected.append("authors city: Phoenix, AZ\n");
		expected.append("date sent: " + today + "\n");
		String actual = String.format("%s", electronicBook2);
		assertEquals(expected.toString(), actual);
	}
	
	@Test
	public void testToStringBadDateFormat(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Date format error occured o1/1o/2015");
		ElectronicBook electronicBook2 = new ElectronicBook("Junkyard Dog", "Old", "Blue", "Orange, CA", "o1/1o/2015");
	}

	@Test
	public void testTransmitted(){
		String expected = "transmitted";
		String actual = electronicBook.transmitted();
		assertEquals(expected, actual);
	}

}

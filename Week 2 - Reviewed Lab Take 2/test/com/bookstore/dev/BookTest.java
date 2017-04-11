package com.bookstore.dev;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bookstore.dev.Book;


public class BookTest {

	Book book;
	
	@Before
	public void setup(){	
		book = new Book("Test Title","John","Smith","Cambridge");
	}
	
	@Test
	public void testGetTitle() {
		String expected = "Test Title";
		String actual = book.getTitle();
		assertEquals(expected, actual);		
	}
		
	@Test
	public void testGetAuthorsFirstName() {
		String expected = "John";
		String actual = book.getAuthorsFirstName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetAuthorsLastName() {
		String expected = "Smith";
		String actual = book.getAuthorsLastName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetAuthorsCity() {
		String expected = "Cambridge";
		String actual = book.getAuthorsCity();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testCalculatePrice(){
		double expected = 9.00;
		double actual = book.calculatePrice();
		assertEquals(expected, actual, .001);		
	}

	@Test
	public void testToString(){
		StringBuilder expected = new StringBuilder();
		expected.append("title: Test Title price: 9.00\n");
		expected.append("authors name: John Smith\n");
		expected.append("authors city: Cambridge\n");
		String actual = String.format("%s", book);
		assertEquals(expected.toString(), actual);
	}
	
}

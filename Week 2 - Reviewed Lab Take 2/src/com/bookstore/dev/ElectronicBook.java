package com.bookstore.dev;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class ElectronicBook implements BookInfo, ElectronicInfo{

	private String title;
	private String authorsFirstName;
	private String authorsLastName;
	private String authorsCity;
	private Date dateSent;
	
	
	ElectronicBook(String title, String authorsFirstName,
			String authorsLastName, String authorsCity, String dateSent) {
	
		setTitle(title);
		setAuthorsFirstName(authorsFirstName);
		setAuthorsLastName(authorsLastName);
		setAuthorsCity(authorsCity);
		setDateSent(dateSent);
	}

	@Override
	public double calculatePrice() {
		return 1.00;
	}

	@Override
	public String toString() {
		return "title: " + getTitle() + String.format(" price: %.2f", calculatePrice()) +
				"\nauthors name: " +getAuthorsFirstName() + " " + getAuthorsLastName() +
				"\nauthors city: " + getAuthorsCity() + 
				"\ndate sent: " + getDateSent() + "\n";
	}

	@Override
	public String transmitted() {
		return "transmitted";
	}
	
	@Override
	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;	
	}

	@Override
	public String getAuthorsFirstName() {
		return authorsFirstName;
	}

	private void setAuthorsFirstName(String firstName) {
		this.authorsFirstName = firstName;
	}

	@Override
	public String getAuthorsLastName() {
		return authorsLastName;
	}

	private void setAuthorsLastName(String lastName) {
		this.authorsLastName = lastName;
	}

	@Override
	public String getAuthorsCity() {
		return authorsCity;
	}

	private void setAuthorsCity(String city) {
		this.authorsCity = city;
	}

	@Override
	public String getDateSent() {
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(dateSent);	}

	private void setDateSent(String dateSent) {
		if(dateSent == null){
			dateSent = new SimpleDateFormat("MM/dd/yyyy").format(new Date());	//	default dateSent is today
		}

		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			this.dateSent = formatter.parse(dateSent);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Date format error occured " + dateSent );
		}
	}

}

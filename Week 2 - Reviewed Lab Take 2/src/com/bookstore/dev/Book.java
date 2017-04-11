package com.bookstore.dev;

class Book implements BookInfo{

	private String title;
	private String authorsFirstName;
	private String authorsLastName;
	private String authorsCity;
	
	
	
	Book(String title, String authorsFirstName, String authorsLastName,
			String authorsCity) {

		setTitle(title);
		setAuthorsFirstName(authorsFirstName);
		setAuthorsLastName(authorsLastName);
		setAuthorsCity(authorsCity);
	}

	@Override
	public double calculatePrice() {
		return getAuthorsFirstName().length() + getAuthorsLastName().length();
	}

	@Override
	public String toString() {
		return "title: " + getTitle() + String.format(" price: %.2f", calculatePrice()) +
				"\nauthors name: " +getAuthorsFirstName() + " " + getAuthorsLastName() +
				"\nauthors city: " + getAuthorsCity() + "\n";
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

}

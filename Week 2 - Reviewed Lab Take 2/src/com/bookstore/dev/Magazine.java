package com.bookstore.dev;

class Magazine implements BookInfo, PublisherInfo{

	private String title;
	private String authorsFirstName;
	private String authorsLastName;
	private String authorsCity;
	private String publishersName;
	private String publishersAddress;
	
	Magazine(String title, String authorsFirstName, String authorsLastName,
			String authorsCity, String publishersName, String publishersAddress) {

		setTitle(title);
		setAuthorsFirstName(authorsFirstName);
		setAuthorsLastName(authorsLastName);
		setAuthorsCity(authorsCity);
		setPublishersName(publishersName);
		setPublishersAddress(publishersAddress);
	}

	@Override
	public double calculatePrice() {
		return (getAuthorsFirstName().length() + getAuthorsLastName().length()) * 12.00;
	}

	@Override
	public String toString() {
		return "title: " + getTitle() + String.format(" price: %.2f", calculatePrice()) +
				"\nauthors name: " +getAuthorsFirstName() + " " + getAuthorsLastName() +
				"\nauthors city: " + getAuthorsCity() +
				"\npublishers name: " + getPublishersName() + " publishers address: " + getPublishersAddress() +
				"\n";
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

	private void setPublishersName(String publishersName) {
		this.publishersName = publishersName;
	}

	@Override
	public String getPublishersName() {
		return publishersName;
	}

	private void setPublishersAddress(String publishersAddress) {
		this.publishersAddress = publishersAddress;
	}

	@Override
	public String getPublishersAddress() {
		return publishersAddress;
	}

}

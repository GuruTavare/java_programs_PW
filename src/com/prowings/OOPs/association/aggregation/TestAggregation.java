package com.prowings.OOPs.association.aggregation;

public class TestAggregation {
	public static void main(String[] args) {

		Book book1 = new Book("Complete Java", "James Goseling", "Programming");
		Book book2 = new Book("Two States", "Chetan Bhagat", "Fiction");
		Book book3 = new Book("Maths Hands On", "ABC", "Education");

		Library library = new Library("MyLibrary");

		library.addNewBook(book1);
		library.addNewBook(book2);
		library.addNewBook(book3);
		library.addNewBook(book3);
		library.addNewBook(book3);
		library.addNewBook(book2);

		library.showAllBooks();

	}

}

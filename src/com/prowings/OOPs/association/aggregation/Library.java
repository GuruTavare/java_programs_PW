package com.prowings.OOPs.association.aggregation;

public class Library {

	String name;
	Book[] books;

	public Library() {
		super();
	}

	public Library(String name) {
		super();
		this.name = name;
		this.books = new Book[5]; // 5 is the standard capacity of Library
	}

	public Book[] showAllBooks() {
		for (Book b : books) {
			if (b != null)
				System.out.println("Book Details : TITLE = " + b.getTitle() + " and AUTHER = " + b.getAuther());
		}

		return this.books;
	}

	public Book[] showAllBooksOfGivenAuther(String auther) {
		for (Book b : books) {
			if (b.getAuther().equalsIgnoreCase(auther))
				System.out.println("Book Details : TITLE = " + b.getTitle() + " and AUTHER = " + b.getAuther());
		}

		return this.books;
	}

	public Book[] addNewBook(Book newBook) {
		int counter = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = newBook;
				break;
			} else {

				counter++;
			}
		}
		if (counter == books.length)
			System.out.println("Libraray capacity is full.. can not add new book!!");
		System.out.println("Book added successfully!!!");
		return books;
	}

}

package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Book;
import org.tnsindia.services.BookService;
import org.tnsindia.services.BookService_Impl;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		BookService service=new BookService_Impl();
		
		System.out.println("\nListing book with Specific ID: ");
		System.out.println("Enter the Book ID:");
		int id=sc.nextInt();
		System.out.println("Book with ID "+id+":"+service.getBookId(id));
		
		
		
		
		System.out.println("\nListing book with Specific AUTHOR: ");
		System.out.println("Enter the Book AUTHOR:");
		String author=sc.next();
		System.out.println("Book with Specific "+author+":"+service.getAuthorBooks(author));
		
		
		System.out.println("\nListing book with Specific TITLE: ");
		System.out.println("Enter the Book TITLE:");
		String title=sc.next();
		System.out.println("Book with Specific "+title+":"+service.getBookByTitle(title));
	
		
			
		System.out.println("\nListing book with Specific price range: ");
		for(Book book:service.getBookInPriceRange(300.0, 600.0))
		System.out.println(book);
		System.out.println("");	
		
		System.out.println("\nListing all the books: ");
		System.out.println(service.getAllBooks());
		
	}
}

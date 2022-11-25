package org.tnsindia.services;

import java.util.List;

import org.tnsindia.dao.BookDao;
import org.tnsindia.dao.BookDao_Impl;
import org.tnsindia.entities.Book;

public class BookService_Impl implements BookService{
	
	
private BookDao dao;
	

	public BookService_Impl() {
		super();
		dao=new BookDao_Impl();
	}


	@Override
	public Book getBookId(int id) {
		// TODO Auto-generated method stub
		return dao.getBookById(id);
	}


	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}


	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	

	

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}
	
	
	@Override
	public List<Book> getBookInPriceRange(Double low, Double high) {
		// TODO Auto-generated method stub
		return dao.getBookInPriceRange(low, high);
	}


	
}

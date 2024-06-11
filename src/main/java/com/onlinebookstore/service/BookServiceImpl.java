package com.onlinebookstore.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import com.onlinebookstore.dao.BookRepository;
import com.onlinebookstore.entity.Book;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository theBook;

	@Autowired
	DSLContext dsl;
	
	@Override
	@Transactional
	public Set<Book> getAllBooks() {
		
		Set<Book> books = new HashSet<Book>();
		
		books.addAll(dsl.select().from(com.onlinebookstore.model.tables.Book.BOOK).fetchInto(Book.class));
		
		return books;
	}

	@Override
	@Transactional
	public Book getBookById(int bookId) {
		
		Optional<Book> bookOpt = theBook.findById(bookId);
		
		if(bookOpt.isPresent())
			return bookOpt.get();
		
		return null;
	}

	@Override
	@Transactional
	public String updateBook(Book book) {
		theBook.save(book);
		return "Book Updated Successfully!";
	}

	@Override
	@Transactional
	public String removeBookById(int bookId) {
		Optional<Book> bookOpt = theBook.findById(bookId);
		
		if(!bookOpt.isPresent())
			return "Invalid Book ID";
		
		theBook.save(bookOpt.get());
		
		return "Book Deleted Successfully!";
	}

	@Override
	@Transactional
	public String addBook(Book book) {
		
		theBook.save(book);
		
		return "Book Added Successfully!";
	}

	@Override
	@Transactional
	public Set<Book> searchBooks(String search) {
		Set<Book> books = new HashSet<Book>(theBook.searchBooks("%" + search.toLowerCase() + "%"));
		return books;
	}

	@Override
	public String removeBook(Book book) {
		Optional<Book> optBook = theBook.findById(book.getId());
		
		if(optBook.isPresent())
			theBook.delete(optBook.get());
		else
			return "Book Not available in database!";
		
		return "Book Deleted Successfully!";
	}
	
}

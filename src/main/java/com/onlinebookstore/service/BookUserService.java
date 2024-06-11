package com.onlinebookstore.service;

import java.util.Set;

import com.onlinebookstore.entity.Book;
import com.onlinebookstore.entity.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}

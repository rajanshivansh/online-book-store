/*
 * This file is generated by jOOQ.
 */
package com.onlinebookstore.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  name;
    private Double  price;
    private Integer quantity;
    private Integer bookDetailId;

    public Book() {}

    public Book(Book value) {
        this.id = value.id;
        this.name = value.name;
        this.price = value.price;
        this.quantity = value.quantity;
        this.bookDetailId = value.bookDetailId;
    }

    public Book(
        Integer id,
        String  name,
        Double  price,
        Integer quantity,
        Integer bookDetailId
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bookDetailId = bookDetailId;
    }

    /**
     * Getter for <code>onlinebookstore.book.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>onlinebookstore.book.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>onlinebookstore.book.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>onlinebookstore.book.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>onlinebookstore.book.price</code>.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>onlinebookstore.book.price</code>.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Getter for <code>onlinebookstore.book.quantity</code>.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>onlinebookstore.book.quantity</code>.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for <code>onlinebookstore.book.book_detail_id</code>.
     */
    public Integer getBookDetailId() {
        return this.bookDetailId;
    }

    /**
     * Setter for <code>onlinebookstore.book.book_detail_id</code>.
     */
    public void setBookDetailId(Integer bookDetailId) {
        this.bookDetailId = bookDetailId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(price);
        sb.append(", ").append(quantity);
        sb.append(", ").append(bookDetailId);

        sb.append(")");
        return sb.toString();
    }
}

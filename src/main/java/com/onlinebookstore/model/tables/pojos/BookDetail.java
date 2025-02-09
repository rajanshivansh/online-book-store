/*
 * This file is generated by jOOQ.
 */
package com.onlinebookstore.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  detail;
    private Integer sold;
    private String  type;

    public BookDetail() {}

    public BookDetail(BookDetail value) {
        this.id = value.id;
        this.detail = value.detail;
        this.sold = value.sold;
        this.type = value.type;
    }

    public BookDetail(
        Integer id,
        String  detail,
        Integer sold,
        String  type
    ) {
        this.id = id;
        this.detail = detail;
        this.sold = sold;
        this.type = type;
    }

    /**
     * Getter for <code>onlinebookstore.book_detail.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>onlinebookstore.book_detail.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>onlinebookstore.book_detail.detail</code>.
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * Setter for <code>onlinebookstore.book_detail.detail</code>.
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Getter for <code>onlinebookstore.book_detail.sold</code>.
     */
    public Integer getSold() {
        return this.sold;
    }

    /**
     * Setter for <code>onlinebookstore.book_detail.sold</code>.
     */
    public void setSold(Integer sold) {
        this.sold = sold;
    }

    /**
     * Getter for <code>onlinebookstore.book_detail.type</code>.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>onlinebookstore.book_detail.type</code>.
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BookDetail (");

        sb.append(id);
        sb.append(", ").append(detail);
        sb.append(", ").append(sold);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}

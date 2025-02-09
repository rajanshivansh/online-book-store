/*
 * This file is generated by jOOQ.
 */
package com.onlinebookstore.model;


import com.onlinebookstore.model.tables.Authorities;
import com.onlinebookstore.model.tables.Book;
import com.onlinebookstore.model.tables.BookDetail;
import com.onlinebookstore.model.tables.BookUser;
import com.onlinebookstore.model.tables.Customer;
import com.onlinebookstore.model.tables.PurchaseDetail;
import com.onlinebookstore.model.tables.PurchaseHistory;
import com.onlinebookstore.model.tables.ShoppingCart;
import com.onlinebookstore.model.tables.Users;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Onlinebookstore extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>onlinebookstore</code>
     */
    public static final Onlinebookstore ONLINEBOOKSTORE = new Onlinebookstore();

    /**
     * The table <code>onlinebookstore.authorities</code>.
     */
    public final Authorities AUTHORITIES = Authorities.AUTHORITIES;

    /**
     * The table <code>onlinebookstore.book</code>.
     */
    public final Book BOOK = Book.BOOK;

    /**
     * The table <code>onlinebookstore.book_detail</code>.
     */
    public final BookDetail BOOK_DETAIL = BookDetail.BOOK_DETAIL;

    /**
     * The table <code>onlinebookstore.book_user</code>.
     */
    public final BookUser BOOK_USER = BookUser.BOOK_USER;

    /**
     * The table <code>onlinebookstore.customer</code>.
     */
    public final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>onlinebookstore.purchase_detail</code>.
     */
    public final PurchaseDetail PURCHASE_DETAIL = PurchaseDetail.PURCHASE_DETAIL;

    /**
     * The table <code>onlinebookstore.purchase_history</code>.
     */
    public final PurchaseHistory PURCHASE_HISTORY = PurchaseHistory.PURCHASE_HISTORY;

    /**
     * The table <code>onlinebookstore.shopping_cart</code>.
     */
    public final ShoppingCart SHOPPING_CART = ShoppingCart.SHOPPING_CART;

    /**
     * The table <code>onlinebookstore.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Onlinebookstore() {
        super("onlinebookstore", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Authorities.AUTHORITIES,
            Book.BOOK,
            BookDetail.BOOK_DETAIL,
            BookUser.BOOK_USER,
            Customer.CUSTOMER,
            PurchaseDetail.PURCHASE_DETAIL,
            PurchaseHistory.PURCHASE_HISTORY,
            ShoppingCart.SHOPPING_CART,
            Users.USERS);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.onlinebookstore.model.tables.records;


import com.onlinebookstore.model.tables.PurchaseDetail;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PurchaseDetailRecord extends UpdatableRecordImpl<PurchaseDetailRecord> implements Record4<Double, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>onlinebookstore.purchase_detail.price</code>.
     */
    public void setPrice(Double value) {
        set(0, value);
    }

    /**
     * Getter for <code>onlinebookstore.purchase_detail.price</code>.
     */
    public Double getPrice() {
        return (Double) get(0);
    }

    /**
     * Setter for <code>onlinebookstore.purchase_detail.quanitity</code>.
     */
    public void setQuanitity(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>onlinebookstore.purchase_detail.quanitity</code>.
     */
    public Integer getQuanitity() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>onlinebookstore.purchase_detail.book_id</code>.
     */
    public void setBookId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>onlinebookstore.purchase_detail.book_id</code>.
     */
    public Integer getBookId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>onlinebookstore.purchase_detail.purchase_history_id</code>.
     */
    public void setPurchaseHistoryId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>onlinebookstore.purchase_detail.purchase_history_id</code>.
     */
    public String getPurchaseHistoryId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Double, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Double, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Double> field1() {
        return PurchaseDetail.PURCHASE_DETAIL.PRICE;
    }

    @Override
    public Field<Integer> field2() {
        return PurchaseDetail.PURCHASE_DETAIL.QUANITITY;
    }

    @Override
    public Field<Integer> field3() {
        return PurchaseDetail.PURCHASE_DETAIL.BOOK_ID;
    }

    @Override
    public Field<String> field4() {
        return PurchaseDetail.PURCHASE_DETAIL.PURCHASE_HISTORY_ID;
    }

    @Override
    public Double component1() {
        return getPrice();
    }

    @Override
    public Integer component2() {
        return getQuanitity();
    }

    @Override
    public Integer component3() {
        return getBookId();
    }

    @Override
    public String component4() {
        return getPurchaseHistoryId();
    }

    @Override
    public Double value1() {
        return getPrice();
    }

    @Override
    public Integer value2() {
        return getQuanitity();
    }

    @Override
    public Integer value3() {
        return getBookId();
    }

    @Override
    public String value4() {
        return getPurchaseHistoryId();
    }

    @Override
    public PurchaseDetailRecord value1(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public PurchaseDetailRecord value2(Integer value) {
        setQuanitity(value);
        return this;
    }

    @Override
    public PurchaseDetailRecord value3(Integer value) {
        setBookId(value);
        return this;
    }

    @Override
    public PurchaseDetailRecord value4(String value) {
        setPurchaseHistoryId(value);
        return this;
    }

    @Override
    public PurchaseDetailRecord values(Double value1, Integer value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PurchaseDetailRecord
     */
    public PurchaseDetailRecord() {
        super(PurchaseDetail.PURCHASE_DETAIL);
    }

    /**
     * Create a detached, initialised PurchaseDetailRecord
     */
    public PurchaseDetailRecord(Double price, Integer quanitity, Integer bookId, String purchaseHistoryId) {
        super(PurchaseDetail.PURCHASE_DETAIL);

        setPrice(price);
        setQuanitity(quanitity);
        setBookId(bookId);
        setPurchaseHistoryId(purchaseHistoryId);
    }
}

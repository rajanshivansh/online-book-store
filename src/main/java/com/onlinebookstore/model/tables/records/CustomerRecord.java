/*
 * This file is generated by jOOQ.
 */
package com.onlinebookstore.model.tables.records;


import com.onlinebookstore.model.tables.Customer;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record6<String, String, String, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>onlinebookstore.customer.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>onlinebookstore.customer.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>onlinebookstore.customer.address</code>.
     */
    public void setAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>onlinebookstore.customer.address</code>.
     */
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>onlinebookstore.customer.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>onlinebookstore.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>onlinebookstore.customer.first_name</code>.
     */
    public void setFirstName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>onlinebookstore.customer.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>onlinebookstore.customer.last_name</code>.
     */
    public void setLastName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>onlinebookstore.customer.last_name</code>.
     */
    public String getLastName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>onlinebookstore.customer.mob</code>.
     */
    public void setMob(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>onlinebookstore.customer.mob</code>.
     */
    public Long getMob() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Customer.CUSTOMER.ID;
    }

    @Override
    public Field<String> field2() {
        return Customer.CUSTOMER.ADDRESS;
    }

    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.FIRST_NAME;
    }

    @Override
    public Field<String> field5() {
        return Customer.CUSTOMER.LAST_NAME;
    }

    @Override
    public Field<Long> field6() {
        return Customer.CUSTOMER.MOB;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAddress();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getFirstName();
    }

    @Override
    public String component5() {
        return getLastName();
    }

    @Override
    public Long component6() {
        return getMob();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAddress();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getFirstName();
    }

    @Override
    public String value5() {
        return getLastName();
    }

    @Override
    public Long value6() {
        return getMob();
    }

    @Override
    public CustomerRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public CustomerRecord value2(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CustomerRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public CustomerRecord value4(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public CustomerRecord value5(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public CustomerRecord value6(Long value) {
        setMob(value);
        return this;
    }

    @Override
    public CustomerRecord values(String value1, String value2, String value3, String value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(String id, String address, String email, String firstName, String lastName, Long mob) {
        super(Customer.CUSTOMER);

        setId(id);
        setAddress(address);
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setMob(mob);
    }
}

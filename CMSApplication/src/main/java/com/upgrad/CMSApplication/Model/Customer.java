package com.upgrad.CMSApplication.Model;

public class Customer {
    private int Customer_id;
    private String Customer_First_Name;
    private String Customer_Last_Name;
    private String Customer_Email;

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int customer_id) {
        Customer_id = customer_id;
    }

    public String getCustomer_First_Name() {
        return Customer_First_Name;
    }

    public void setCustomer_First_Name(String customer_First_Name) {
        Customer_First_Name = customer_First_Name;
    }

    public String getCustomer_Last_Name() {
        return Customer_Last_Name;
    }

    public void setCustomer_Last_Name(String customer_Last_Name) {
        Customer_Last_Name = customer_Last_Name;
    }

    public String getCustomer_Email() {
        return Customer_Email;
    }

    public void setCustomer_Email(String customer_Email) {
        Customer_Email = customer_Email;
    }
}

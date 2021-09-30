package com.upgrad.CMSApplication.CustomerService;

import com.upgrad.CMSApplication.Model.Customer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomerService {
    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();
    public Customer addCustomer(Customer customer){
        customer.setCustomer_id(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;
    }
    public List<Customer> getCustomers(){
        return customerList;
    }

    //Read Method
    public Customer getCustomer (int customerId){
        return customerList
                .stream()
                .filter(c -> c.getCustomer_id() == customerId)
                .findFirst()
                .get();
    }

    //Update Method
    public Customer updateCustomer(int customerId, Customer customer){
        customerList
            .stream()
            .forEach(c -> {
                if (c.getCustomer_id() == customerId) {
                    c.setCustomer_First_Name(customer.getCustomer_First_Name());
                    c.setCustomer_Last_Name(customer.getCustomer_Last_Name());
                    c.setCustomer_Email(customer.getCustomer_Email());
                }
            });
        return customerList
                .stream()
                .filter(c -> c.getCustomer_id() == customerId)
                .findFirst()
                .get();
    }

    // Delete Method
}

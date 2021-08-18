package com.company;

public class Account {

    private int moneyInTheBank;
    private Customer customer;

    public int getMoneyInTheBank() {
        return moneyInTheBank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void deposit (int amount){
        if (amount >= 0) {
            moneyInTheBank += amount;
        }
    }
    public void withdraw (int wamount){
        if (wamount >= 0) {
            moneyInTheBank -= wamount;
        }
    }
}

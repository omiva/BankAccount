package com.company;

public class VipCustomer
{
    private String Customer_name, Customer_email;
    private int Credit_limit;

    public VipCustomer()
    {
        System.out.println("empty const");
    }

    public VipCustomer(String Customer_name, String Customer_email, int Credit_limit)
    {
        System.out.println("Constructor with details");
        this.Customer_name=Customer_name;
        this.Customer_email=Customer_email;
        this.Credit_limit=Credit_limit;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public String getCustomer_email() {
        return Customer_email;
    }

    public void setCustomer_email(String customer_email) {
        Customer_email = customer_email;
    }

    public int getCredit_limit() {
        return Credit_limit;
    }

    public void setCredit_limit(int credit_limit) {
        Credit_limit = credit_limit;
    }
}

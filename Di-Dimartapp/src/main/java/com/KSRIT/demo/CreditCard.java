package com.KSRIT.demo;

public class CreditCard implements PaymentProcess {

    @Override
    public String pay(int amt) {
    	
    	
        return "Credit Card Payment Successful";
    }

}

package com.springbootdemo.storespring;

public class OrderService {

    private PaymentService paymentService;

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}

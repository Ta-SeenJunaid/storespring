package com.springbootdemo.storespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorespringApplication.class, args);
        var orderService = new OrderService();
        orderService.setPaymentService(new StripePaymentService());
        orderService.placeOrder();

        var newOrderService = new OrderService();
        newOrderService.setPaymentService(new PayPalPaymentService());
        newOrderService.placeOrder();
	}

}

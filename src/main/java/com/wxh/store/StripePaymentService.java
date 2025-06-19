package com.wxh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.support-currency}")
    private List<String> supportCurrencies;

    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Amount:"+amount);
    }
}

package com.carriesCars.pricingEngine;

import org.joda.money.Money;

public class PricingEngine {
    public Money calculatePrice(Duration duration, Money pricePerMinute) {
        return pricePerMinute.multipliedBy(duration.durationInMinutes());
    }
}

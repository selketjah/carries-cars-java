package com.carriesCars.pricingEngine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class DurationTest {

    @Test
    public void Duration_is_at_least_one_minute() {
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                int lessThan1 = 0;

                Duration duration = Duration.ofMinutes(lessThan1);
            }
        });
    }

    @Test
    public void Converts_from_and_to_text() {
        Duration someDuration = Duration.ofMinutes(3);

        assertEquals(someDuration, Duration.fromString(someDuration.toString()));
    }
}
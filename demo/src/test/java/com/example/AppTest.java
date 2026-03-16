package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        APP app = new APP();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtract() {
        APP app = new APP();
        assertEquals(1, app.subtract(3, 2));
    }
}

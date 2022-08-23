package me.greghopkins.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Kata {
    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }
}

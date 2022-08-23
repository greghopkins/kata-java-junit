package me.greghopkins.kata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CanaryTest {
    @Test
    public void testAdd() {
        assertThat(42, is(equalTo(Integer.sum(19, 23))));
    }
}

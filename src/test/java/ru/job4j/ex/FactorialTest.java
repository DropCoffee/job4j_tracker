package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-4);
                });
        assertThat(exception.getClass()).isEqualTo(IllegalArgumentException.class);
    }

    @Test
    void whenCalc4Then24() {
        int result = new Factorial().calc(4);
        int excepted = 24;
        assertThat(result).isEqualTo(excepted);
    }
}
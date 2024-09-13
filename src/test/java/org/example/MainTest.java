package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void first() {
        assertEquals("fizzbuzz", Main.first(35));
    }

    @Test
    void second() {
        assertEquals("llatsni ekam", Main.second("make install"));
    }

    @Test
    void third() {
        assertEquals(new Pair(5.0, 0.5), Main.third(2, -11, 5));
    }

    @Test
    void fourth() {
        assertEquals(0.6101111104444433, Main.fourth());
    }

    @Test
    void fifth() {
        assertEquals("строка является палиндромом", Main.fifth("парам марап"));
    }
}
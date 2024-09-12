package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void second() {
        assertEquals("llatsni ekam",Main.Second("make install"));
    }

    @Test
    void third() {
        assertEquals("5.0 0.5", Main.Third(2,-11,5));
    }

    @Test
    void fourth() {
        assertEquals(0.6101111104444433, Main.Fourth());
    }

    @Test
    void fifth() {
        assertEquals("строка является палиндромом", Main.Fifth("парам марап"));
    }
}
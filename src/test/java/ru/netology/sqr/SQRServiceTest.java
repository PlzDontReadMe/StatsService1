package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCounterSqrtNumberFromLowRange() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 300;
        int expected = 8;
        int actual = service.shouldCounterSqrtNumberFromSameRange(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCounterSqrtNumberFromHighRange() {
        SQRService service = new SQRService();
        int min = 9000;
        int max = 9801;
        int expected = 5;
        int actual = service.shouldCounterSqrtNumberFromSameRange(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCounterSqrtNumberFromMiddleRange() {
        SQRService service = new SQRService();
        int min = 4000;
        int max = 5000;
        int expected = 7;
        int actual = service.shouldCounterSqrtNumberFromSameRange(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCounterSqrtNumberFromOverHighRange() {
        SQRService service = new SQRService();
        int min = 9802;
        int max = 10000;
        int expected = 0;
        int actual = service.shouldCounterSqrtNumberFromSameRange(min, max);
        assertEquals(expected, actual);
    }
}
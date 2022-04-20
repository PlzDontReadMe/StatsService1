package ru.netology.sqr;

public class SQRService {
    public int shouldCounterSqrtNumberFromSameRange(int min, int max) {
        int counter = 0;
        for (int i = 10; 99 >= i; ++i) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        return counter;
    }
}


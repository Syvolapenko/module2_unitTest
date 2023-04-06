package com.group11;

public class SumCalculator {

    public int sum(int num) {
        int sumNumber = 0;
        if (num <= 0) {
            throw new IllegalArgumentException("Не вірне значення");
        }
        else {
            for (int i = 1; i <= num; i++) {
                sumNumber = sumNumber + i;
            }
        }
        return sumNumber;
    }
}
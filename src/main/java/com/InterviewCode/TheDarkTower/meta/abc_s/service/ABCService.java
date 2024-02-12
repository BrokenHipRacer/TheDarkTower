package com.InterviewCode.TheDarkTower.meta.abc_s.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ABCService {

    //Answer I gave
    public int getSum(int A, int B, int C) {
        return A+B+C;
    }

    //some other options
    public int getSumWastedSpace(int A, int B, int C) {
        int sum = A + B + C;
        return sum;
    }

    public int getSumMoreExpanded(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    // Hey make the values an array
    public int getSumMoreSmall(int... values) {
        return Arrays.stream(values).sum();
    }

}

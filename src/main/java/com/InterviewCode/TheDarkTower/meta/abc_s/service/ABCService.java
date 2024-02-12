package com.InterviewCode.TheDarkTower.meta.abc_s.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ABCService {

    //Answer I gave
    //Big Θ = 3
    public int getSum(int A, int B, int C) {
        return A+B+C;
    }

    //some other options
    //Big Θ = 3
    public int getSumWastedSpace(int A, int B, int C) {
        int sum = A + B + C;
        return sum;
    }

    //Big Θ = values (N)
    public int getSumMoreExpanded(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    // Hey make the values an array
    //Big Θ = values (N)
    public int getSumMoreSmall(int... values) {
        return Arrays.stream(values).sum();
    }

}

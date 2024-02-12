package com.InterviewCode.TheDarkTower.meta.allWrong.services;

import org.springframework.stereotype.Service;

@Service
public class AllWrongService {

    //quick and dirty, could get LONG depending on String C
    public String getWrongAnswers(int N, String C) {
        String inverted = "";
        Character chA = 'A';
        for (int index = 0; index < C.length(); index++) {
            if (chA.equals(C.charAt(index)) ) {
                inverted += "B";
            } else {
                inverted += "A";
            }
        }
        return inverted;
    }

}

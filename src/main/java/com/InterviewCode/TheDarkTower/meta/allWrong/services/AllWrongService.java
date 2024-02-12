package com.InterviewCode.TheDarkTower.meta.allWrong.services;

import org.springframework.stereotype.Service;

@Service
public class AllWrongService {

    //quick and dirty, could get LONG depending on String C
    public String getWrongAnswers(int N, String C) {
        String inverted = "";
        Character chA = 'A';
        // could have used N instead of C.length but why bother
        for (int index = 0; index < C.length(); index++) {
            if (chA.equals(C.charAt(index)) ) {
                inverted += "B";
            } else {
                inverted += "A";
            }
        }
        return inverted;
    }

    // This might not cycle through all the string C
    public String getWrongAnswerIssueWithN(int N, String C) {
        String inverted = "";
        Character chA = 'A';
        // could have used N instead of C.length but why bother
        for (int index = 0; index < N; index++) {
            if (chA.equals(C.charAt(index)) ) {
                inverted += "B";
            } else {
                inverted += "A";
            }
        }
        return inverted;
    }
}

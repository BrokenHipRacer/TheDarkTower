package com.InterviewCode.TheDarkTower.meta.allWrong.services;

import org.springframework.stereotype.Service;

@Service
public class AllWrongService {

    //quick and dirty, could get LONG depending on String C
    //Big Θ = C (N)
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

    //This might not cycle through all the string C
    //Big Θ = N
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

    //What the method signature should be
    //Big Θ = C (N)
    public String getWrongAnswers(String C) {
        //because I don't want to copy it all I will just route to same answer
        return getWrongAnswerIssueWithN(C.length(), C);
    }

    //What if the string isn't only in uppercase?!?
    //Big Θ = C (N)
    public String getWrongAnswersCaseInsensitive(int N, String C) {
        C = C.toUpperCase();
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
}

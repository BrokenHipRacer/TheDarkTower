package com.InterviewCode.TheDarkTower.meta.battleship.services;

import org.springframework.stereotype.Service;

@Service
public class BattleshipService {

    //quick and has a problem that R and/or C could be out of bounds for G
    public double getHitProbability(int R, int C, int[][] G) {
        int targets = 0;
        for (int rowIndex = 0; rowIndex < R; rowIndex++) {
            for (int colIndex = 0; colIndex < C; colIndex++) {
                if (G[rowIndex][colIndex] == 1) {
                    targets++;
                }
            }
        }
        return (double) targets /(R*C);
    }

}

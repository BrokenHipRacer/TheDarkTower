package com.InterviewCode.TheDarkTower.unit.meta;

import com.InterviewCode.TheDarkTower.meta.battleship.services.BattleshipService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BattleshipServiceTest {

    @Autowired
    BattleshipService battleshipService;

    @Test
    public void getHitProbabilitySampleCase1() {
        int R = 2;
        int C = 3;
        int[][] G = new int[2][3];
        G[0][0] = 0;
        G[0][1] = 0;
        G[0][2] = 1;
        G[1][0] = 1;
        G[1][1] = 0;
        G[1][2] = 1;
        assertEquals(battleshipService.getHitProbability(R,C,G), 0.50000000);
    }

    @Test
    public void getHitProbabilitySampleCase2() {
        int R = 2;
        int C = 2;
        int[][] G = new int[2][2];
        G[0][0] = 1;
        G[0][1] = 1;
        G[1][0] = 1;
        G[1][1] = 1;
        assertEquals(battleshipService.getHitProbability(R,C,G), 1.00000000);
    }
}

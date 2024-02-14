package com.InterviewCode.TheDarkTower.unit.meta;

import com.InterviewCode.TheDarkTower.meta.level_1.cafeteria.services.CafeteriaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CafeteriaServiceTest {

    @Autowired
    CafeteriaService cafeteriaService;

    @Test
    public void getMaxAdditionalDinersCountSampleCase1 () {
        long N = 10L;
        long K = 1L;
        int M = 2;
        long[] S = new long[2];
        S[0] = 2L;
        S[1] = 6L;
        assertEquals(cafeteriaService.getMaxAdditionalDinersCount(N, K, M, S), 3);
    }

    @Test
    public void getMaxAdditionalDinersCountSampleCase2 () {
        long N = 15L;
        long K = 2L;
        int M = 3;
        long[] S = new long[3];
        S[0] = 11L;
        S[1] = 6L;
        S[2] = 14L;
        assertEquals(cafeteriaService.getMaxAdditionalDinersCount(N, K, M, S), 1);
    }
}

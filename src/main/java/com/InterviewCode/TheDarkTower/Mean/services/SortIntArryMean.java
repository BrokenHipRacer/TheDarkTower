package com.InterviewCode.TheDarkTower.Mean.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SortIntArryMean {

    SortIntArryMean sortIntArryMean() {
        return null;
    }

    // I know this is not in the big O as the question.
    // The correct answer I have seen is something I didn't understand and I am not copying the answer to my code base.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumNums1 = Arrays.stream(nums1).sum();
        int sumNums2 = Arrays.stream(nums2).sum();
        double avg1 = (double) sumNums1 / nums1.length;
        double avg2 = (double) sumNums2 / nums2.length;
        return (avg1 + avg2) / 2;
    }
}

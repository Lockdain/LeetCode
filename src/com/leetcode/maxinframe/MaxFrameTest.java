package com.leetcode.maxinframe;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

class MaxFrameTest {

    @Test
    void findMax() {
    }

    @Test
    void max() {
        assertTrue(MaxFrame.max(1, 2, 3) == 3);
        assertTrue(MaxFrame.max(0, 5, 2) == 5);
        assertTrue(MaxFrame.max(-5, -12, 3) == 3);
        assertTrue(MaxFrame.max(0, 0, 0) == 0);
    }
}
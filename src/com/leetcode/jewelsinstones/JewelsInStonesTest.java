package com.leetcode.jewelsinstones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsInStonesTest {

    @Test
    void numJewelsInStones() {
        assertTrue(3 == JewelsInStones.numJewelsInStones("aA", "aAAbbbb"));
        assertTrue(0 == JewelsInStones.numJewelsInStones("z", "ZZ"));
    }
}
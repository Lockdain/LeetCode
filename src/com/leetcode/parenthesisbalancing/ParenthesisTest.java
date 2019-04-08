package com.leetcode.parenthesisbalancing;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisTest {

    @org.junit.jupiter.api.Test
    void isBalanced() {
        assertTrue( Parenthesis.isBalanced("()"));
        assertTrue( Parenthesis.isBalanced("(())"));
        assertTrue( Parenthesis.isBalanced("((()))"));
        assertTrue( Parenthesis.isBalanced("()()()()(())"));
        assertTrue( Parenthesis.isBalanced("{()}{}[][()]"));
        assertTrue( Parenthesis.isBalanced("[[]][(())]"));

        assertFalse( Parenthesis.isBalanced("[)"));
        assertFalse( Parenthesis.isBalanced("[[]][[[(())]"));
        assertFalse( Parenthesis.isBalanced("]]"));
        assertFalse( Parenthesis.isBalanced("((}]"));
        assertFalse( Parenthesis.isBalanced("(((]]]]"));
        assertFalse( Parenthesis.isBalanced("(((]}{]]]"));
    }
}
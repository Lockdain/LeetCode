package com.leetcode.tasks.SortColors.Parenthesis;

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
    }
}
package com.leetcode.parenthesisbalancing;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

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
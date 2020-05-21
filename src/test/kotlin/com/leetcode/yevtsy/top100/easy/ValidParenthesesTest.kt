package com.leetcode.yevtsy.top100.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidParenthesesTest {

    val instance: ValidParentheses = ValidParentheses()

    @Test
    internal fun testValidParentheses() {
        assertTrue { instance.isValid("()") }

        assertTrue { instance.isValid("()[]{}") }

        assertFalse { instance.isValid("(]") }

        assertFalse { instance.isValid("([)]") }

        assertTrue { instance.isValid("{[]}") }

        assertTrue { instance.isValid("(((((())))))") }

        assertTrue { instance.isValid("()()()()") }

        assertTrue { instance.isValid("((()(())))") }

        assertFalse { instance.isValid("(((((((()") }
    }
}
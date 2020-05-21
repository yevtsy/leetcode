package com.leetcode.yevtsy.top100.easy

import java.util.*

class ValidParentheses {

    //  Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
    //  Determine if the input string is valid.

    fun isValid(s: String): Boolean {
        if (s.isBlank()) {
            return true
        }

        if (s.length % 2 == 1) {
            return false
        }

        val brackets: Map<Char, Char> = mapOf('(' to ')', '{' to '}', '[' to ']')

        val stack = Stack<Char>()

        for (bracket in s.toCharArray()) {
            if (brackets.keys.contains(bracket)) {
                stack.push(bracket)
            } else if (stack.empty()) {
                return false
            } else {
                val openBracket = stack.pop()
                if (bracket.compareTo(brackets[openBracket]!!) != 0)
                    return false
            }
        }

        return stack.isEmpty()
    }
}